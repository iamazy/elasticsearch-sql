package io.github.iamazy.elasticsearch.dsl.doc;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.IoUtil;
import cn.hutool.core.thread.ExecutorBuilder;
import io.github.iamazy.elasticsearch.dsl.doc.entity.Example;
import io.github.iamazy.elasticsearch.dsl.doc.entity.Markdown;
import io.github.iamazy.elasticsearch.dsl.sql.ElasticSql2DslParser;
import io.github.iamazy.elasticsearch.dsl.sql.model.ElasticSqlParseResult;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * 生成的完整文档预览： https://bytesfly.github.io/elasticsearch-sql
 */
public class GenerateDoc {

    // 指定生成的Markdown父目录
    private static final String TARGET_DIR = "/home/wind/proj/bytesfly/elasticsearch-sql-doc/examples";

    public static void main(String[] args) throws Exception {

        // check TARGET_DIR isExist
        if (!FileUtil.isDirectory(TARGET_DIR)) {
            throw new RuntimeException("Please Correctly Set TARGET_DIR !!!");
        }

        // 列出resources/examples下的所有文件
        List<File> exampleFiles = FileUtil.loopFiles("examples");

        ExecutorService executor = ExecutorBuilder.create()
                .setCorePoolSize(Runtime.getRuntime().availableProcessors())
                .build();

        List<Future<Boolean>> futures = new ArrayList<>();

        for (File file : exampleFiles) {
            futures.add(executor.submit(() -> handle(file)));
        }

        // wait finish
        for (Future<Boolean> future : futures) {
            future.get(10L, TimeUnit.MINUTES);
        }

        System.out.println("finish!");

        executor.shutdownNow();
    }

    private static boolean handle(File file) {
        Markdown mardown = load(FileUtil.getReader(file, StandardCharsets.UTF_8), Markdown.class);

        if (!mardown.isEnabled()) {
            return false;
        }

        List<Example> examples = mardown.getExamples();

        for (Example example : examples) {
            String sql = example.getSql();

            ElasticSql2DslParser parser = new ElasticSql2DslParser();
            try {
                // 解析SQL生成DSL
                ElasticSqlParseResult parseResult = parser.parse(sql);

                String dsl = parseResult.toPrettyDsl(parseResult.getSearchRequest());
                example.setDsl(dsl);
            } catch (Exception e) {
                String msg = String.format("parse %s error, example: %s, sql: %s", file.getName(), example.getDescription(), example.getSql());
                System.out.println(msg);
                e.printStackTrace();
                return false;
            }
        }

        // markdown文件内容
        StringBuilder content = new StringBuilder();
        content.append(mardown.getDescription()).append("\n\n");

        // 遍历例子，按照markdown格式生成
        for (Example example : examples) {
            content.append("## ").append(example.getDescription()).append("\n\n");

            content.append("SQL：\n\n")
                    .append("```sql\n")
                    .append(example.getSql())
                    .append("\n")
                    .append("```\n\n");

            content.append("DSL：\n\n")
                    .append("```json\n")
                    .append(example.getDsl())
                    .append("\n")
                    .append("```\n\n");
        }

        // 生成的md文件，比如 aaa.yml生成aaa.md
        File mdFile = FileUtil.file(TARGET_DIR, FileUtil.mainName(file) + ".md");
        FileUtil.writeUtf8String(content.toString(), mdFile);

        return true;
    }

    public static <T> T load(Reader reader, Class<T> type) {
        final Yaml yaml = new Yaml();
        try {
            return yaml.loadAs(reader, type);
        } finally {
            IoUtil.close(reader);
        }
    }
}
