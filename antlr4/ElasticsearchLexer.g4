lexer grammar ElasticsearchLexer;

channels {
	ESQLCOMMENT,
	ERRORCHANNEL
}

@members {
	protected abstract boolean isType(String name);

	protected abstract boolean slashIsRegex();
}

//SKIP
SPACE: [ \t\r\n]+ -> channel(HIDDEN);
SPEC_ESSQL_COMMENT: '/*!' .+? '*/' -> channel(ESQLCOMMENT);
COMMENT_INPUT: '/*' .*? '*/' -> channel(HIDDEN);
LINE_COMMENT: (
		('-- ' | '#') ~[\r\n]* ('\r'? '\n' | EOF)
		| '--' ('\r'? '\n' | EOF)
	) -> channel(HIDDEN);

//KEYWORDS
EXPLAIN: E X P L A I N;
ADD: A D D;
DESCRIBE: D E S C R I B E;
SELECT: S E L E C T;
DELETE: D E L E T E;
INSERT: I N S E R T;
INTO: I N T O;
VALUES: V A L U E S;
TOP: T O P;
UPDATE: U P D A T E;

CREATE: C R E A T E;
TABLE: T A B L E;
IF: I F;
ALTER: A L T E R;
DROP: D R O P;
SET: S E T;

NULL: N U L L;
DISTINCT: D I S T I N C T;

AND: A N D;
OR: O R;
NOT: N O T;
IS: I S;
AS: A S;
LIKE: L I K E;

FUZZY: F U Z Z Y;
PREFIX: P R E F I X;
REGEXP: R E G E X P;
WILDCARD: W I L D C A R D;

RLIKE: R L I K E;
EXISTS: E X I S T S;

TRUE: T R U E;
FALSE: F A L S E;
LIMIT: L I M I T;
TRACK: T R A C K;
TOTAL: T O T A L;

ORDER: O R D E R;
ASC: A S C;
DESC: D E S C;

BEFORE: B E F O R E;
BETWEEN: B E T W E E N;
RANGED: R A N G E D;
GROUP: G R O U P;
AGGREGATE: A G G R E G A T E | A G G S;
ROUTING: R O U T I N G;
PARENT_ID: P A R E N T I D;
HAS_PARENT: H A S UNDERLINE P A R E N T;
HAS_CHILD: H A S UNDERLINE C H I L D;
QUERY: Q U E R Y;
NESTED: N E S T E D;
HIGHLIGHTER: H BOOLNOT;
BY: B Y;
IN: I N;
WHERE: W H E R E;
FROM: F R O M;
HAVING: H A V I N G;
REMOTE: R E M O T E;


//FULL TEXT
DIS_MAX: D I S UNDERLINE M A X;
TIE_BREAKER: T I E UNDERLINE B R E A K E R;

//GEO
DISTANCE: D I S T A N C E;
GEOPOINT: G E O P O I N T;
GEOHASH: G E O H A S H;

POINT: P O I N T;
LINESTRING: L I N E S T R I N G;
POLYGON: P O L Y G O N;
MULTIPOINT: M U L T I P O I N T;
MULTILINESTRING: M U L T I L I N E S T R I N G;
MULTIPOLYGON: M U L T I P O L Y G O N;
GEOMETRYCOLLECTION: G E O M E T R Y C O L L E C T I O N;
ENVELOPE: E N V E L O P E;
CIRCLE: C I R C L E;
SHAPED: S H A P E D;

//GEO RELATION
INTERSECTS: I N T E R S E  C T S;
DISJOINT: D I S J O I  N T;
WITHIN: W I T H I N;
CONTAINS: C O N T A I N S;

//FUNCTIONS

// SCORE
FUNCTION_SCORE: F U N C T I O N UNDERLINE S C O R E | F U N C UNDERLINE S C O R E;
CONSTANT_SCORE: C O N S T A N T UNDERLINE S C O R E | C O N S T UNDERLINE S C O R E;

//GROUP BY FUNCTION

COUNT: C O U N T;


VAR_ASSIGN: ':=';
PLUS_ASSIGN: '+=';
MINUS_ASSIGN: '-=';
MULT_ASSIGN: '*=';
DIV_ASSIGN: '/=';
MOD_ASSIGN: '%=';
AND_ASSIGN: '&=';
XOR_ASSIGN: '^=';
OR_ASSIGN: '|=';
ALSH: '<<=';
ARSH: '>>=';
AUSH: '>>>=';

