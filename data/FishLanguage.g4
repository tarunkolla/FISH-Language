grammar FishLanguage;
program	: mainBlock;
mainBlock	: 'startFISH' block 'endFISH';
block		: declaration statements
		| statements;
parametersHelp : '$' IDENTIFIER;
declaration 	: declarationHelp ',' declaration
		|   declarationHelp;
declarationHelp	 : '$' IDENTIFIER
		 |   '$' IDENTIFIER '=' NUMBER
		 |   '$' IDENTIFIER '=' BOOLEAN;
statements	: statementsHelp statements
		|   statementsHelp;
statementsHelp	: assignmentStatement
		|    ifStatement
		|    loopStatement
		|    writeStatement;
assignmentStatement :IDENTIFIER '=' expression;
ifStatement	: 'if' '('booleanExpression')' ':' block 'else' ':' block 'endif';
loopStatement	: 'loop' '('booleanExpression')' ':' block 'endloop';
writeStatement : 'write' expression;
booleanExpression: expression '==' expression
		 |    expression '>=' expression
		 |    expression '<=' expression
  		 |    expression '!=' expression
		 |    expression '>' expression
		 |    expression '<' expression
		 |    BOOLEAN;
expression 	: term  '+' expression 
		|    term '-' expression 
		|    term;
term 	         : factor  '*'  term  
		 |  factor '/' term 
		 |  factor '%' term
		 |  factor;
factor		: '('expression')'
		|   NUMBER
		|   IDENTIFIER;
BOOLEAN		: 'true'
		|    'false';	
NUMBER 		:  [-]?[0-9]+;
IDENTIFIER	:  [a-z]+;
FUNCTIONNAME	:  [#][a-z]+;
NEWLINE		: ('\r'|'\n'|' '|'\t') -> skip;
