package io.github.iamazy.elasticsearch.dsl.antlr4;

import io.github.iamazy.elasticsearch.dsl.sql.exception.ElasticSql2DslException;
import io.github.iamazy.elasticsearch.dsl.sql.model.ElasticSqlParseResult;
import io.github.iamazy.elasticsearch.dsl.sql.model.Location;
import io.github.iamazy.elasticsearch.dsl.sql.node.ANode;
import io.github.iamazy.elasticsearch.dsl.utils.StringManager;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author iamazy
 * @date 2019/7/26
 * @descrition
 **/
public class Walker extends ElasticsearchParserBaseVisitor<ANode> {

    private final String sql;

    private ElasticSqlParseResult parseResult;

    public Walker(String sql) {
        this.sql = sql;
        parseResult=new ElasticSqlParseResult();
    }

    public ElasticSqlParseResult getParseResult() {
        return parseResult;
    }

    //TODO: set package access to private
    public  ElasticsearchParser.SqlContext buildAntlrTree(){
        if(StringUtils.isBlank(this.sql)){
            throw new ElasticSql2DslException("blank sql is not allowed");
        }
        CharStream stream = CharStreams.fromString(this.sql);
        ElasticsearchLexer lexer=new EnhanceElasticsearchLexer(stream);
        ElasticsearchParser parser=new ElasticsearchParser(new CommonTokenStream(lexer));
        ParserErrorStrategy strategy=new ParserErrorStrategy(this.sql);
        lexer.removeErrorListeners();
        parser.removeErrorListeners();
        parser.setErrorHandler(strategy);
        return parser.sql();
    }

    @Override
    public ANode visitSql(ElasticsearchParser.SqlContext ctx) {
        return super.visitSql(ctx);
    }

    @Override
    public ANode visitSelectOperation(ElasticsearchParser.SelectOperationContext ctx) {
        return super.visitSelectOperation(ctx);
    }

    @Override
    public ANode visitDescOperation(ElasticsearchParser.DescOperationContext ctx) {
        return super.visitDescOperation(ctx);
    }

    @Override
    public ANode visitDeleteOperation(ElasticsearchParser.DeleteOperationContext ctx) {
        return super.visitDeleteOperation(ctx);
    }

    @Override
    public ANode visitUpdateOperation(ElasticsearchParser.UpdateOperationContext ctx) {
        return super.visitUpdateOperation(ctx);
    }

    @Override
    public ANode visitInsertOperation(ElasticsearchParser.InsertOperationContext ctx) {
        return super.visitInsertOperation(ctx);
    }

    @Override
    public ANode visitFieldList(ElasticsearchParser.FieldListContext ctx) {
        return super.visitFieldList(ctx);
    }

    @Override
    public ANode visitNameOperand(ElasticsearchParser.NameOperandContext ctx) {
        return super.visitNameOperand(ctx);
    }

    @Override
    public ANode visitFieldName(ElasticsearchParser.FieldNameContext ctx) {
        return super.visitFieldName(ctx);
    }

    @Override
    public ANode visitDistinctName(ElasticsearchParser.DistinctNameContext ctx) {
        return super.visitDistinctName(ctx);
    }

    @Override
    public ANode visitFunctionName(ElasticsearchParser.FunctionNameContext ctx) {
        return super.visitFunctionName(ctx);
    }

    @Override
    public ANode visitLrName(ElasticsearchParser.LrNameContext ctx) {
        return super.visitLrName(ctx);
    }

    @Override
    public ANode visitBinaryName(ElasticsearchParser.BinaryNameContext ctx) {
        return super.visitBinaryName(ctx);
    }

    @Override
    public ANode visitIdentity(ElasticsearchParser.IdentityContext ctx) {
        return super.visitIdentity(ctx);
    }

    @Override
    public ANode visitGeo(ElasticsearchParser.GeoContext ctx) {
        return super.visitGeo(ctx);
    }

    @Override
    public ANode visitPrimitive(ElasticsearchParser.PrimitiveContext ctx) {
        return super.visitPrimitive(ctx);
    }

    @Override
    public ANode visitConditional(ElasticsearchParser.ConditionalContext ctx) {
        return super.visitConditional(ctx);
    }

    @Override
    public ANode visitIn(ElasticsearchParser.InContext ctx) {
        return super.visitIn(ctx);
    }

    @Override
    public ANode visitBinary(ElasticsearchParser.BinaryContext ctx) {
        return super.visitBinary(ctx);
    }

    @Override
    public ANode visitLrExpr(ElasticsearchParser.LrExprContext ctx) {
        return super.visitLrExpr(ctx);
    }

