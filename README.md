  FISH LANGUAGE
Features of Language:
Data Types:
Our language allows declaration of two data types Integer and Boolean (planning to implement the binding of data type dynamically, our idea of implementation is to check the type associated with the variable whenever assignment operator occurs and update the type accordingly).
       Assignment operator in our language: '='
		Ex: x=10 //assignment statement
       Mathematical Operations supported by our language are:
* Addition
* Subtraction
* Multiplication
* Division
* Modulo
       Comparison operations supported by our language are:
* Less Than
* Greater Than
* Less Than or Equal to
* Greater Than or Equal to
* Equals
* Not Equals
       Conditional Statement in our language(if):
	  if (<booleanExpression>):
			block
	  else:
			block
	  endif
       Iterative Statement in our language(loop):
		loop (<booleanExpression>):
			block
		endloop
	Functions:
	Our language supports functions and the syntax is as follows:
		fun #<functionName>(<parameters>):
			block
		endfun
