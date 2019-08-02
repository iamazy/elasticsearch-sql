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
	) SEMI? EOF;

//OPERATIONS
selectOperation:
	SELECT fieldList FROM tableRef (COMMA tableRef)* (
		whereClause
	)? (routingClause)? (groupClause | aggregateClause)? (
		orderClause
	)? (limitClause)?;

descOperation: DESCRIBE tableRef (DIVIDE identity)?;

deleteOperation: DELETE FROM tableRef (COMMA tableRef)* whereClause? routingClause?;

updateOperation:
	UPDATE tableRef SET ID EQ identity (COMMA ID EQ identity)* whereClause? routingClause?;

insertOperation:
	INSERT INTO tableRef (
		LPAREN identity (COMMA identity)* RPAREN
	)? VALUES LPAREN identity (COMMA identity)* RPAREN routingClause?;

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
	| highlighter = HIGHLIGHTER? field = ID									# fieldName;

identity: ID | number = ( INT | FLOAT ) | str = STRING;

expression:
	LPAREN expression RPAREN															# lrExpr
	| leftExpr = expression operator = (MUL | DIV | MOD) rightExpr = expression				# binary
	| leftExpr = expression operator = (PLUS | MINUS) rightExpr = expression				# binary
	| leftExpr = expression operator = (LSH | RSH | USH) rightExpr = expression				# binary
	| leftExpr = expression operator = (LT | LTE | GT | GTE) rightExpr = expression			# binary
	| leftExpr = expression operator = (EQ | NE | AEQ) rightExpr = expression				# binary
	| leftExpr = expression operator = (AND | BOOLAND) rightExpr = expression				# binary
	| leftExpr = expression operator = (OR | BOOLOR) rightExpr = expression					# binary
	| expr = identity BETWEEN left = identity AND right = identity							# betweenAnd
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
;

collection: LPAREN identity? ( COMMA identity)* RPAREN;

likeClause: field = name not = NOT? LIKE pattern = STRING;

isClause: field = name IS not = NOT? NULL;

inClause: left = identity NOT? IN right = inRightOperandList;

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

hasParentClause:
	HAS_PARENT LPAREN type = name COMMA query = expression RPAREN;

hasChildClause:
	HAS_CHILD LPAREN type = name COMMA query = expression RPAREN;

nestedClause:
	LBRACKET nestedPath = identity COMMA query = expression RBRACKET;

whereClause: WHERE expression;

groupClause: GROUP BY name ( COMMA name)*;

aggregateClause:
	AGGREGATE BY aggregateItemClause nestedAggregateClause?;

aggregateItemClause: ID collection (COMMA ID collection)*;

nestedAggregateClause:
	GT LPAREN aggregateItemClause nestedAggregateClause? RPAREN;

routingClause: ROUTING BY STRING ( COMMA STRING)*;

orderClause: ORDER BY order ( COMMA order)*;

order: name type = ( ASC | DESC)?;

limitClause: LIMIT ( offset = INT COMMA)? size = INT;

//Geo Clause

geoClause: geoDistanceClause | geoBoundingBoxClause;

geoDistanceClause:
	name EQ field = STRING AND (GEOPOINT | GEOHASH) EQ coordinate = STRING AND DISTANCE EQ distance
		= STRING;

geoBoundingBoxClause:
	name EQ field = STRING AND TOP_LEFT EQ leftTop = STRING AND BOTTOM_RIGHT EQ rightBottom = STRING
		;