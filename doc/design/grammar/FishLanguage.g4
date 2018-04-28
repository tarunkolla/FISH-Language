grammar FishLanguage;

program		:  mainBlock (functions)*;
mainBlock 	: 'startFISH' statements+ 'endFISH';
statements 	: (assignmentStatement
		|    ifStatement
		|    loopStatement
		|    writeStatement
		|    declarationStatement
		|    readStatement
		|    functionCallStatement
		|    returnStatement);

declarationStatement : DOLLAR IDENTIFIER;
functions	: 'fun' FUNCNAME LBRACE parameters RBRACE ':' statements+ 'endfun';
parameters	: (DOLLAR IDENTIFIER) (',' parameters)?;
functionCallStatement : FUNCNAME LBRACE arguments RBRACE;
arguments  	      : (expression) (','arguments)?;
returnStatement	      : 'return' expression;
assignmentStatement : IDENTIFIER ASSIGNMENT expression;
ifStatement	: ifBlock (elseBlock)? 'endif';
ifBlock		: 'if' LBRACE booleanExpression RBRACE ':' statements+ ;
elseBlock	: 'else' ':' statements+;
loopStatement	: 'loop' LBRACE booleanExpression RBRACE ':' statements+ 'endloop';
writeStatement  : 'write' expression
		| 'write' STRING
		| 'write' booleanExpression;
readStatement	: 'read' IDENTIFIER;
booleanExpression: expression EQUALS expression
		 |    expression GTE expression
		 |    expression LTE expression
  		 |    expression NE expression
		 |    expression GT expression
		 |    expression LT expression
		 |    expression AND expression
		 |    expression OR expression		
		 |    BOOLEAN;
expression 	: expression (MULTIPLY|DIVIDE|MOD) expression
		| expression (ADD|SUBTRACT) expression
		| NUMBER
		| BOOLEAN
		| STRING
		| IDENTIFIER
		| REAL
		| functionCallStatement
		| LBRACE expression RBRACE;
BOOLEAN		: 'true'
		| 'false';	
SUBTRACT	: '-';
NUMBER 		:  [-]?[0-9]+;
REAL		: [-]?[0-9]+[.][0-9]+;
IDENTIFIER	:  [a-z]+;
DOLLAR		: '$';
ASSIGNMENT	: '=';
MULTIPLY	: '*';
DIVIDE		: '/';
MOD		: '%';
ADD		: '+';
LBRACE		: '(';
RBRACE		: ')';
EQUALS		: '==';
GTE		: '>=';
LTE		: '<=';
NE		: '!=';
GT		: '>';
LT		: '<';
AND 		: '&&';
STRING		: ["][ a-zA-Z:=><+*/%!\-]+["];
OR		: '||';
FUNCNAME 	: [A-Z]+;
NEWLINE		: [ \n\t\r] -> skip;
