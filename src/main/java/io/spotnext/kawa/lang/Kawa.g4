grammar Kawa;

// PARSER RULES

compilationUnit           : (importsDeclaration)* packageDeclaration EOF;
importsDeclaration        : IMPORT qualifiedName importRename?;
importRename              : AS IDENTIFIER;
packageDeclaration        : PACKAGE packageName '{' ( classDeclaration | interfaceDeclaration | enumDeclaration | structDeclaration) '}';
classDeclaration          : classVisibilityModifiers? classModifiers? CLASS className extendsDeclaration? implementsDeclaration? '{' (fieldDeclaration | methodDeclaration)* '}';
interfaceDeclaration      : PRIVATE? INTERFACE IDENTIFIER;
enumDeclaration           : PRIVATE? ENUM IDENTIFIER;
structDeclaration         : PRIVATE? STRUCT IDENTIFIER;
variableDeclaration       : (VARIABLE | FINAL_VARIABLE) variableName (ASSIGN literals | DECLARE_TYPE typeLiteral) (AS typeLiteral)?;
methodArgument            : variableName (ASSIGN literals | DECLARE_TYPE typeLiteral) (AS typeLiteral)?;
methodArguments           : methodArgument (',' methodArgument)*;
fieldDeclaration          : (memberVisibilityModifiers) variableDeclaration;
methodDeclaration         : (memberVisibilityModifiers) (ABSTRACT | STATIC)? NATIVE? VOLATILE? ASYNC? SYNCHRONIZED? methodName '(' methodArguments* ')' DECLARE_TYPE typeLiteral OPTIONAL? codeBlock;
qualifiedName             : qualifiedNameElement (PACKAGE_SEPARATOR qualifiedNameElement)*;
qualifiedNameElement      : IDENTIFIER;
classVisibilityModifiers  : PRIVATE;
classModifiers            : ABSTRACT;
memberVisibilityModifiers : (PRIVATE | PROTECTED)?;
literals                  : STRING_LITERAL | INTEGER_LITERAL | LONG_LITERAL | FLOAT_LITERAL | DOUBLE_LITERAL | HEX_NUMERIC_LITERAL | BOOLEAN_LITERAL;
typeLiteral               : IDENTIFIER ARRAY_EMPTY? OPTIONAL?;
packageName               : IDENTIFIER;
className                 : IDENTIFIER;
variableName              : IDENTIFIER;
methodName                : IDENTIFIER;
extendsDeclaration        : EXTENDS className;
implementsDeclaration     : IMPLEMENTS className (',' className)*;
returnStatement           : RETURN IDENTIFIER;
codeBlock                 : '{' (variableDeclaration | methodDeclaration)* returnStatement? '}';

// for testing only
test_fieldDeclarations : fieldDeclaration*;

test_methodDeclarations : methodDeclaration*;

// LEXER RULES

// fragments
fragment BINARY_DIGIT   : '0' | '1';
fragment BOOLEAN        : 'true' | 'false';
fragment TAB            : '\t';
fragment NEWLINE        : '\n';
fragment PLUS           : '+';
fragment MINUS          : '-';
fragment EQUAL          : '=';
fragment NON_ZERO_DIGIT : [1-9];
fragment DIGIT          : [0-9];
fragment HEX_DIGIT      : [0-9] | [a-f] | [A-F];
fragment OCT_DIGIT      : [0-7];
fragment LETTER         : [A-Z] | [a-z] | '_' | '$';
fragment STRING_CHAR    : ~('"' | '\\' | '\r' | '\n');
fragment QUESTION_MARK  : '?';
fragment SEMI_COLON     : ';';
fragment COLON          : ':';
fragment DOT            : '.';
fragment COMMA          : ',';
fragment UNDERSCORE     : '_';

OPTIONAL          : QUESTION_MARK;
DECLARE_TYPE      : COLON;
ARRAY_EMPTY       : '[]';
PACKAGE_SEPARATOR : DOT;

// literals
BOOLEAN_LITERAL     : BOOLEAN;
NULL_LITERAL        : 'null';
STRING_LITERAL      : '"' STRING_CHAR* '"';
INTEGER_LITERAL     : '0' | NON_ZERO_DIGIT DIGIT*;
LONG_LITERAL        : INTEGER_LITERAL 'l';
FLOAT_LITERAL       : ('0' | NON_ZERO_DIGIT DIGIT*) DOT DIGIT*;
DOUBLE_LITERAL      : FLOAT_LITERAL 'd';
HEX_NUMERIC_LITERAL : '0x' HEX_DIGIT*;

// keywords
PACKAGE        : 'package';
CLASS          : 'class';
INTERFACE      : 'interface';
ENUM           : 'enum';
STRUCT         : 'struct';
VARIABLE       : 'var';
FINAL_VARIABLE : 'let' | 'val';
AS             : 'as';
THROW          : 'throw';
THROWS         : 'throws';
RETURN         : 'return';
IMPORT         : 'import';
THIS           : 'this';
SUPER          : 'super';

// control flow
IF       : 'if';
ELSE     : 'else';
WHILE    : 'while';
FOR      : 'for';
FOREACH  : 'foreach';
CONTINUE : 'continue';
BREAK    : 'break';
YIELD    : 'yield';
TRY      : 'try';
CATCH    : 'catch';
SWITCH   : 'switch';
CASE     : 'case';

// type structuring
IMPLEMENTS : 'implements';
EXTENDS    : 'extends';

// visiblity modifiers
PRIVATE   : 'private';
PROTECTED : 'protected';

// functionality modifiers
NATIVE       : 'native';
VOLATILE     : 'volatile';
ABSTRACT     : 'abstract';
DEFAULT      : 'default';
ASYNC        : 'async';
STATIC       : 'static';
SYNCHRONIZED : 'synchronized';

// OPERATORS
IS                    : 'is';
NOT                   : 'not';
NEGATE                : '!';
ASSIGN                : EQUAL;
EQUALS                : EQUAL EQUAL;
NOT_EQUALS            : NEGATE EQUAL;
NOT_EQUALS_LT_GT      : '<>';
LIKE                  : '~';
NOT_LIKE              : '!~';
GREATER_THAN          : '>';
GREATER_THAN_OR_EQUAL : '>=';
LESS_THAN             : '<';
LESS_THAN_OR_EQUAL    : '<=';
OR                    : '|';
OR_BINARY             : '||';
AND                   : '&';
AND_BINARY            : '&&';
ADD                   : PLUS;
SUBTRACT              : MINUS;
DIVIDE                : '/';
MULTIPLY              : '*';
MODULUS               : '%';
INCREMET              : PLUS PLUS;
DECREMENT             : MINUS MINUS;
INCREMENT_AND_ASSIGN  : EQUAL PLUS;
DECREMENT_AND_ASSIGN  : EQUAL MINUS;
MULTIPLY_AND_ASSIGN   : EQUAL MULTIPLY;
DIVIDE_AND_ASSIGN     : EQUAL DIVIDE;
MODULUS_AND_ASSIGN    : EQUAL MODULUS;

IDENTIFIER : LETTER (LETTER | DIGIT)*;

// non-code
BLOCK_COMMENT : '/*' .*? '*/' -> skip;
LINE_COMMENT  : '//' ~[\r\n]* -> skip;
WHITESPACE    : [ \t\r\n\u000C]+ -> skip;