    @Override
    public ANode visitBetweenAnd(ElasticsearchParser.BetweenAndContext ctx) {
        return super.visitBetweenAnd(ctx);
    }

    @Override
    public ANode visitJoin(ElasticsearchParser.JoinContext ctx) {
        return super.visitJoin(ctx);
    }

    @Override
    public ANode visitNested(ElasticsearchParser.NestedContext ctx) {
        return super.visitNested(ctx);
    }

    @Override
    public ANode visitNameExpr(ElasticsearchParser.NameExprContext ctx) {
        return super.visitNameExpr(ctx);
    }

    @Override
    public ANode visitCollection(ElasticsearchParser.CollectionContext ctx) {
        return super.visitCollection(ctx);
    }

    @Override
    public ANode visitLikeClause(ElasticsearchParser.LikeClauseContext ctx) {
        return super.visitLikeClause(ctx);
    }

    @Override
    public ANode visitIsClause(ElasticsearchParser.IsClauseContext ctx) {
        return super.visitIsClause(ctx);
    }

    @Override
    public ANode visitInClause(ElasticsearchParser.InClauseContext ctx) {
        return super.visitInClause(ctx);
    }

    @Override
    public ANode visitInRightOperandList(ElasticsearchParser.InRightOperandListContext ctx) {
        return super.visitInRightOperandList(ctx);
    }

    @Override
    public ANode visitConstLiteral(ElasticsearchParser.ConstLiteralContext ctx) {
        return super.visitConstLiteral(ctx);
    }

    @Override
    public ANode visitArithmeticLiteral(ElasticsearchParser.ArithmeticLiteralContext ctx) {
        return super.visitArithmeticLiteral(ctx);
    }

    @Override
    public ANode visitTableRef(ElasticsearchParser.TableRefContext ctx) {
        return super.visitTableRef(ctx);
    }

    @Override
    public ANode visitHasParentClause(ElasticsearchParser.HasParentClauseContext ctx) {
        return super.visitHasParentClause(ctx);
    }

    @Override
    public ANode visitHasChildClause(ElasticsearchParser.HasChildClauseContext ctx) {
        return super.visitHasChildClause(ctx);
    }

    @Override
    public ANode visitNestedClause(ElasticsearchParser.NestedClauseContext ctx) {
        return super.visitNestedClause(ctx);
    }

    @Override
    public ANode visitWhereClause(ElasticsearchParser.WhereClauseContext ctx) {
        return super.visitWhereClause(ctx);
    }

    @Override
    public ANode visitGroupClause(ElasticsearchParser.GroupClauseContext ctx) {
        return super.visitGroupClause(ctx);
    }

    @Override
    public ANode visitAggregateClause(ElasticsearchParser.AggregateClauseContext ctx) {
        return super.visitAggregateClause(ctx);
    }

    @Override
    public ANode visitAggregateItemClause(ElasticsearchParser.AggregateItemClauseContext ctx) {
        return super.visitAggregateItemClause(ctx);
    }

    @Override
    public ANode visitNestedAggregateClause(ElasticsearchParser.NestedAggregateClauseContext ctx) {
        return super.visitNestedAggregateClause(ctx);
    }

    @Override
    public ANode visitRoutingClause(ElasticsearchParser.RoutingClauseContext ctx) {
        List<String> routings=new ArrayList<>(0);
        for(TerminalNode routing:ctx.STRING()){
            routings.add(StringManager.removeStringSymbol(routing.getText()));
        }
        return super.visitRoutingClause(ctx);
    }

    @Override
    public ANode visitOrderClause(ElasticsearchParser.OrderClauseContext ctx) {
        return super.visitOrderClause(ctx);
    }

    @Override
    public ANode visitOrder(ElasticsearchParser.OrderContext ctx) {
        return super.visitOrder(ctx);
    }

    @Override
    public ANode visitLimitClause(ElasticsearchParser.LimitClauseContext ctx) {
        return super.visitLimitClause(ctx);
    }

    @Override
    public ANode visitGeoClause(ElasticsearchParser.GeoClauseContext ctx) {
        return super.visitGeoClause(ctx);
    }

    @Override
    public ANode visitGeoDistanceClause(ElasticsearchParser.GeoDistanceClauseContext ctx) {
        return super.visitGeoDistanceClause(ctx);
    }

    @Override
    public ANode visitGeoBoundingBoxClause(ElasticsearchParser.GeoBoundingBoxClauseContext ctx) {
        return super.visitGeoBoundingBoxClause(ctx);
    }

    private Location location(ParserRuleContext ctx) {
        return new Location(sql, ctx.getStart().getStartIndex());
    }
}
