parser grammar ElasticsearchParser;

options {
	tokenVocab = ElasticsearchLexer;
}

sql: (
		selectOperation
		| deleteOperation
		| descOperation
		| updateOperation
		| insertOperation
		| reindexOperation
	) SEMI? EOF;

//OPERATIONS
selectOperation:
	SELECT fieldList FROM tableRef (COMMA tableRef)* ((whereClause functionScoreClause?) | disMaxClause)? routingClause? (groupByClause | aggregateByClause)? orderClause? limitClause? trackTotalClause?;

descOperation: DESCRIBE tableRef (DIVIDE identity)?;

deleteOperation: DELETE FROM tableRef (COMMA tableRef)* whereClause? routingClause? limitClause? ;

updateOperation:
	UPDATE tableRef SET ID EQ identity (COMMA ID EQ identity)* whereClause? routingClause? ;

insertOperation:
	INSERT INTO tableRef (
		LPAREN identity (COMMA identity)* RPAREN
	) VALUES LPAREN identity (COMMA identity)* RPAREN routingClause?;

reindexOperation:
	INSERT INTO tableRef SELECT fieldList FROM tableRef (COMMA tableRef)* whereClause? limitClause? ( REMOTE EQ LPAREN host = STRING ( COMMA user = STRING COMMA password = STRING )? RPAREN )?
;

fieldList: STAR | ( nameOperand ( COMMA nameOperand)*);

nameOperand: //^field,field
	exclude = XOR? fieldName = name (
		AS alias = ID
	)?;

name:
	LPAREN name RPAREN														# lrName
	| DISTINCT fieldName = name												# distinctName
	| left = name op = (STAR | DIVIDE | MOD | PLUS | MINUS) right = name	# binaryName
	| functionName = ID params = collection									# functionName
	| highlighter = HIGHLIGHTER? field = ID									# fieldName
	| groupByFunctionClause                                                 # groupByFunctionName
;

identity: ID | number = ( INT | FLOAT ) | str = STRING;

expression:
	LPAREN expression RPAREN															# lrExpr
	| leftExpr = expression operator = (MUL | DIV | MOD) rightExpr = expression				# binary
	| leftExpr = expression operator = (PLUS | MINUS) rightExpr = expression				# binary
	| leftExpr = expression operator = (LSH | RSH | USH) rightExpr = expression				# binary
	| leftExpr = expression operator = (LT | LTE | GT | GTE) rightExpr = expression			# binary
	| leftExpr = expression operator = (EQ | NE | AEQ | NAEQ | TEQ | NTEQ| MPPEQ| NMPPEQ) rightExpr = expression				# binary
	| leftExpr = expression operator = AND rightExpr = expression				# binary
	| leftExpr = expression operator = OR rightExpr = expression					# binary
	| expr = name BETWEEN left = identity AND right = identity							# betweenAnd
	| rangeClause #betweenAnd
	| leftExpr = expression operator = XOR rightExpr = expression							# binary
	| leftExpr = expression operator = BWOR rightExpr = expression							# binary
	| <assoc = right> expr = expression COND leftExpr = expression COLON rightExpr = expression	# conditional
	| inClause																			# in
	| name																				# nameExpr
	| identity																			# primitive
	| hasChildClause																	# join
	| hasParentClause																	# join
	| isClause																			# binary
	| nestedClause																		# nested
	| likeClause																		# binary
	| geoClause																			# geo
	| fullTextClause																	# fullText
	| notClause 															            # binary
;

rangeClause:
    field = name RANGED IN (LPAREN|LBRACKET) left = rangeItemClause COMMA right = rangeItemClause (RPAREN|RBRACKET)
;

rangeItemClause:
    STRING|INT|FLOAT
;

collection: LPAREN identity? ( COMMA identity)* RPAREN;

likeClause: field = name not = NOT? funName=(FUZZY|PREFIX|REGEXP|WILDCARD)* LIKE pattern = STRING;

notClause:
    NOT expression
;

isClause: field = name IS not = NOT? NULL;

inClause: left = name NOT? IN right = inRightOperandList;

inRightOperandList:
	inRightOperand
	| LPAREN inRightOperand (COMMA inRightOperand)* RPAREN;