//ARITHMETICS

STAR: '*';
MUL: STAR;
DIVIDE: '/';
MODULE: '%';
PLUS: '+';
INCR: '++';
DECR: '--';
MINUS: '-';
DIV: D I V | DIVIDE;
MOD: M O D | MODULE;
POUND: '#';
COND: '?';

//COMPARATION

EQ: '=';
// ~= -> match
AEQ: '~=';
NAEQ: '!~=';
// ~== -> match_phrase
TEQ: '~==';
NTEQ: '!~==';
// ~=== -> match_phrase_prefix
MPPEQ: '~===';
NMPPEQ: '!~===';
EQEQ: '==';
NE: '!=';
GT: '>';
GTE: '>=';
LT: '<';
LTE: '<=';
BOOLNOT: '!';

//BIT
BWNOT: '~';
BWOR: '|';
BOOLOR: '||';
BWAND: '&';
BOOLAND: '&&';
XOR: '^';
ARROW: '->';

LSH: '<<';
RSH: '>>';
USH: '>>>';

//CONSTRUCTORS

DOT: '.' -> mode(AFTER_DOT);
NSDOT: '?.' -> mode(AFTER_DOT);
LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
LBRACKET: '[';
RBRACKET: ']';
COMMA: ',';
SEMI: ';';
AT_SIGN: '@';
SINGLE_QUOTE: '\'';
DOUBLE_QUOTE: '"';
REVERSE_QUOTE: '`';
COLON: ':';
UNDERLINE: '_';

INT: MINUS? DEC_DIGIT+;
FLOAT: MINUS? DEC_DIGIT+ DOT DEC_DIGIT+ | MINUS? DOT DEC_DIGIT+;

DOT_ID: DOT ID_LITERAL;
ID:
	DOT? ID_LETTER (ID_LETTER | DEC_DIGIT | MINUS | STAR | DOT)*;

OCTAL: '0' [0-7]+ [lL]?;
HEX: '0' [xX] [0-9a-fA-F]+ [lL]?;
INTEGER: ( '0' | [1-9] [0-9]*) [lLfFdD]?;
DECIMAL: ('0' | [1-9] [0-9]*) (DOT [0-9]+)? ([eE] [+\-]? [0-9]+)? [fFdD]?;

STRING: DQUOTA_STRING | SQUOTA_STRING | BQUOTA_STRING;
REGEX:
	'/' ('\\' ~'\n' | ~('/' | '\n'))+? '/' [cilmsUux]* { slashIsRegex() }?;

fragment HEX_DIGIT: [0-9A-Fa-f];
fragment DEC_DIGIT: [0-9];
fragment ID_LITERAL: [A-Z_$0-9]*? [A-Z_$]+? [A-Z_$0-9]*;
fragment DQUOTA_STRING:
	'"' ('\\' . | '""' | ~('"' | '\\'))* '"';
fragment SQUOTA_STRING:
	'\'' ('\\' . | '\'\'' | ~('\'' | '\\'))* '\'';
fragment BQUOTA_STRING:
	'`' ('\\' . | '``' | ~('`' | '\\'))* '`';
fragment BIT_STRING_L: 'B' '\'' [01]+ '\'';

fragment ID_LETTER: [a-zA-Z]| UNDERLINE;
fragment A: [aA];
fragment B: [bB];
fragment C: [cC];
fragment D: [dD];
fragment E: [eE];
fragment F: [fF];
fragment G: [gG];
fragment H: [hH];
fragment I: [iI];
fragment J: [jJ];
fragment K: [kK];
fragment L: [lL];
fragment M: [mM];
fragment N: [nN];
fragment O: [oO];
fragment P: [pP];
fragment Q: [qQ];
fragment R: [rR];
fragment S: [sS];
fragment T: [tT];
fragment U: [uU];
fragment V: [vV];
fragment W: [wW];
fragment X: [xX];
fragment Y: [yY];
fragment Z: [zZ];

mode AFTER_DOT;

DOTINTEGER: ( '0' | [1-9] [0-9]*) -> mode(DEFAULT_MODE);
DOTID: [_a-zA-Z] [_a-zA-Z0-9]* -> mode(DEFAULT_MODE);