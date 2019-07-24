lexer grammar ElasticsearchLexer;

channels {
	ESQLCOMMENT,
	ERRORCHANNEL
}

//SKIP
SPACE: [\t\r\n]+ -> channel(HIDDEN);
SPEC_ESSQL_COMMENT: '/*!' .+? '*/' -> channel(ESQLCOMMENT);
COMMENT_INPUT: '/*' .*? '*/' -> channel(HIDDEN);
LINE_COMMENT: (
		('-- ' | '#') ~[\r\n]* ('\r'? '\n' | EOF)
		| '--' ('\r'? '\n' | EOF)
	) -> channel(HIDDEN);

//KEYWORDS
EXPLAIN: E X P L A I N;
ADD: A D D;
DESCRIBE: D E S C R I B E| DESC;
SELECT: S E L E C T;
DELETE: D E L E T E;
INSERT: I N S E R T;
UPDATE: U P D A T E;

CREATE: C R E A T E;
ALTER: A L T E R;
DROP: D R O P;
SET: S E T;

NULL: N U L L;
DISTINCT: D I S T I N C T;

AND: A N D;
OR: O R;
XOR: X O R;
NOT : N O T;
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
ROUTING: R O U T I N G;
PARENT_ID: P A R E N T I D;
HAS_PARENT: H A S UNDERLINE P A R E N T;
HAS_CHILD: H A S UNDERLINE C H I L D;
NESTED: N E S T E D;
HIGHLIGHTER: H BANG;
BY: B Y;
IN: I N;
WHERE: W H E R E;
FROM: F R O M;
HAVING: H A V I N G;

//FUNCTIONS
//COLLECTION
FIRST_VALUE: F I R S T UNDERLINE V A L U E;
LAST_VALUE: L A S T UNDERLINE V A L U E;

//MATH
POW: P O W;
ABS: A B S;
EXP: E X P;
EXPM1: E X P M '1';
AVG: A V G;
COUNT: C O U N T; //COUNT(ALL),COUNT(DISTINCT)
MAX: M A X;
MIN: M I N;
SUM: S U M;
COS: C O S;
SIN: S I N;
TAN: T A N;
COT: C O T;
CBRT: C B R T;
CEIL: C E I L;
LOG: L O G;
LOG10: L O G '10';
FLOOR: F L O O R;
PI: P I;
RANDOM: R A N D O M|R A N D;
ROUND: R O U N D;
SIGN: S I G N|S I G N U M;
SQRT: S Q R T;
TRUNCATE: T R U N C A T E;
ACOS: A C O S;
ASIN: A S I N;
ATAN: A T A N;
ATAN2: A T A N '2';
COSH: C O S H;
SINH: S I N H;
DEGREES: D E G R E E S;
RADIANS: R A D I A N S;

//TYPE
CAST: C A S T;
CONVERT: C O N V E R T;

//GROUPING
HISTOGRAM: H I S T O G R A M;

//STRINGS
UPPER: U P P E R;
LOWER: L O W E R;
LEN: L E N;
CONCAT: C O N C A T;
ASCII: A S C I I;
CHAR: C H A R;
BIT_LENGTH: B I T UNDERLINE L E N G T H;
LCASE: L C A S E;
LEFT: L E F T;
LENGTH: L E N G T H|LEN;
LOCATE: L O C A T E;
LTRIM: L T R I M;
OCTET_LENGTH: O C T E T UNDERLINE L E N G T H;
POSITION: P O S I T I O N;
REPEAT: R E P E A T;
REPLACE: R E P L A C E;
RIGHT: R I G H T;
RTRIM: R T R I M;
FSPACE: S P A C E;
UCASE: U C A S E;
SUBSTRING: S U B S T R I N G;


//NUMBER
HEX: H E X;




//TIME
NOW: N O W;





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

//ARITHMETICS

STAR: '*';
DIVIDE: '/';
MODULE: '%';
PLUS: '+';
MINUSMINUS: '--';
MINUS: '-';
DIV: D I V;
MOD: M O D | MODULE;
POUND: '#';
QUES: '?';

//COMPARATION

EQ: '=';
AEQ: '~=';
EQEQ: '==';
BANGEQ: '!=';
GT: '>';
GTE: '>=';
LT: '<';
LTE: '<=';
BANG: '!';

//BIT
BIT_NOT_OP: '~';
BIT_OR_OP: '|';
DBIT_OR_OP: '||';
BIT_AND_OP: '&';
DBIT_AND_OP: '&&';
BIT_XOR_OP: '^';
GTGT: '>>';
LTLT: '<<';

//CONSTRUCTORS

DOT: '.';
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
FLOAT: MINUS? DEC_DIGIT+ DOT DEC_DIGIT* | MINUS? DOT DEC_DIGIT+;

DOT_ID: DOT ID_LITERAL;
ID: DOT? ID_LETTER (ID_LETTER|DEC_DIGIT|MINUS|STAR|DOT)*;
STRING: DQUOTA_STRING|SQUOTA_STRING|BQUOTA_STRING;

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

fragment ID_LETTER: [a-zA-Z]|UNDERLINE;
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