inRightOperand:
	identity # constLiteral
	| left = inRightOperand op = (
		STAR
		| DIV
		| MOD
		| PLUS
		| MINUS
	) right = inRightOperand # arithmeticLiteral;

tableRef: indexName = ID ( AS alias = ID)?;

fullTextClause: queryStringClause|multiMatchClause;

queryStringClause: QUERY BY STRING;

multiMatchClause:
	LPAREN name (COMMA name)*  RPAREN AEQ value = STRING
;

hasParentClause:
	HAS_PARENT LPAREN type = name COMMA query = expression RPAREN;

hasChildClause:
	HAS_CHILD LPAREN type = name COMMA query = expression RPAREN;

nestedClause:
	LBRACKET nestedPath = ID COMMA query = expression RBRACKET;

whereClause: WHERE expression;

groupByClause: GROUP BY ID ( COMMA ID)* havingClause?;

havingClause: HAVING havingExpression;

havingExpression:
    LPAREN havingExpression RPAREN															# lrHavingExpr
    | leftExpr = havingExpression operator = AND rightExpr = havingExpression				# havingBinary
    | leftExpr = havingExpression operator = OR rightExpr = havingExpression			    # havingBinary
    | leftExpr = havingExpression operator = (LT | LTE | GT | GTE | EQ) rightExpr = havingExpression			# havingBinary
    | identity																			    # havingPrimitive
    | funcName = ID collection                                                              # functionExpr
;

aggregateByClause:
	AGGREGATE BY aggregationClause;

aggregationClause: aggregateItemClause | nestedAggregationClause ;

nestedAggregationClause:
	LBRACKET nestedPath = ID COMMA  aggregationClause RBRACKET ((COMMA aggregationClause)| subAggregationClause)*
;

subAggregationClause: GT LPAREN aggregationClause RPAREN;

aggregateItemClause: ID collection ((COMMA aggregationClause)| subAggregationClause)*;

//compositeAggregationClause:
//    LIMIT INT AFTER ID EQ identity (COMMA ID EQ identity)*
//;

routingClause: ROUTING BY STRING ( COMMA STRING)*;

orderClause: ORDER BY order ( COMMA order)*;

order: name (ASC|DESC)?;

limitClause: LIMIT ( offset = INT COMMA)? size = INT;

trackTotalClause:
    TRACK TOTAL
;

//Geo Clause
geoClause: geoDistanceClause | geoBoundingBoxClause|geoPolygonClause|geoShapeClause|geoJsonShapeClause;

geoDistanceClause:
	ID EQ coordinate = point AND DISTANCE EQ distance = STRING;

geoBoundingBoxClause:
	field = ID BETWEEN leftTop = point AND rightBottom = point ;

geoPolygonClause:
    ID IN LBRACKET point (COMMA point)* RBRACKET
;

point:
    LBRACKET (lon =(INT|FLOAT) COMMA lat= (INT|FLOAT)) RBRACKET
;

//multiPoint、LineString、Envelope
points:
    LBRACKET point (COMMA point)* RBRACKET
;

//multiLine、Polygon
polygon:
    LBRACKET points (COMMA points)* RBRACKET
;

multiPolygon:
    LBRACKET polygon (COMMA polygon)* RBRACKET
;

geoShapeClause:
    field=ID relation =(INTERSECTS|DISJOINT|WITHIN|CONTAINS) (point|points|polygon|multiPolygon) SHAPED AS shape = (POINT|MULTIPOINT|LINESTRING|ENVELOPE|MULTILINESTRING|POLYGON|MULTIPOLYGON)
;

geoJsonShapeClause:
    field = ID relation =(INTERSECTS|DISJOINT|WITHIN|CONTAINS) geojson = STRING
;

geometryCollectionClause:
;


//Score Clause
functionScoreClause:
 	FUNCTION_SCORE expression (BOOLAND expression)*
;

disMaxClause:
	DIS_MAX expression (BOOLOR expression)* (AND TIE_BREAKER EQ tieBreaker = FLOAT)?
;

//GroupByFunction
groupByFunctionClause:
    count
;

count:COUNT LPAREN DISTINCT? field=ID (COMMA size=INT)? RPAREN;