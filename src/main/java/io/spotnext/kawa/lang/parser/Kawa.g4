grammar Kawa;

// PARSER RULES

qualifiedTypeName          : qualifiedTypeNameElement (DOT_OPERATOR qualifiedTypeNameElement)*;
qualifiedTypeNameElement   : IDENTIFIER;
qualifiedmemberNameElement : IDENTIFIER;
importsDeclaration         : IMPORT qualifiedTypeName (OF_OERATOR OF_OERATOR qualifiedmemberNameElement)? importRename?;
importRename               : AS IDENTIFIER;
packageName                : IDENTIFIER;
packageDeclaration         : PACKAGE packageName '{' ( classDeclaration | interfaceDeclaration | enumDeclaration | structDeclaration) '}';
compilationUnit            : (importsDeclaration)* packageDeclaration EOF;

// type hierarchy
extendsDeclaration    : EXTENDS className;
implementsDeclaration : IMPLEMENTS className (',' className)*;
genericArgument       : className (EXTENDS? className)?;
genericArguments      : '<' genericArgument (',' genericArgument)* '>';

// class
classModifiers   : ABSTRACT? PRIVATE?;
className        : IDENTIFIER genericArguments?;
classDeclaration : classModifiers CLASS className extendsDeclaration? implementsDeclaration? '{' (fieldDeclaration | methodDeclaration)* '}';

// interface
interfaceModifiers   : PRIVATE?;
interfaceName        : IDENTIFIER;
interfaceDeclaration : interfaceModifiers INTERFACE interfaceName genericArguments? extendsDeclaration? '{' (fieldDeclaration | methodDeclaration)* '}';

// enum
enumModifiers                 : PRIVATE;
enumName                      : IDENTIFIER;
enumValueDeclarationArgument  : literal;
enumValueDeclarationArguments : enumValueDeclarationArgument (',' enumValueDeclarationArgument)*;
enumValueDeclaration          : IDENTIFIER ('(' enumValueDeclarationArguments ')')?;
enumValueDeclarations         : enumValueDeclaration (',' enumValueDeclaration)*;
enumDeclaration               : enumModifiers? ENUM enumName '{' enumValueDeclarations* (';' (fieldDeclaration | methodDeclaration)*)? '}';

// struct
structModifiers   : PRIVATE;
structName        : IDENTIFIER;
structDeclaration : structModifiers? STRUCT structName '{' fieldDeclaration* '}';

// annotation
annotationModifiers   : PRIVATE;
annotationName        : IDENTIFIER;
annotationValue       : variableName (OF_OERATOR typeLiteral)? (ASSIGN (assignment))? casting?;
annotationDeclaration : annotationModifiers? ANNOTATION annotationName '{' annotationValue* '}';

// general
typeLiteral               : IDENTIFIER (ARRAY_EMPTY? | genericArguments?) OPTIONAL?;
casting                   : (AS typeLiteral);
literal                   : STRING_LITERAL | INTEGER_LITERAL | LONG_LITERAL | FLOAT_LITERAL | DOUBLE_LITERAL | HEX_NUMERIC_LITERAL | BOOLEAN_LITERAL | NULL_LITERAL;
memberVisibilityModifiers : (PRIVATE | PROTECTED | PUBLIC)?;

// variables and fields
assignment          : variableAccess | literal | methodInvocation | listInitialization | mapInitialization;
arguments           : assignment (',' assignment)*;
variableName        : IDENTIFIER;
variableAccess      : (THIS DOT_OPERATOR)? variableName;
variableDeclaration : (VARIABLE | FINAL_VARIABLE) variableName (OF_OERATOR typeLiteral)? (ASSIGN (assignment))? casting?;
fieldDeclaration    : (memberVisibilityModifiers) variableDeclaration;

// methods
methodModifiers   : (PRIVATE | PROTECTED | PUBLIC)? (ABSTRACT | STATIC)? ASYNC? SYNCHRONIZED? NATIVE? VOLATILE?;
methodName        : IDENTIFIER;
methodParameter   : variableName (OF_OERATOR typeLiteral)? (ASSIGN (assignment))? casting?;
methodParameters  : methodParameter (',' methodParameter)*;
methodDeclaration : methodModifiers METHOD methodName genericArguments? ASSIGN '(' methodParameters* ')' OF_OERATOR typeLiteral OPTIONAL? codeBlock?;

// code block
returnStatement    : RETURN (IDENTIFIER | literal);
methodArguments    : arguments;
methodInvocation   : ((variableAccess | className | literal | THIS | SUPER) DOT_OPERATOR)? methodName '(' arguments* ')';
variableAssignment : (variableAccess | className | literal) ASSIGN (methodInvocation | variableAccess | literal) (casting)?;
codeBlock          : '{' (variableDeclaration | variableAssignment | methodInvocation)* returnStatement? '}';

// list and map comprehension
listInitialization : '[' arguments* ']';

mapKeyValue       : STRING_LITERAL OF_OERATOR assignment;
mapKeyValues      : mapKeyValue (',' mapKeyValue)*;
mapInitialization : '{' mapKeyValues* '}';

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

OPTIONAL              : QUESTION_MARK;
OF_OERATOR            : COLON;
ARRAY_EMPTY           : '[]';
DOT_OPERATOR          : DOT;
DOT_DOT_OPERATOR      : DOT DOT;
OPTIONAL_DOT_OPERATOR : OPTIONAL DOT;

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
ANNOTATION     : 'annotation';
VARIABLE       : 'var';
FINAL_VARIABLE : 'let' | 'val';
METHOD         : 'def';
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
PRIVATE   : '@private';
PROTECTED : '@protected';
PUBLIC    : '@public';

// functionality modifiers
NATIVE       : '@native';
VOLATILE     : '@volatile';
ABSTRACT     : '@abstract';
DEFAULT      : '@default';
ASYNC        : '@async';
STATIC       : '@static';
SYNCHRONIZED : '@synchronized';

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

