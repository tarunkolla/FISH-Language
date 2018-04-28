
 <h1 align="center"> FISH LANGUAGE </h1>  
 <h3 align="center"> SER 502 - TEAM 16 </h3> 

 **Team:** <br> [Naga Ravi Teja Thoram](https://github.com/ravitejathoram)  - nthoram@asu.edu<br>
 [Tarun Kolla](https://github.com/tarunkolla) - tkolla@asu.edu<br>
 [Koushik Kotamraju](https://github.com/koushik1610) - kkotamra@asu.edu<br>
 [Siva Pranav Mandadi](https://github.com/mspranav) - smandad1@asu.edu<br>

 **System Execution environment:** Windows.<br>
 Tools Used: Java SDK 1.8, Eclipse, ANTLR4.<br>

 **Instructions to install Fish Programming Language:**<br>
 
    -Download the Jar file.
 
 **Instructions to build and execute the program:**<br>

    -Write the Input program snippet with the file name <Filename>.fish within the same folder of the fish.jar
    if not give the absolute path to the program file.
    -Open the command prompt and navigate to the folder where the jar is present.
    -Execute using the given bash command to run the .fish file. 
 
 **Command to Execute the compiler and the runtime:**<br>

  If .fish file is in a separate folder:<br>
  $java -jar fish.jar path/to/the/program/file.fish 

  If .fish file is in the same folder as fish.jar<br>
  $java -jar fish.jar <filename>.fish


<h3> FISH language programming guidelines: </h3>

 
FISH is a simple programming language that starts and ends with a statement as: 
 
  
 ```
   startFISH
     write "Hello FISH!"
   endFISH
 ```
 
 It consists of the following:
 <ol type="1">
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
 Real numbers such as 1.0, 2.2, 3.67 etc., can be intialized as follows:
  
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
    
   </p>
    </details>

  <li>Operation</li>
    <details>
 <summary>Arithmetic</summary>
   <p>
   </p>
    </details>
    
   <details>
 <summary>Relational</summary>
   <p>
   </p>
    </details>
    
  <details>
 <summary>Logical</summary>
   <p>
   </p>
    </details>
   
   <li>Statements</li>
  
  <details>
  <summary>Assignment</summary>
   <p>
   </p>
   </details>
  
  <details>
 <summary>Declerative</summary>
   <p>
   </p>
    </details>
  
  <details>
 <summary>Write</summary>
   <p>
    Write is used to display a promt such as:
    
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
   If can also be followed with an else sattement:
   
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
   
</ol> 

 
 
 <details>
 <summary>Scope & Restrictions</summary>
 <p>xyz</p>
 </details>
 
<details>
 <summary>Video Presentation</summary>
 <p>xyz</p>
 </details>

 [Contribution and meeting agenda](doc/contribution.txt) 

