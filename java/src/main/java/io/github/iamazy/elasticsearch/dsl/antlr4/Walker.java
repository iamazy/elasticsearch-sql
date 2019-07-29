package io.github.iamazy.elasticsearch.dsl.antlr4;

import io.github.iamazy.elasticsearch.dsl.sql.exception.ElasticSql2DslException;
import io.github.iamazy.elasticsearch.dsl.sql.model.Location;
import io.github.iamazy.elasticsearch.dsl.sql.node.*;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
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


    public Walker(String sql) {
        this.sql = sql;
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
    public ANode visit(ParseTree tree) {
        return super.visit(tree);
    }

    @Override
    public ANode visitPrimitive(ElasticsearchParser.PrimitiveContext ctx) {
        return super.visitPrimitive(ctx);
    }

    @Override
    public ANode visitSql(ElasticsearchParser.SqlContext ctx) {
        if(ctx.selectOperation()!=null){
            return visitSelectOperation(ctx.selectOperation());
        }
        if(ctx.descOperation()!=null){
            return visitDescOperation(ctx.descOperation());
        }
        if(ctx.deleteOperation()!=null){
            return visitDeleteOperation(ctx.deleteOperation());
        }
        if(ctx.updateOperation()!=null){
            return visitUpdateOperation(ctx.updateOperation());
        }
        if (ctx.insertOperation()!=null){
            return visitInsertOperation(ctx.insertOperation());
        }
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
        List<Field> fieldList = new ArrayList<>(0);
        for (ElasticsearchParser.NameOperandContext nameOperandContext : ctx.nameOperand()) {
            boolean highlighter=false;
            String fieldName;
            if(nameOperandContext.fieldName instanceof ElasticsearchParser.FieldNameContext){
                ElasticsearchParser.FieldNameContext fieldCtx=(ElasticsearchParser.FieldNameContext) nameOperandContext.fieldName;
                if(fieldCtx.highlighter!=null){
                    highlighter=true;
                }
                fieldName=fieldCtx.field.getText();
            }else{
                fieldName=nameOperandContext.fieldName.getText();
            }
            fieldList.add(new Field(location(nameOperandContext),
                    fieldName,
                    nameOperandContext.alias!=null?nameOperandContext.alias.getText():null,
                    nameOperandContext.exclude != null,highlighter));
        }
        return new FieldList(location(ctx),fieldList);
    }

    @Override
    public ANode visitNameOperand(ElasticsearchParser.NameOperandContext ctx) {
        return new Field(location(ctx),ctx.fieldName.getText(),ctx.alias.getText(),ctx.exclude!=null,true);
    }

    @Override
    public ANode visitFieldName(ElasticsearchParser.FieldNameContext ctx) {
        return super.visitFieldName(ctx);
    }

    @Override
    public ANode visitBool(ElasticsearchParser.BoolContext ctx) {

        return super.visitBool(ctx);
    }

    @Override
    public ANode visitConditional(ElasticsearchParser.ConditionalContext ctx) {
        //nothing to do
        return super.visitConditional(ctx);
    }

    @Override
    public ANode visitIn(ElasticsearchParser.InContext ctx) {
        return super.visitIn(ctx);
    }

    private AExpression visitExpression(ElasticsearchParser.ExpressionContext ctx){
        if(ctx instanceof ElasticsearchParser.LrExprContext){
            visitLrExpr((ElasticsearchParser.LrExprContext) ctx);
        }
        if(ctx instanceof ElasticsearchParser.BoolContext){
            visitBool((ElasticsearchParser.BoolContext)ctx);
        }
        if(ctx instanceof ElasticsearchParser.ConditionalContext){
            visitConditional((ElasticsearchParser.ConditionalContext)ctx);
        }
        if(ctx instanceof ElasticsearchParser.InContext){
            visitIn((ElasticsearchParser.InContext)ctx);
        }
        if(ctx instanceof ElasticsearchParser.NestedContext){
            visitNested((ElasticsearchParser.NestedContext)ctx);
        }
        if(ctx instanceof ElasticsearchParser.GeoContext){
            visitGeo((ElasticsearchParser.GeoContext)ctx);
        }
        if(ctx instanceof ElasticsearchParser.NameExprContext){
            visitNameExpr((ElasticsearchParser.NameExprContext)ctx);
        }
        throw new RuntimeException("not support unknown context !!!");
    }

    @Override
    public ANode visitLrExpr(ElasticsearchParser.LrExprContext ctx) {

        return super.visitLrExpr(ctx);
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
    public ANode visitGeo(ElasticsearchParser.GeoContext ctx) {
        return super.visitGeo(ctx);
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
    public ANode visitCollection(ElasticsearchParser.CollectionContext ctx) {
        return super.visitCollection(ctx);
    }

    @Override
    public ANode visitLikeClause(ElasticsearchParser.LikeClauseContext ctx) {
        return super.visitLikeClause(ctx);
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
        return new HasParent(location(ctx),ctx.type.getText(),visitExpression(ctx.query));
    }

    @Override
    public ANode visitHasChildClause(ElasticsearchParser.HasChildClauseContext ctx) {
        return new HasChild(location(ctx),ctx.type.getText(),visitExpression(ctx.query));
    }

    @Override
    public ANode visitNestedClause(ElasticsearchParser.NestedClauseContext ctx) {
        return super.visitNestedClause(ctx);
    }

    @Override
    public ANode visitWhereClause(ElasticsearchParser.WhereClauseContext ctx) {
        if(ctx.expression() instanceof ElasticsearchParser.BoolContext){
            ElasticsearchParser.BoolContext boolCtx=(ElasticsearchParser.BoolContext)ctx.expression();
        }
        return super.visitWhereClause(ctx);
    }

    @Override
    public ANode visitGroupClause(ElasticsearchParser.GroupClauseContext ctx) {
        List<String> fields=new ArrayList<>(0);
        for(ElasticsearchParser.NameContext nameCtx:ctx.name()){
            fields.add(nameCtx.getText());
        }
        return new GroupBy(location(ctx),fields);
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
        for(ElasticsearchParser.IdentityContext identityContext:ctx.identity()){
            routings.add(identityContext.getText());
        }
        return new RoutingBy(location(ctx),routings);
    }

    @Override
    public ANode visitOrderClause(ElasticsearchParser.OrderClauseContext ctx) {

        List<Order> orderList=new ArrayList<>(0);
        for(ElasticsearchParser.OrderContext orderCtx:ctx.order()){
            if (orderCtx.type!=null) {
                orderList.add(new Order(location(orderCtx), orderCtx.name().getText(),orderCtx.type.getText()));
            }else{
                orderList.add(new Order(location(orderCtx), orderCtx.name().getText(),"desc"));
            }
        }

        return new OrderBy(location(ctx),orderList);
    }

    @Override
    public ANode visitOrder(ElasticsearchParser.OrderContext ctx) {
        if(ctx.type!=null){
            return new Order(location(ctx),ctx.name().getText(),ctx.type.getText());
        }
        return new Order(location(ctx),ctx.name().getText(),"desc");
    }

    @Override
    public ANode visitLimitClause(ElasticsearchParser.LimitClauseContext ctx) {
        return new Limit(location(ctx), Integer.parseInt(ctx.offset.getText()), Integer.parseInt(ctx.size.getText()));
    }

    @Override
    public ANode visitGeoClause(ElasticsearchParser.GeoClauseContext ctx) {
        if(ctx.geoBoundingBoxClause()!=null){
            return visitGeoBoundingBoxClause(ctx.geoBoundingBoxClause());
        }
        if(ctx.geoDistanceClause()!=null){
            return visitGeoDistanceClause(ctx.geoDistanceClause());
        }
        return super.visitGeoClause(ctx);
    }

    @Override
    public ANode visitGeoDistanceClause(ElasticsearchParser.GeoDistanceClauseContext ctx) {
        return new GeoDistance(location(ctx),ctx.field.getText(),ctx.coordinate.getText(),ctx.distance.getText());
    }

    @Override
    public ANode visitGeoBoundingBoxClause(ElasticsearchParser.GeoBoundingBoxClauseContext ctx) {
        return new GeoBoundingBox(location(ctx),ctx.field.getText(),ctx.leftTop.getText(),ctx.rightBottom.getText());
    }


    private Location location(ParserRuleContext ctx) {
        return new Location(sql, ctx.getStart().getStartIndex());
    }
}
