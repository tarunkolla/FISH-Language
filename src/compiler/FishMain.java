package compiler;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.PrintWriter;

class FishMain{
	@SuppressWarnings("deprecation")
	public static void main(String args[]) throws Exception
	{
		FileInputStream fis = new FileInputStream("C:\\Javalib\\Test\\newSample.txt");
		ANTLRInputStream input = new ANTLRInputStream(fis);
		FishLanguageLexer lexer = new FishLanguageLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		FishLanguageParser parser = new FishLanguageParser(tokens);
		ParserRuleContext tree = parser.program();
		try
		{
			PrintWriter writer = new PrintWriter("parseTree.pt","UTF-8");
			writer.println(tree);
			writer.println(tree.toStringTree());
			writer.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		ParseTreeWalker ptw = new ParseTreeWalker();
		FishLanguageBaseListener flb = new FishLanguageBaseListener();
		ptw.walk(flb, tree);
		Object[] vals = flb.ir.toArray();
        for (Object obj : vals) {
            System.out.println(obj);
        }
	}
}