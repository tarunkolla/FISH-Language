package compiler;
import org.antlr.v4.runtime.ANTLRInputStream;
import runtime.FishRunTimeMain;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.PrintWriter;

@SuppressWarnings("deprecation")
class FishMain{
	public static void main(String args[]) throws Exception
	{
		FileInputStream fis = new FileInputStream(args[0]);
		ANTLRInputStream input = new ANTLRInputStream(fis);
		FishLanguageLexer lexer = new FishLanguageLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		FishLanguageParser parser = new FishLanguageParser(tokens);
		ParserRuleContext tree = parser.program();
		ParseTreeWalker ptw = new ParseTreeWalker();
		FishLanguageBaseListener flb = new FishLanguageBaseListener();
		ptw.walk(flb, tree);
		try
        {
        	PrintWriter writer = new PrintWriter(args[0] + ".ic", "UTF-8");
        	for(int i=0;i<flb.instructionStack.size();i++)
        	{
        		writer.println(flb.instructionStack.get(i));
        	}
        	writer.close();
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
		/*FishRunTimeMain runTime = new FishRunTimeMain();
		runTime.start("sampleFunc"+".ic");*/
	}
}