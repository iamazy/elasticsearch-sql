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
DESCRIBE: D E S C R I B E | DESC;
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
RLIKE: R L I K E;
EXISTS: E X I S T S;

TRUE: T R U E;
FALSE: F A L S E;
LIMIT: L I M I T;

ORDER: O R D E R;
ASC: A S C;
DESC: D E S C;

BEFORE: B E F O R E;
BETWEEN: B E T W E E N;
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


//FULL TEXT

//GEO
DISTANCE: D I S T A N C E;
GEOPOINT: G E O P O I N T;
GEOHASH: G E O H A S H;
TOP_LEFT: T O P UNDERLINE L E F T | L E F T UNDERLINE T O P;
BOTTOM_RIGHT:
	B O T T O M UNDERLINE R I G H T
	| R I G H T UNDERLINE B O T T O M;

//FUNCTIONS

// SCORE
FUNCTION_SCORE: F U N C T I O N UNDERLINE S C O R E | F U N C UNDERLINE S C O R E;
CONSTANT_SCORE: C O N S T A N T UNDERLINE S C O R E | C O N S T UNDERLINE S C O R E;

// //COLLECTION 
// FIRST_VALUE: F I R S T UNDERLINE V A L U E;
// LAST_VALUE: L A S T UNDERLINE V A L U E;

// //MATH 
// POW: P O W;
// ABS: A B S;
// EXP: E X P;
// EXPM1: E X P M '1';
// AVG: A V G;
// COUNT: C O U N T;
// //COUNT(ALL),COUNT(DISTINCT) 
// MAX: M A X;
// MIN: M I N;
// SUM: S U M;
// COS: C O S;
// SIN: S I N;
// TAN: T A N;
// COT: C O T;
// CBRT: C B R T;
// CEIL: C E I L;
// LOG: L O G;
// LOG10: L O G '10';
// FLOOR: F L O O R;
// PI: P I;
// RANDOM: R A N D O M | R A N D;
// ROUND: R O U N D;
// SIGN: S I G N | S I G N U M;
// SQRT: S Q R T;
// TRUNCATE: T R U N C A T E;
// ACOS: A C O S;
// ASIN: A S I N;
// ATAN: A T A N;
// ATAN2: A T A N '2';
// COSH: C O S H;
// SINH: S I N H;
// DEGREES: D E G R E E S;
// RADIANS: R A D I A N S;

//TYPE 
// CAST: C A S T;
// CONVERT: C O N V E R T;

//GROUPING 
// DATE_HISTOGRAM: D A T E UNDERLINE H I S T O G R A M;
// CARDINALITY: C A R D I N A L I T Y;
// TERMS: T E R M S;
// DATE_RANGE: D A T E UNDERLINE R A N G E;
// TOP_HITS: T O P UNDERLINE H I T S;

//STRINGS 
// UPPER: U P P E R;
// LOWER: L O W E R;
// LEN: L E N;
// CONCAT: C O N C A T;
// ASCII: A S C I I;
// CHAR: C H A R;
// BIT_LENGTH: B I T UNDERLINE L E N G T H;
// LCASE: L C A S E;
// LEFT: L E F T;
// LENGTH: L E N G T H | LEN;
// LOCATE: L O C A T E;
// LTRIM: L T R I M;
// OCTET_LENGTH: O C T E T UNDERLINE L E N G T H;
// POSITION: P O S I T I O N;
// REPEAT: R E P E A T;
// REPLACE: R E P L A C E;
// RIGHT: R I G H T;
// RTRIM: R T R I M;
// FSPACE: S P A C E;
// UCASE: U C A S E;
// SUBSTRING: S U B S T R I N G;

//NUMBER 
// HEX: H E X;
// BIN: B I N;

//TIME 
// NOW: N O W;

// FUNCTION_NAME:
// 	FIRST_VALUE
// 	| LAST_VALUE
// 	| POW
// 	| ABS
// 	| EXP
// 	| EXPM1
// 	| AVG
// 	| COUNT
// 	| MAX
// 	| MIN
// 	| SUM
// 	| COS
// 	| SIN
// 	| TAN
// 	| COT
// 	| CBRT
// 	| CEIL
// 	| LOG
// 	| LOG10
// 	| FLOOR
// 	| PI
// 	| RANDOM
// 	| ROUND
// 	| SIGN
// 	| SQRT
// 	| ACOS
// 	| ASIN
// 	| ATAN
// 	| ATAN2
// 	| COSH
// 	| SINH
// 	| DEGREES
// 	| RADIANS
// 	| CAST
// 	| CONVERT
// 	| GEOHASH
// 	| UPPER
// 	| LOWER
// 	| LEN
// 	| CONCAT
// 	| ASCII
// 	| CHAR
// 	| BIT_LENGTH
// 	| LCASE
// 	| LEFT
// 	| LENGTH
// 	| LOCATE
// 	| LTRIM
// 	| OCTET_LENGTH
// 	| POSITION
// 	| REPEAT
// 	| REPLACE
// 	| RIGHT
// 	| RTRIM
// 	| FSPACE
// 	| UCASE
// 	| SUBSTRING
// 	| HEX
// 	| BIN
// 	| NOW;

//OPERATORS
// ASSIGNS

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
// ~== -> match_phrase
TEQ: '~==';
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