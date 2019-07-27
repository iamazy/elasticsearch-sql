// Generated from E:/workspace/Work/spring-cloud/elasticsql/src/main/resources/antlr4\ElasticsearchParser.g4 by ANTLR 4.7.2
package io.github.iamazy.elasticsearch.dsl.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ElasticsearchParser}.
 */
public interface ElasticsearchParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ElasticsearchParser#sql}.
	 * @param ctx the parse tree
	 */
	void enterSql(ElasticsearchParser.SqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElasticsearchParser#sql}.
	 * @param ctx the parse tree
	 */
	void exitSql(ElasticsearchParser.SqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElasticsearchParser#selectOperation}.
	 * @param ctx the parse tree
	 */
	void enterSelectOperation(ElasticsearchParser.SelectOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElasticsearchParser#selectOperation}.
	 * @param ctx the parse tree
	 */
	void exitSelectOperation(ElasticsearchParser.SelectOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElasticsearchParser#descOperation}.
	 * @param ctx the parse tree
	 */
	void enterDescOperation(ElasticsearchParser.DescOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElasticsearchParser#descOperation}.
	 * @param ctx the parse tree
	 */
	void exitDescOperation(ElasticsearchParser.DescOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElasticsearchParser#deleteOperation}.
	 * @param ctx the parse tree
	 */
	void enterDeleteOperation(ElasticsearchParser.DeleteOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElasticsearchParser#deleteOperation}.
	 * @param ctx the parse tree
	 */
	void exitDeleteOperation(ElasticsearchParser.DeleteOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElasticsearchParser#updateOperation}.
	 * @param ctx the parse tree
	 */
	void enterUpdateOperation(ElasticsearchParser.UpdateOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElasticsearchParser#updateOperation}.
	 * @param ctx the parse tree
	 */
	void exitUpdateOperation(ElasticsearchParser.UpdateOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElasticsearchParser#insertOperation}.
	 * @param ctx the parse tree
	 */
	void enterInsertOperation(ElasticsearchParser.InsertOperationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElasticsearchParser#insertOperation}.
	 * @param ctx the parse tree
	 */
	void exitInsertOperation(ElasticsearchParser.InsertOperationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElasticsearchParser#fieldList}.
	 * @param ctx the parse tree
	 */
	void enterFieldList(ElasticsearchParser.FieldListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElasticsearchParser#fieldList}.
	 * @param ctx the parse tree
	 */
	void exitFieldList(ElasticsearchParser.FieldListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElasticsearchParser#nameOperand}.
	 * @param ctx the parse tree
	 */
	void enterNameOperand(ElasticsearchParser.NameOperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElasticsearchParser#nameOperand}.
	 * @param ctx the parse tree
	 */
	void exitNameOperand(ElasticsearchParser.NameOperandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fieldName}
	 * labeled alternative in {@link ElasticsearchParser#name}.
	 * @param ctx the parse tree
	 */
	void enterFieldName(ElasticsearchParser.FieldNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fieldName}
	 * labeled alternative in {@link ElasticsearchParser#name}.
	 * @param ctx the parse tree
	 */
	void exitFieldName(ElasticsearchParser.FieldNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code distinctName}
	 * labeled alternative in {@link ElasticsearchParser#name}.
	 * @param ctx the parse tree
	 */
	void enterDistinctName(ElasticsearchParser.DistinctNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code distinctName}
	 * labeled alternative in {@link ElasticsearchParser#name}.
	 * @param ctx the parse tree
	 */
	void exitDistinctName(ElasticsearchParser.DistinctNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionName}
	 * labeled alternative in {@link ElasticsearchParser#name}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(ElasticsearchParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionName}
	 * labeled alternative in {@link ElasticsearchParser#name}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(ElasticsearchParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lrName}
	 * labeled alternative in {@link ElasticsearchParser#name}.
	 * @param ctx the parse tree
	 */
	void enterLrName(ElasticsearchParser.LrNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lrName}
	 * labeled alternative in {@link ElasticsearchParser#name}.
	 * @param ctx the parse tree
	 */
	void exitLrName(ElasticsearchParser.LrNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryName}
	 * labeled alternative in {@link ElasticsearchParser#name}.
	 * @param ctx the parse tree
	 */
	void enterBinaryName(ElasticsearchParser.BinaryNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryName}
	 * labeled alternative in {@link ElasticsearchParser#name}.
	 * @param ctx the parse tree
	 */
	void exitBinaryName(ElasticsearchParser.BinaryNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElasticsearchParser#identity}.
	 * @param ctx the parse tree
	 */
	void enterIdentity(ElasticsearchParser.IdentityContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElasticsearchParser#identity}.
	 * @param ctx the parse tree
	 */
	void exitIdentity(ElasticsearchParser.IdentityContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compare}
	 * labeled alternative in {@link ElasticsearchParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCompare(ElasticsearchParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compare}
	 * labeled alternative in {@link ElasticsearchParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCompare(ElasticsearchParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bool}
	 * labeled alternative in {@link ElasticsearchParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBool(ElasticsearchParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bool}
	 * labeled alternative in {@link ElasticsearchParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBool(ElasticsearchParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conditional}
	 * labeled alternative in {@link ElasticsearchParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterConditional(ElasticsearchParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conditional}
	 * labeled alternative in {@link ElasticsearchParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitConditional(ElasticsearchParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code in}
	 * labeled alternative in {@link ElasticsearchParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIn(ElasticsearchParser.InContext ctx);
	/**
	 * Exit a parse tree produced by the {@code in}
	 * labeled alternative in {@link ElasticsearchParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIn(ElasticsearchParser.InContext ctx);
	/**
	 * Enter a parse tree produced by the {@code like}
	 * labeled alternative in {@link ElasticsearchParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLike(ElasticsearchParser.LikeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code like}
	 * labeled alternative in {@link ElasticsearchParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLike(ElasticsearchParser.LikeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lrExpr}
	 * labeled alternative in {@link ElasticsearchParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLrExpr(ElasticsearchParser.LrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lrExpr}
	 * labeled alternative in {@link ElasticsearchParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLrExpr(ElasticsearchParser.LrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code is}
	 * labeled alternative in {@link ElasticsearchParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIs(ElasticsearchParser.IsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code is}
	 * labeled alternative in {@link ElasticsearchParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIs(ElasticsearchParser.IsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nested}
	 * labeled alternative in {@link ElasticsearchParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNested(ElasticsearchParser.NestedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nested}
	 * labeled alternative in {@link ElasticsearchParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNested(ElasticsearchParser.NestedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nameExpr}
	 * labeled alternative in {@link ElasticsearchParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNameExpr(ElasticsearchParser.NameExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nameExpr}
	 * labeled alternative in {@link ElasticsearchParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNameExpr(ElasticsearchParser.NameExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code geo}
	 * labeled alternative in {@link ElasticsearchParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGeo(ElasticsearchParser.GeoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code geo}
	 * labeled alternative in {@link ElasticsearchParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGeo(ElasticsearchParser.GeoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hasChild}
	 * labeled alternative in {@link ElasticsearchParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterHasChild(ElasticsearchParser.HasChildContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hasChild}
	 * labeled alternative in {@link ElasticsearchParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitHasChild(ElasticsearchParser.HasChildContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binary}
	 * labeled alternative in {@link ElasticsearchParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBinary(ElasticsearchParser.BinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binary}
	 * labeled alternative in {@link ElasticsearchParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBinary(ElasticsearchParser.BinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code between}
	 * labeled alternative in {@link ElasticsearchParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBetween(ElasticsearchParser.BetweenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code between}
	 * labeled alternative in {@link ElasticsearchParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBetween(ElasticsearchParser.BetweenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hasParent}
	 * labeled alternative in {@link ElasticsearchParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterHasParent(ElasticsearchParser.HasParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hasParent}
	 * labeled alternative in {@link ElasticsearchParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitHasParent(ElasticsearchParser.HasParentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElasticsearchParser#collection}.
	 * @param ctx the parse tree
	 */
	void enterCollection(ElasticsearchParser.CollectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElasticsearchParser#collection}.
	 * @param ctx the parse tree
	 */
	void exitCollection(ElasticsearchParser.CollectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElasticsearchParser#likeClause}.
	 * @param ctx the parse tree
	 */
	void enterLikeClause(ElasticsearchParser.LikeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElasticsearchParser#likeClause}.
	 * @param ctx the parse tree
	 */
	void exitLikeClause(ElasticsearchParser.LikeClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isOp}
	 * labeled alternative in {@link ElasticsearchParser#isClause}.
	 * @param ctx the parse tree
	 */
	void enterIsOp(ElasticsearchParser.IsOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isOp}
	 * labeled alternative in {@link ElasticsearchParser#isClause}.
	 * @param ctx the parse tree
	 */
	void exitIsOp(ElasticsearchParser.IsOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isNotOp}
	 * labeled alternative in {@link ElasticsearchParser#isClause}.
	 * @param ctx the parse tree
	 */
	void enterIsNotOp(ElasticsearchParser.IsNotOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isNotOp}
	 * labeled alternative in {@link ElasticsearchParser#isClause}.
	 * @param ctx the parse tree
	 */
	void exitIsNotOp(ElasticsearchParser.IsNotOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElasticsearchParser#inClause}.
	 * @param ctx the parse tree
	 */
	void enterInClause(ElasticsearchParser.InClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElasticsearchParser#inClause}.
	 * @param ctx the parse tree
	 */
	void exitInClause(ElasticsearchParser.InClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inOp}
	 * labeled alternative in {@link ElasticsearchParser#inToken}.
	 * @param ctx the parse tree
	 */
	void enterInOp(ElasticsearchParser.InOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inOp}
	 * labeled alternative in {@link ElasticsearchParser#inToken}.
	 * @param ctx the parse tree
	 */
	void exitInOp(ElasticsearchParser.InOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notInOp}
	 * labeled alternative in {@link ElasticsearchParser#inToken}.
	 * @param ctx the parse tree
	 */
	void enterNotInOp(ElasticsearchParser.NotInOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notInOp}
	 * labeled alternative in {@link ElasticsearchParser#inToken}.
	 * @param ctx the parse tree
	 */
	void exitNotInOp(ElasticsearchParser.NotInOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElasticsearchParser#inRightOperandList}.
	 * @param ctx the parse tree
	 */
	void enterInRightOperandList(ElasticsearchParser.InRightOperandListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElasticsearchParser#inRightOperandList}.
	 * @param ctx the parse tree
	 */
	void exitInRightOperandList(ElasticsearchParser.InRightOperandListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constLiteral}
	 * labeled alternative in {@link ElasticsearchParser#inRightOperand}.
	 * @param ctx the parse tree
	 */
	void enterConstLiteral(ElasticsearchParser.ConstLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constLiteral}
	 * labeled alternative in {@link ElasticsearchParser#inRightOperand}.
	 * @param ctx the parse tree
	 */
	void exitConstLiteral(ElasticsearchParser.ConstLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticLiteral}
	 * labeled alternative in {@link ElasticsearchParser#inRightOperand}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticLiteral(ElasticsearchParser.ArithmeticLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticLiteral}
	 * labeled alternative in {@link ElasticsearchParser#inRightOperand}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticLiteral(ElasticsearchParser.ArithmeticLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElasticsearchParser#tableRef}.
	 * @param ctx the parse tree
	 */
	void enterTableRef(ElasticsearchParser.TableRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElasticsearchParser#tableRef}.
	 * @param ctx the parse tree
	 */
	void exitTableRef(ElasticsearchParser.TableRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElasticsearchParser#hasParentClause}.
	 * @param ctx the parse tree
	 */
	void enterHasParentClause(ElasticsearchParser.HasParentClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElasticsearchParser#hasParentClause}.
	 * @param ctx the parse tree
	 */
	void exitHasParentClause(ElasticsearchParser.HasParentClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElasticsearchParser#hasChildClause}.
	 * @param ctx the parse tree
	 */
	void enterHasChildClause(ElasticsearchParser.HasChildClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElasticsearchParser#hasChildClause}.
	 * @param ctx the parse tree
	 */
	void exitHasChildClause(ElasticsearchParser.HasChildClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElasticsearchParser#nestedClause}.
	 * @param ctx the parse tree
	 */
	void enterNestedClause(ElasticsearchParser.NestedClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElasticsearchParser#nestedClause}.
	 * @param ctx the parse tree
	 */
	void exitNestedClause(ElasticsearchParser.NestedClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElasticsearchParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(ElasticsearchParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElasticsearchParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(ElasticsearchParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElasticsearchParser#groupClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupClause(ElasticsearchParser.GroupClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElasticsearchParser#groupClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupClause(ElasticsearchParser.GroupClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElasticsearchParser#aggregateClause}.
	 * @param ctx the parse tree
	 */
	void enterAggregateClause(ElasticsearchParser.AggregateClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElasticsearchParser#aggregateClause}.
	 * @param ctx the parse tree
	 */
	void exitAggregateClause(ElasticsearchParser.AggregateClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElasticsearchParser#aggregateItemClause}.
	 * @param ctx the parse tree
	 */
	void enterAggregateItemClause(ElasticsearchParser.AggregateItemClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElasticsearchParser#aggregateItemClause}.
	 * @param ctx the parse tree
	 */
	void exitAggregateItemClause(ElasticsearchParser.AggregateItemClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElasticsearchParser#nestedAggregateClause}.
	 * @param ctx the parse tree
	 */
	void enterNestedAggregateClause(ElasticsearchParser.NestedAggregateClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElasticsearchParser#nestedAggregateClause}.
	 * @param ctx the parse tree
	 */
	void exitNestedAggregateClause(ElasticsearchParser.NestedAggregateClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElasticsearchParser#routingClause}.
	 * @param ctx the parse tree
	 */
	void enterRoutingClause(ElasticsearchParser.RoutingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElasticsearchParser#routingClause}.
	 * @param ctx the parse tree
	 */
	void exitRoutingClause(ElasticsearchParser.RoutingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElasticsearchParser#orderClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderClause(ElasticsearchParser.OrderClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElasticsearchParser#orderClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderClause(ElasticsearchParser.OrderClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElasticsearchParser#order}.
	 * @param ctx the parse tree
	 */
	void enterOrder(ElasticsearchParser.OrderContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElasticsearchParser#order}.
	 * @param ctx the parse tree
	 */
	void exitOrder(ElasticsearchParser.OrderContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElasticsearchParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitClause(ElasticsearchParser.LimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElasticsearchParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitClause(ElasticsearchParser.LimitClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElasticsearchParser#geoClause}.
	 * @param ctx the parse tree
	 */
	void enterGeoClause(ElasticsearchParser.GeoClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElasticsearchParser#geoClause}.
	 * @param ctx the parse tree
	 */
	void exitGeoClause(ElasticsearchParser.GeoClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElasticsearchParser#geoDistanceClause}.
	 * @param ctx the parse tree
	 */
	void enterGeoDistanceClause(ElasticsearchParser.GeoDistanceClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElasticsearchParser#geoDistanceClause}.
	 * @param ctx the parse tree
	 */
	void exitGeoDistanceClause(ElasticsearchParser.GeoDistanceClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ElasticsearchParser#geoBoundingBoxClause}.
	 * @param ctx the parse tree
	 */
	void enterGeoBoundingBoxClause(ElasticsearchParser.GeoBoundingBoxClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ElasticsearchParser#geoBoundingBoxClause}.
	 * @param ctx the parse tree
	 */
	void exitGeoBoundingBoxClause(ElasticsearchParser.GeoBoundingBoxClauseContext ctx);
}