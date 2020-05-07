grammar kawalang;

// PARSER RULES

compilationUnit: (namespace)* EOF;
namespace: (PACKAGE IDENTIFIER (klass));
klass: CLASS IDENTIFIER;

// LEXER RULES

// fragments
fragment CURLY_OPEN: '{';
fragment CURLY_CLOSE: '}';
fragment LETTER: [A-Z] | [a-z] | '_' | '$';
fragment STRING_CHAR: ~('"' | '\\' | '\r' | '\n');
fragment NON_ZERO_DIGIT: [1-9];
fragment DIGIT: [0-9];
fragment HEX_DIGIT: [0-9] | [a-f] | [A-F];
fragment OCT_DIGIT: [0-7];
fragment BINARY_DIGIT: '0' | '1';
fragment BOOLEAN: 'true' | 'false';
fragment TAB: '\t';
fragment NEWLINE: '\n';
fragment PLUS: '+';
fragment MINUS: '-';
fragment EQUAL: '=';

// literals
NULL_LITERAL: 'null';
STRING_LITERAL: '"' STRING_CHAR* '"';
NUMERIC_LITERAL: '0' | NON_ZERO_DIGIT DIGIT*;
HEX_NUMERIC_LITERAL: '0x' HEX_DIGIT*;
BOOLEAN_LITERAL: BOOLEAN;

IDENTIFIER: [a-zA-Z0-9]+; //must be any alphanumeric value

// keywords
PACKAGE: 'package';
CLASS: 'class';
INTERFACE: 'interface';
ENUM: 'enum';
STRUCT: 'struct';
VARIABLE: 'var';
FINAL_VARIABLE: 'let';
CASTING: 'as';
THROW: 'throw';
THROWS: 'throws';
RETURN: 'return';

// control flow
IF: 'if';
ELSE: 'else';
WHILE: 'while';
FOR: 'for';
FOREACH: 'foreach';
CONTINUE: 'continue';
BREAK: 'break';
YIELD: 'yield';
TRY: 'try';
CATCH: 'catch';
SWITCH: 'switch';
CASE: 'case';

// type structuring
IMPLEMENTS: 'implements';
EXTENDS: 'extends';

// visiblity modifiers
PRIVATE: 'private';
PROTECTED: 'protected';

// functionality modifiers
ABSTRACT: 'abstract';
DEFAULT: 'default';
ASYNC: 'async';
STATIC: 'static';
SYNCHRONIZED: 'synchronized';

// OPERATORS
IS: 'is';
NOT: 'not';
NEGATE: '!';
ASSIGN: EQUAL;
EQUALS: EQUAL EQUAL;
NOT_EQUALS: NEGATE EQUAL;
NOT_EQUALS_LT_GT: '<>';
LIKE: '~';
NOT_LIKE: '!~';
GREATER_THAN: '>';
GREATER_THAN_OR_EQUAL: '>=';
LESS_THAN: '<';
LESS_THAN_OR_EQUAL: '<=';
OR: '|';
OR_BINARY: '||';
AND: '&';
AND_BINARY: '&&';
ADD: PLUS;
SUBTRACT: MINUS;
DIVIDE: '/';
MULTIPLY: '*';
MODULUS: '%';
INCREMET: PLUS PLUS;
DECREMENT: MINUS MINUS;
INCREMENT_AND_ASSIGN: EQUAL PLUS;
DECREMENT_AND_ASSIGN: EQUAL MINUS;
MULTIPLY_AND_ASSIGN: EQUAL MULTIPLY;
DIVIDE_AND_ASSIGN: EQUAL DIVIDE;
MODULUS_AND_ASSIGN: EQUAL MODULUS;

// non-code
BLOCK_COMMENT: '/*' .*? '*/' -> skip;
LINE_COMMENT: '//' ~[\r\n]* -> skip;
WHITESPACE: [ \t\r\n\u000C]+ -> skip;

