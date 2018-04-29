package runtime;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Stack;
/*
*This class would intiate the runtime by creating the runtime stack, runtime enviroment key value pair and
*the eipregister to keep track of the current executing instrution.
*
*@author: Koushik Kotamraju
*
*/
public class FishRunTimeMain
{
	int eipRegister,eaxRegister=0;
	Stack<String> runTimeStack;
	ArrayList<String> instructions = new ArrayList<String>();
	String[] commands; 
	Hashtable<String, Pair<String, String>> environment;
	
	//Contructor to intialize runtime stack , runtime environmental key value pair and the eipregister
	public FishRunTimeMain()
	{
		eipRegister = 0;
		runTimeStack = new Stack<String>();
		environment = new Hashtable<String, Pair<String, String>>();
	}
	//Method to get the instructions from the .fish file and its corresponding number (eipregister)
	public void start(String fileName) throws FileNotFoundException
	{
		FishRunTime runTime = new FishRunTime();
		File file = new File(fileName);
		@SuppressWarnings("resource")
		Scanner input = new Scanner(file);
		
		while (input.hasNextLine()) {
			instructions.add(input.nextLine());
		}
		commands =  instructions.toArray(new String[instructions.size()]);
		
		eipRegister = 0;
		while(eipRegister < commands.length) {
            String instruction = commands[eipRegister];
            
            eipRegister = runTime.process(instruction, environment, runTimeStack, eipRegister);
        }
	}
	public static void main(String args[])
	{
		FishRunTimeMain fish = new FishRunTimeMain();
		try {
			fish.start(args[0]);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
