package io.github.iamazy.elasticsearch.dsl.antlr4;

import io.github.iamazy.elasticsearch.dsl.sql.node.ANode;


/**
 * @author iamazy
 * @date 2019/7/26
 * @descrition
 **/
public class Walker extends ElasticsearchParserBaseVisitor<ANode> {



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
    public ANode visitIdElement(ElasticsearchParser.IdElementContext ctx) {
        return super.visitIdElement(ctx);
    }

    @Override
    public ANode visitIntElement(ElasticsearchParser.IntElementContext ctx) {
        return super.visitIntElement(ctx);
    }

    @Override
    public ANode visitFloatElement(ElasticsearchParser.FloatElementContext ctx) {
        return super.visitFloatElement(ctx);
    }

    @Override
    public ANode visitStringElement(ElasticsearchParser.StringElementContext ctx) {
        return super.visitStringElement(ctx);
    }

    @Override
    public ANode visitNotEqExpr(ElasticsearchParser.NotEqExprContext ctx) {
        return super.visitNotEqExpr(ctx);
    }

    @Override
    public ANode visitGtExpr(ElasticsearchParser.GtExprContext ctx) {
        return super.visitGtExpr(ctx);
    }

    @Override
    public ANode visitHasParentExpr(ElasticsearchParser.HasParentExprContext ctx) {
        return super.visitHasParentExpr(ctx);
    }

    @Override
    public ANode visitInExpr(ElasticsearchParser.InExprContext ctx) {
        return super.visitInExpr(ctx);
    }

    @Override
    public ANode visitHasChildExpr(ElasticsearchParser.HasChildExprContext ctx) {
        return super.visitHasChildExpr(ctx);
    }

    @Override
    public ANode visitLrExpr(ElasticsearchParser.LrExprContext ctx) {
        return super.visitLrExpr(ctx);
    }

    @Override
    public ANode visitNestedExpr(ElasticsearchParser.NestedExprContext ctx) {
        return super.visitNestedExpr(ctx);
    }

    @Override
    public ANode visitGteExpr(ElasticsearchParser.GteExprContext ctx) {
        return super.visitGteExpr(ctx);
    }

    @Override
    public ANode visitOrExpr(ElasticsearchParser.OrExprContext ctx) {
        return super.visitOrExpr(ctx);
    }

    @Override
    public ANode visitAeqExpr(ElasticsearchParser.AeqExprContext ctx) {
        return super.visitAeqExpr(ctx);
    }

    @Override
    public ANode visitNameExpr(ElasticsearchParser.NameExprContext ctx) {
        return super.visitNameExpr(ctx);
    }

    @Override
    public ANode visitBetweenExpr(ElasticsearchParser.BetweenExprContext ctx) {
        return super.visitBetweenExpr(ctx);
    }

    @Override
    public ANode visitLteExpr(ElasticsearchParser.LteExprContext ctx) {
        return super.visitLteExpr(ctx);
    }

    @Override
    public ANode visitEqExpr(ElasticsearchParser.EqExprContext ctx) {
        return super.visitEqExpr(ctx);
    }

    @Override
    public ANode visitLtExpr(ElasticsearchParser.LtExprContext ctx) {
        return super.visitLtExpr(ctx);
    }

    @Override
    public ANode visitLikeExpr(ElasticsearchParser.LikeExprContext ctx) {
        return super.visitLikeExpr(ctx);
    }

    @Override
    public ANode visitIsExpr(ElasticsearchParser.IsExprContext ctx) {
        return super.visitIsExpr(ctx);
    }

    @Override
    public ANode visitGeoExpr(ElasticsearchParser.GeoExprContext ctx) {
        return super.visitGeoExpr(ctx);
    }

    @Override
    public ANode visitAndExpr(ElasticsearchParser.AndExprContext ctx) {
        return super.visitAndExpr(ctx);
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
    public ANode visitIsOp(ElasticsearchParser.IsOpContext ctx) {
        return super.visitIsOp(ctx);
    }

    @Override
    public ANode visitIsNotOp(ElasticsearchParser.IsNotOpContext ctx) {
        return super.visitIsNotOp(ctx);
    }

    @Override
    public ANode visitInClause(ElasticsearchParser.InClauseContext ctx) {
        return super.visitInClause(ctx);
    }

    @Override
    public ANode visitInOp(ElasticsearchParser.InOpContext ctx) {
        return super.visitInOp(ctx);
    }

    @Override
    public ANode visitNotOp(ElasticsearchParser.NotOpContext ctx) {
        return super.visitNotOp(ctx);
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
}
