package runtime;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class FishRunTimeMain
{
	int eipRegister;
	Stack<String> runTimeStack;
	ArrayList<String> instructions = new ArrayList<String>();
	String[] commands; 
	Hashtable<String, Pair<String, String>> environment;
	
	public FishRunTimeMain()
	{
		eipRegister = 0;
		runTimeStack = new Stack<String>();
		environment = new Hashtable<String, Pair<String, String>>();
	}
	public void start(String fileName) throws FileNotFoundException
	{
		FishRunTime runTime = new FishRunTime();
		File file = new File(fileName);
		Scanner input = new Scanner(file);
		
		while (input.hasNextLine()) {
			instructions.add(input.nextLine());
		}
		commands =  instructions.toArray(new String[instructions.size()]);
		while(eipRegister < commands.length) {
            String instruction = commands[eipRegister];
            
            eipRegister = runTime.process(instruction, environment, runTimeStack, eipRegister);
        }
	}
}