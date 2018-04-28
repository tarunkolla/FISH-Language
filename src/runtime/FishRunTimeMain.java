package runtime;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Stack;

public class FishRunTimeMain
{
	int eipRegister,eaxRegister=0;
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
		/*while(eipRegister < commands.length) {
            String instruction = commands[eipRegister];
            System.out.println(eipRegister +" "+ instruction);
            eipRegister++;
           }*/
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}