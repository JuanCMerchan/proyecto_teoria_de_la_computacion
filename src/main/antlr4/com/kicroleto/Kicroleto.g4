grammar Kicroleto;

program: PROGRAM ID BRACKET_OPEN
    sentence*
    BRACKET_CLOSE;

sentence: var_decl | var_assign | println_var | println_int;

var_decl: VAR ID SEMICOLON;
var_assign: ID ASSIGN INT SEMICOLON;
println_var: PRINTLN ID SEMICOLON;
println_int: PRINTLN INT SEMICOLON;

PROGRAM: 'kicrograma';
VAR: 'var';
PRINTLN: 'kimprimir';
IF: 'kicroSi';
ELSE: 'kicroSiNo';

PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';

AND: 'kicroY';
OR: 'kicroO';
NOT: 'negativo_hermano!';

GT: '>';
LT: '<';
GEQ: '>=';
LEQ: '<=';
EQ: '==';
NEQ: '!=';

ASSIGN: '=';

BRACKET_OPEN: '{';
BRACKET_CLOSE: '}';

PAR_OPEN: '(';
PAR_CLOSE: ')';

SEMICOLON: ';';

ID: [k][i][c][r][o][a-zA-Z0-9_]*;

INT: [0-9]+;
FLOAT: [0-9]+[.][0-9]+;
STRING: ["][a-zA-Z0-9_.\n ]+["];

WS: [ \t\n\r]+ -> skip;