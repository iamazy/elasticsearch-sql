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
HIGHLIGHTER: H POUND;
BY: B Y;
IN: I N;
WHERE: W H E R E;
FROM: F R O M;
HAVING: H A V I N G;

//FUNCTIONS
//MATH
POW: P O W;
ABS: A B S;

//STRINGS
UPPER: U P P E R;
LOWER: L O W E R;
LEN: L E N;
CONCAT: C O N C A T;

//NUMBER
HEX: H E X;

//TRIANGLE
COS: C O S;
SIN: S I N;
TAN: T A N;
COT: C O T;



//TIME




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
ID: DOT? ID_LETTER (ID_LETTER|DEC_DIGIT|MINUS|STAR)*;
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