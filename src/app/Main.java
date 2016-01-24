package app;

import java.io.IOException;
import java.util.ArrayList;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import execution.Executor;
import parserAndLexer.ListLanguageLexer;
import parserAndLexer.ListLanguageParser;
import parserAndLexer.recognizer.EvalVisitor;
import parserAndLexer.recognizer.Helper;

public class Main {

	public static final String SOURCE_PATH = "args/sample.txt";
	public static final String ENCODING = "UTF-8";
	

	public static void main(String[] args) {
		try {

			ANTLRFileStream input = new ANTLRFileStream(SOURCE_PATH, ENCODING);
			ListLanguageLexer lexer = new ListLanguageLexer(input);		
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			ListLanguageParser parser = new ListLanguageParser(tokens);
			ParseTree tree = parser.compilation_unit();
			
			Executor exec = new Executor();
			Helper helper = new Helper(exec);
			new EvalVisitor(parser,exec,helper).visit(tree);
			
			exec.run();
			exec.print();


		
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
