package execution;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import elements.Element;
import elements.FunctionDefinition;
import elements.ListElement;
import elements.NumberElement;
import execution.exceptions.ErrorListener;
import execution.exceptions.FunctionExecExcetpion;
import operations.ArithmeticalOperation;
import operations.ArithmeticalOperator;
import operations.FunctionCall;
import operations.Operation;
import operations.arguments.Argument;
import operations.arguments.FunCallArgument;
import parserAndLexer.ListLanguageLexer;
import parserAndLexer.ListLanguageParser;
import parserAndLexer.recognizer.EvalVisitor;
import parserAndLexer.recognizer.Helper;

public class Executor {
	
	public static final String ENCODING = "UTF-8";
	private LinkedList<Operation> operations;
	private LinkedList<FunctionCall> calledFunctions;
	private HashMap<String, Element<?>> globalVariables;
	private HashMap<String, FunctionDefinition> functions;
	
	private String sourcePath;
	private String destPath;
	private Boolean toFile;
	private Boolean toConsole;
	private Boolean stackTrace;
	private Integer currentLoop = 0;

	public Executor(String sourcePathStr, String destPathStr, Boolean logToFileBoolean, Boolean logToConsoleBoolean, Boolean logStackTraceBoolean)
	{
		
		operations = new LinkedList<>();
		calledFunctions = new LinkedList<>();
		globalVariables = new HashMap<>();
		functions = new HashMap<>();
		sourcePath = sourcePathStr;
		destPath = destPathStr;
		toFile = logToFileBoolean;
		toConsole = logToConsoleBoolean;
		stackTrace = logStackTraceBoolean;
	}
	
	public void initCompilation()
	{
		ANTLRFileStream input;
		try {
			Log.init(destPath,toFile,toConsole);
			input = new ANTLRFileStream(sourcePath, ENCODING);
			ListLanguageLexer lexer = new ListLanguageLexer(input);	
			lexer.removeErrorListeners();
			lexer.addErrorListener(new ErrorListener());
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			ListLanguageParser parser = new ListLanguageParser(tokens);
			parser.removeErrorListeners();
			parser.addErrorListener(new ErrorListener());
			ParseTree tree = parser.compilation_unit();
			
			Helper helper = new Helper(this);
			new EvalVisitor(parser,this,helper).visit(tree);
			run();
		} catch (IOException e) {
			
			logErrors(e);
			System.out.println("Nieprawidłowy plik wejściowy");
		}
		catch(FunctionExecExcetpion e)
		{
			logErrors(e);
		}
		catch(RuntimeException e)
		{
			logErrors(e);
		}
		catch(Exception e)
		{
			logErrors(e);
		}
		
	}
	
	public void logErrors(Exception e)
	{
		e.printStackTrace();
		if(stackTrace != null)
		{
			Log.logStack(e);
		}
		Log.log(e.toString());
	}
	
	public HashMap<String, Element<?>> getGlobalVariables() {
		return globalVariables;
	}

	public void setGlobalVariables(HashMap<String, Element<?>> globalVariables) {
		this.globalVariables = globalVariables;
	}

	public LinkedList<Operation> getOperations() {
		return operations;
	}

	public void setOperations(LinkedList<Operation> operations) {
		this.operations = operations;
	}

	public LinkedList<FunctionCall> getCalledFunctions() {
		return calledFunctions;
	}

	public void setCalledFunctions(LinkedList<FunctionCall> calledFunctions) {
		this.calledFunctions = calledFunctions;
	}
	
	public HashMap<String, FunctionDefinition> getFunctions() {
		return functions;
	}

	public void setFunctions(HashMap<String, FunctionDefinition> functions) {
		this.functions = functions;
	}

	public void run()
	{
		for(Operation o : operations)
		{
			o.perform(this);
		}
	}
	
	public void print()
	{
		for (Map.Entry<String, Element<?>> entry : globalVariables.entrySet())
		{
		    System.out.println(entry.getKey() + "/" + entry.getValue());
		}
		
		for(Map.Entry<String, FunctionDefinition> entry : functions.entrySet())
		{
			System.out.println(entry.toString());
		}
	}
	
	public Element<?> getVar(String id,int line)
	{
		Element<?> res = null;
		if(calledFunctions.size() !=0)
		{
			res = calledFunctions.getFirst().getLocalVariables().get(id);
		}
		if(res == null)
			res = getGlobalVariables().get(id);
		if(res == null)
			throw new RuntimeException("Brak takiej zmiennej !!. LINIA: "+line);
		return res;
	}
	
	public ListElement getListElement(String id,int line)
	{
		ListElement elem = (ListElement) getVar(id,line);
		return elem;
	}
	
	public NumberElement getNumberElement(String id,int line)
	{
		NumberElement elem = (NumberElement) getVar(id,line);
		return elem;
	}
	
	public Integer getIntegerFromListIndex(String id, Integer index,int line) 
	{	
		if(index >= getListElement(id,line).getContent().size())
			throw new RuntimeException("Indeks poza zakresem listy. LINIA: "+line);
		return getListElement(id,line).getContent().get(index);	
	}
	
	public Element<?> callOuterFunction(FunCallArgument arg,int line)
	{
		FunctionCall fc = new FunctionCall(functions.get(arg.getFuncId()),arg.getFuncId(), line);
		fc.setArgs(arg.getArgs());
		fc.perform(this);
		return fc.getRet();
	}

	public Element<?> callArithmeticalOperation(Argument left,Argument right,ArithmeticalOperator ap,int line) {
		ArithmeticalOperation ao = new ArithmeticalOperation(line);
		ao.setLeftArg(left);
		ao.setRightArg(right);
		ao.setOperator(ap);
		ao.perform(this);
		return ao.getRet();
	}
	
	public Integer getCurrentLoop() {
		return currentLoop;
	}

	public void setCurrentLoop(Integer currentLoop) {
		this.currentLoop = currentLoop;
	}

}
