package io.github.iamazy.elasticsearch.dsl.elastic;

import org.elasticsearch.search.fetch.subphase.highlight.HighlightBuilder;

import java.util.Set;

/**
 * @author iamazy
 * @date 2019/7/26
 **/
public class HighlightBuilders {

    public static HighlightBuilder highlighter(Set<String> highlighter) {
        HighlightBuilder highlightBuilder = new HighlightBuilder().requireFieldMatch(false);
        for (String field : highlighter) {
            highlightBuilder.field(field, 500, 0);
        }
        highlightBuilder.preTags("<span style=\"color:red\">");
        highlightBuilder.postTags("</span>");
        return highlightBuilder;
    }
}
