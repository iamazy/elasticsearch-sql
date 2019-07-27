// Generated from E:/workspace/Work/spring-cloud/elasticsql/src/main/resources/antlr4\ElasticsearchParser.g4 by ANTLR 4.7.2
package io.github.iamazy.elasticsearch.dsl.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ElasticsearchParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ElasticsearchParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ElasticsearchParser#sql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql(ElasticsearchParser.SqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElasticsearchParser#selectOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectOperation(ElasticsearchParser.SelectOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElasticsearchParser#descOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescOperation(ElasticsearchParser.DescOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElasticsearchParser#deleteOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteOperation(ElasticsearchParser.DeleteOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElasticsearchParser#updateOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateOperation(ElasticsearchParser.UpdateOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElasticsearchParser#insertOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertOperation(ElasticsearchParser.InsertOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElasticsearchParser#fieldList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldList(ElasticsearchParser.FieldListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElasticsearchParser#nameOperand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameOperand(ElasticsearchParser.NameOperandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fieldName}
	 * labeled alternative in {@link ElasticsearchParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldName(ElasticsearchParser.FieldNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code distinctName}
	 * labeled alternative in {@link ElasticsearchParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistinctName(ElasticsearchParser.DistinctNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionName}
	 * labeled alternative in {@link ElasticsearchParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(ElasticsearchParser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lrName}
	 * labeled alternative in {@link ElasticsearchParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLrName(ElasticsearchParser.LrNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryName}
	 * labeled alternative in {@link ElasticsearchParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryName(ElasticsearchParser.BinaryNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElasticsearchParser#identity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentity(ElasticsearchParser.IdentityContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compare}
	 * labeled alternative in {@link ElasticsearchParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(ElasticsearchParser.CompareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link ElasticsearchParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(ElasticsearchParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conditional}
	 * labeled alternative in {@link ElasticsearchParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(ElasticsearchParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code in}
	 * labeled alternative in {@link ElasticsearchParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn(ElasticsearchParser.InContext ctx);
	/**
	 * Visit a parse tree produced by the {@code like}
	 * labeled alternative in {@link ElasticsearchParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLike(ElasticsearchParser.LikeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lrExpr}
	 * labeled alternative in {@link ElasticsearchParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLrExpr(ElasticsearchParser.LrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code is}
	 * labeled alternative in {@link ElasticsearchParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIs(ElasticsearchParser.IsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nested}
	 * labeled alternative in {@link ElasticsearchParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNested(ElasticsearchParser.NestedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nameExpr}
	 * labeled alternative in {@link ElasticsearchParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameExpr(ElasticsearchParser.NameExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code geo}
	 * labeled alternative in {@link ElasticsearchParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeo(ElasticsearchParser.GeoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hasChild}
	 * labeled alternative in {@link ElasticsearchParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHasChild(ElasticsearchParser.HasChildContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binary}
	 * labeled alternative in {@link ElasticsearchParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinary(ElasticsearchParser.BinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code between}
	 * labeled alternative in {@link ElasticsearchParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetween(ElasticsearchParser.BetweenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hasParent}
	 * labeled alternative in {@link ElasticsearchParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHasParent(ElasticsearchParser.HasParentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElasticsearchParser#collection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollection(ElasticsearchParser.CollectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElasticsearchParser#likeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLikeClause(ElasticsearchParser.LikeClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isOp}
	 * labeled alternative in {@link ElasticsearchParser#isClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsOp(ElasticsearchParser.IsOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isNotOp}
	 * labeled alternative in {@link ElasticsearchParser#isClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsNotOp(ElasticsearchParser.IsNotOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElasticsearchParser#inClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInClause(ElasticsearchParser.InClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inOp}
	 * labeled alternative in {@link ElasticsearchParser#inToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInOp(ElasticsearchParser.InOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notInOp}
	 * labeled alternative in {@link ElasticsearchParser#inToken}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotInOp(ElasticsearchParser.NotInOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElasticsearchParser#inRightOperandList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInRightOperandList(ElasticsearchParser.InRightOperandListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constLiteral}
	 * labeled alternative in {@link ElasticsearchParser#inRightOperand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstLiteral(ElasticsearchParser.ConstLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticLiteral}
	 * labeled alternative in {@link ElasticsearchParser#inRightOperand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticLiteral(ElasticsearchParser.ArithmeticLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElasticsearchParser#tableRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableRef(ElasticsearchParser.TableRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElasticsearchParser#hasParentClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHasParentClause(ElasticsearchParser.HasParentClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElasticsearchParser#hasChildClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHasChildClause(ElasticsearchParser.HasChildClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElasticsearchParser#nestedClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedClause(ElasticsearchParser.NestedClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElasticsearchParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(ElasticsearchParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElasticsearchParser#groupClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupClause(ElasticsearchParser.GroupClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElasticsearchParser#aggregateClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateClause(ElasticsearchParser.AggregateClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElasticsearchParser#aggregateItemClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateItemClause(ElasticsearchParser.AggregateItemClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElasticsearchParser#nestedAggregateClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedAggregateClause(ElasticsearchParser.NestedAggregateClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElasticsearchParser#routingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutingClause(ElasticsearchParser.RoutingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElasticsearchParser#orderClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderClause(ElasticsearchParser.OrderClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElasticsearchParser#order}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder(ElasticsearchParser.OrderContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElasticsearchParser#limitClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitClause(ElasticsearchParser.LimitClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElasticsearchParser#geoClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeoClause(ElasticsearchParser.GeoClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElasticsearchParser#geoDistanceClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeoDistanceClause(ElasticsearchParser.GeoDistanceClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ElasticsearchParser#geoBoundingBoxClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeoBoundingBoxClause(ElasticsearchParser.GeoBoundingBoxClauseContext ctx);
}