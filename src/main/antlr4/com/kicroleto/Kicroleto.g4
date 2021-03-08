grammar Kicroleto;

@parser::header {
    import java.util.Map;
    import java.util.HashMap;
}

@parser::members {
    Map<String, Object> symbolTable = new HashMap<String, Object>();
}

program: PROGRAM ID BRACKET_OPEN
    sentence*
    BRACKET_CLOSE;

sentence: var_decl | var_assign | println;

var_decl: VAR ID SEMICOLON
    {symbolTable.put($ID.text, 0);};
var_assign: ID ASSIGN expresion SEMICOLON
    {symbolTable.put($ID.text, $expresion.value);};
println: PRINTLN expresion SEMICOLON
    {System.out.println($expresion.value);};
expresion returns [Object value]:
    INT {$value = Integer.parseInt($INT.text);}
    |
    ID {$value = symbolTable.get($ID.text);};

PROGRAM: 'kicrograma';
VAR: 'var';
PRINTLN: 'kimprimir';
IF: 'kicroSi';
ELSE: 'kicroSiNo';

PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';

AND: 'kicro&&';
OR: 'kicro||';
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