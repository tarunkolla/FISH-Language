
 <h1 align="center"> FISH LANGUAGE </h1>  
 <h3 align="center"> SER 502 - TEAM 16 </h3> 

 **Team:** <br> [Naga Ravi Teja Thoram](https://github.com/ravitejathoram)  - nthoram@asu.edu<br>
 [Tarun Kolla](https://github.com/tarunkolla) - tkolla@asu.edu<br>
 [Koushik Kotamraju](https://github.com/koushik1610) - kkotamra@asu.edu<br>
 [Siva Pranav Mandadi](https://github.com/mspranav) - smandad1@asu.edu<br>

 **System Execution environment:** Windows.<br>
 **Tools Used:** Java SDK 1.8, Eclipse, ANTLR4.<br>

 **Instructions to install Fish Programming Language:**<br>
 
    -Download the install folder present in the repository
    -The folder consists of .jar file for compiler and runtime.
    -The 2 .bat files are used to execute the compiler and runtime
 
 **Instructions to build and execute the program:**<br>

    -Write the Input program snippet with the file name <FileName>.fish within the same folder of the .jar files
    if not give the absolute path to the program file.

 
 **Command to Execute the compiler and the runtime:**<br>

**For Windows:** 
    
     -Execute using the given .bat commands to run the .fish file. 
   To Compile: 
   
     fishCompile <FileName>.fish if in same folder 
     fishCompile "absolute path" \<FileName>.fish for different folder
     Output: <FileName>.fish.ic
   To generate output:
    
     fish <FileName>.fish.ic if in same folder
     fish "absolute path" \<FileName>.fish.ic for different folder
     output: Generates the program output on to the command prompt
     
**For OSX:**
   
   Navigate to the install folder or use absolute path and then
   
   To Compile:
      
     java -jar compile.jar <FileName>.fish
     Output: <FileName>.fish.ic
     
   To generate output:
   
      java -jar runtime.jar <FileName>.fish.ic
      Output: Generates the program output on to the command prompt
 
 <br>

<h3 align="center"> FISH language programming guidelines: </h3>

 <br>
FISH is a simple programming language that starts and ends with a statement as: 
 
  
 ```
   startFISH
     write "Hello FISH"
   endFISH
 ```
 
 **It consists of the following:** (Click to expand)
 <ol type="1">

   <li>Statements</li>
  
  <details>
  <summary>Assignment</summary>
   <p>
    Fish language supports assignment statements and can be written as: 
	   
   ```
   $f
   f = 1
   ```
   </p>
   </details>
  
  <details>
 <summary>Declarative</summary>
   <p>
  Data types should be declared with a $ sign as:
  
  ```
  $a $b
  ```
   </p>
    </details>
  
  <details>
 <summary>Write</summary>
   <p>
    Write is used to display a prompt such as:
    
   ```
    $f
    f=27
    write f
   ```
   Write can also be used to display portion of a line: 
   
   ```
   write "Keep fishing"
   ```
   </p>
  </details>
  
  
  <details>
 <summary>Read</summary>
   <p>
    Read is used for obtaining input of the primitive types such as Int and can be writen as:
    
   ```
   $f
   write "give the value of f:"
   read f
   ```
   </p>
    </details>
 <li>Data Types</li>
 <details>
 <summary>Int</summary>
  <p>
   It is recommended that Integer values are to be declared at the start of the program and can be initialized as follows:
  
   ```
   $f
   f = 0
   ```
   We can also have multiple initializations on the same line
   
   ```
   $f $i
   f = 0 i = -1
   ```
  </p>
  </details>
  
  <details>
 <summary>Real</summary>
 <p>
 Real numbers such as 1.0, 2.2, 3.67 etc., can be initialized as follows:
  
  ```
  $f
  f = 2.7
  ```
  As Fish language supports dynamic typing we do not have to specify the type.
 </p>
 
  </details>
  <details>
 <summary>Boolean</summary>
   <p>
    Fish supports boolean types and can be initialized as:
	   
   ```
   $f
   f = true
   $i
   i = false
   ```
   </p>
    </details>

  <li>Operation</li>
    <details>
 <summary>Arithmetic</summary>
   <p>
    Fish programming language supports arithmetic operations such as addition '+', subtraction '-', multiplication '*', division '/', modulus '%'.	
   
   ```
   $f
   $i
   $operate
   i = 2
   read f
   
  operate = (f % 3) - i
  
  write operate
   ```
   </p>
    </details>
    
   <details>
 <summary>Relational</summary>
   <p>
   Fish supports relational operators such as equalto '==', notequalto '!=', lessthan '<', graterthan '>', lessthaorequalto '<=', greaterthanorequlato'>='. 
   
   ```
   $f $i
   f = 2
   read i
   if(i >= 2):
       write "i is greater than or equal to 2"
   endif
   ```
   </p>
    </details>
    
  <details>
 <summary>Logical</summary>
   <p>
   Logical operators AND '&&' , OR '||' are supported by fish and their syntax is as follows:
   
   ```
   $f
   f=1
   if(f&&1):
       write "It works"
   endif
   ```
   </p>
    </details>
   
   
  <li>Constructs</li>
    <details>
 <summary>Conditional</summary>
   <p>
    If is a control flow statement that starts as if(): and ends with endif as:
   
   ```
    $f
    read f
    
    if(f == 0):
        write "f is zero"
    endif 
   ```
   If can also be followed with an else statement:
   
   ```
   $f $i $s $h
   f=0 i=1
   read h
   
   if( h == 0):
       s = f + i
       write s
   else:
       s = f * i
       write s
   endif
   ```
   </p>
    </details>
   
   <details>
   <summary>Iterative</summary>
   <p>
    The loop statement continually executes a block while a particular condition is true. Its syntax can be expressed as:
   
   ```
    $f
    f=4
    loop(f > 1):
        write f
	f = f - 1
    endloop
   ```
   </p>
   </details>
   <li>Functions</li>
   <details>
   <summary>Function Block</summary>
   <p>
   Fish language supports functions that start with fun(), ends with endfun and should have a return as:
	   
   ```
   fun NAME($f):
       <statements>
       <return Statement> 
   endfun    
   ```
   </p>
   </details>
    <details>
   <summary>Function call</summary>
   <p>
   Functions in Fish supports function calls as that also writes return values:
	 
   ```
   $f $i
   f = NAME(<argument>)
   f = i + NAME(<argument>)
   write NAME(<argument>)
   ```
   </p>
   </details>
   
</ol> 


 <h3 align= "center" >Scope & Restrictions</h3>

This sections talks about what FISH programming language can do. The list below has a detailed explanation of the same.

  
  <details>
  <summary>1. Dynamic Typing</summary>
 <p> 
	<ul>
 
 <li> Our programming language dynamically decides the data types of variables just like Java Script/Python.</li>
 <li> We support three data types and user only need to declare variable, need not bother about type of variable. </li>
	 <li>   Whenever a variable is declared we are giving default value as "0" and setting default type as "NONE". </li>
	 <li>   Based on the context, we typecast data or shows error message to perform operations among data types. 
	 <li>   Consider the example program <a href="https://github.com/tarunkolla/SER502-Spring2018-Team16/blob/master/data/Test-Cases/Test-Programs/dynamicTyping.fish">dynamicTyping.fish</a> </li>
	   			o/p of that program is : <br>
		                        
	a: 
	1 type:NUMBER
	a:
	3.0 type:REAL
					
&emsp; The output illustrates the dynamic typing in our language because based on context the type of variable "a" is 
	   changing. 
	  <li>  The simple principle we followed in order to achieve dynamic typing is taking care of context/types whenever assignment
	   statement triggers. 
	   <li> The priority FISH follows to choose type based on context whenever heterogeneous types occurs is <br>
	   &emsp; <b>	Scenario 1 </b>(in case of Arithmetic and Relational Operations): <br>  &emsp; REAL > NUMBER > NONE (example "dynamicTyping.fish" also illustrates this concept at the statement a = a + b <br> &emsp; where b = 2.0 after executing this statement a becomes REAL prior to that it is NUMBER) <br>
	  &emsp; <b>Scenario 2 </b>(in case of Logical operations) : <br>  &emsp; BOOLEAN (logical operations such as AND/OR works only if operands are BOOLEAN)</ul> </p>
 </details>
 

	   
 <details>
 <summary>2. Strong Typing</summary>
 <p>
	 <ul> <li>Identifier and assignment statement are places where we can loose our control over program. Whenever we are assigning a identifier
	   to another identifier i.e a=b (b must hold a value prior to this assignment statement). Since Fish is a Strongly typed language it </li> <br> 
	  &emsp; checks scope of 'b' in the environment before assignment. <br>
	  &emsp; Consider the program <a href="https://github.com/tarunkolla/SER502-Spring2018-Team16/blob/master/data/Test-Cases/Test-Programs/strongTyping.fish">StrongTyping.fish</a> <br>
 o/p of that program is :
        
	variable not declared : d
	variable not declared : b
				
(*PRINTING ERROR MESSAGES AS OUR OWN EXCEPTIONS ARE NOT DEFINED*) <br>
		<li>This program proves that FISH dont allow assignment of undeclared variable to another variable or use of undeclared variable any where in the program thereby proving the quality of STRONG TYPING. </li>
		<li> The restriction in this strong typing occurs only at "checking no.of arguments at functioncall == no.of parameters at function definition". We have not checked this during runtime. </li> </ul> </p>
 </details>
 
  <details>
 <summary>3. Meta Language Inspiration</summary>
 <p>
	 <ul>
		 <li>Inspired from ML, Fish also prints type of "variable" on console when used along with write "statement" (i.e write a => display value and type of 'a' on console).  <br>  Printing type of variable will also exhibits our "DYNAMIC TYPING".</p> </li>
		 </ul>
 </details>
 
  <details>
 <summary>4. Wonders of FISH write Statement</summary>
 <p> 
		<ul> <li>write can hold a function call (prints return value) </li>
		<li>write can evaluate expressions (arithmetic operations,logical and relational operations) </li>
	(illustrated in <a href="https://github.com/tarunkolla/SER502-Spring2018-Team16/blob/master/data/Test-Cases/Test-Programs/wondersOfWrite.fish">wondersOFWrite.fish</a> program and <a href="https://github.com/tarunkolla/SER502-Spring2018-Team16/blob/master/data/Test-Cases/Test-Programs/sampleFunc.fish">sampleFunc.fish</a> ) </ul></p>
 </details>
 
  <details>
 <summary>5. Arguments</summary>
 <p><ul><li>FISH Functions can take expressions as "arguments" and Fish Functions can be part of expressions. This scenario is illustrated in the <a href="https://github.com/tarunkolla/SER502-Spring2018-Team16/blob/master/data/Test-Cases/Test-Programs/sampleFunc.fish">sampleFunc.fish</a> program.</li></ul></p>
 </details>
 
  <details>
 <summary>6. Variable Declaration</summary>
 <p><ul><li>Fish allows to declare variable at any part of program and from that point of declaration that variable holds "Global Scope". This is good thing but this led to some restriction for us i.e. Use of Same variables in the Function Block and Main Block can corrupt the program. This problem is due to use of global environment hash table instead we have to create environment states block specifically to restrict scope. </li></ul></p>
 </details>
 
  <details>
 <summary>7. Restriction</summary>
 <p><ul><li>FISH functions demand at least one argument. Our grammar and runtime is in accordance with this feature. </li>
	  <li> FISH functions do not support "Recursion". <br>
	   			The reason for this is because we havent created Dynamic Stack Frame to handle environment and runtime stack of each function. We handled everything in global stack. </li>
	  <li> FISH functions expects definition of recent function call first.  <br>
	   			 Consider the example "sampleFunctions.fish" in this as "SUB" is latest function call the definition of the SUB must be found prior to "ADD" <br> 
	   			The reason for this restriction is due to usage of stack during compile time while forming intermediate code to store the point of function call.</li>
	<li> Functions can take given expressions as arguments bu it is recommend to leave a space between the operand and operators. Consider the example of f+1, this recommended to be written as f + 1.</li></ul> </p>
 </details>


 
 <br>

<h3 align = "center"> Other Resources </h3> <br>

 * [Contributions and meeting agenda](doc/contribution.txt) 
 * [Compiler Design](doc/design/Compiler-Design.jpg)
 * [FISH Logo](doc/design/FISH.jpg)
 * [FISH Language Grammar](doc/design/grammar/FishLanguage.g4)
 * [Sample FISH programs](data/Test-Cases/Test-Programs)
 * [Youtube Video Updated to 15:00m](https://youtu.be/XoU5I9I3MAk)
 * [Youtube Video](https://youtu.be/B69gsLde1ow)
