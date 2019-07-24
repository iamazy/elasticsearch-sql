parser grammar ElasticsearchParser;

options {
	tokenVocab = ElasticsearchLexer;
}

sql: 
    ( 
        selectOperation 
        | deleteOperation
    ) 
    SEMI? EOF
;

selectOperation:
	SELECT columnList FROM tableRef ( COMMA tableRef)*
    (
        whereClause
    )?
    (
		routingClause
	)?
    (
        groupClause
    )? 
    (
        orderClause
    )? 
    (
        limitClause
    )?
;

deleteOperation: 
    DELETE FROM tableRef 
    (
        whereClause
    )?
;

columnList: 
    nameOperand 
    (
        COMMA nameOperand
    )*
;

nameOperand: //^field,field
	BIT_XOR_OP?
    (
        tableName = ID DOT
    )? 
    columnName = name 
    (
        AS alias = ID
    )?
;

name:
    HIGHLIGHTER?
	LPAREN name RPAREN														# LRName
	| DISTINCT columnName = name											# distinctName
	| left = name op = (STAR | DIVIDE | MOD | PLUS | MINUS) right = name	# BinaryName
	| ID collection															# AggregationName
	| HIGHLIGHTER? identity												    # columnName
;

identity:
	ID			# idElement
	| INT		# intElement
	| FLOAT		# floatElement
	| STRING	# stringElement
;

boolExpr:
	LPAREN boolExpr RPAREN						# lrExpr
	| left = boolExpr EQ right = boolExpr		# eqExpr
    | left = boolExpr AEQ right = boolExpr      # aeqExpr
	| left = boolExpr GT right = boolExpr		# gtExpr
	| left = boolExpr LT right = boolExpr		# ltExpr
	| left = boolExpr GTE right = boolExpr		# gteExpr
	| left = boolExpr LTE right = boolExpr		# lteExpr
	| left = boolExpr BANGEQ right = boolExpr	# notEqExpr
	| left = boolExpr AND right = boolExpr		# andExpr
	| left = boolExpr OR right = boolExpr		# orExpr
	| left = boolExpr BETWEEN right = boolExpr	# betweenExpr
	| inExpr									# boolInExpr
	| name										# nameExpr
	| hasChildClause							# hasChildExpr
	| hasParentClause							# hasParentExpr
    | isClause                                  # isExpr
;


collection: 
    LPAREN identity 
    (
        COMMA identity
    )* 
    RPAREN
;

isClause:
    name IS NOT? NULL
;

inExpr: 
    left = identity inToken right = inRightOperandList
;

inToken: 
    IN # inOp 
    | NOT IN # notOp
;

inRightOperandList:
	inRightOperand
	| LPAREN inRightOperand 
    (
        COMMA inRightOperand
    )* 
    RPAREN
;

inRightOperand:
	identity # constLiteral
	| left = inRightOperand op = 
    (
		STAR
		| DIVIDE
		| MOD
		| PLUS
		| MINUS
	) 
    right = inRightOperand # arithmeticLiteral
;

tableRef: 
    tableName = ID 
    ( 
        AS alias = ID
    )?
;

hasParentClause: 
    HAS_PARENT LPAREN name COMMA boolExpr RPAREN
;

hasChildClause: 
    HAS_CHILD LPAREN name COMMA boolExpr RPAREN
;

nestedClause:

;

whereClause: 
    WHERE boolExpr
;

groupClause: 
    GROUP BY name 
    ( 
        COMMA name
    )*
;

routingClause: 
    ROUTING BY identity
    (
        COMMA identity
    )*
;

orderClause: 
    ORDER BY order 
    (
        COMMA order
    )*
;

order: 
    name type = 
    ( 
        ASC 
        | DESC
    )?
;

limitClause: 
    LIMIT 
    ( 
        offset = INT COMMA
    )? 
    size = INT
;