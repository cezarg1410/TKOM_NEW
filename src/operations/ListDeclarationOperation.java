package operations;

import java.util.ArrayList;

import elements.Element;
import elements.ListElement;
import execution.Executor;
import operations.arguments.Argument;
import operations.arguments.ArithmeticalArgument;
import operations.arguments.FunCallArgument;

public class ListDeclarationOperation extends Operation {

	ArrayList<Integer> var;
	Argument arg;
	
	public ListDeclarationOperation(String id, ArrayList<Integer> list,int line)
	{
		this.id =id;
		this.var = list;
		this.line = line;
	}

	public ListDeclarationOperation(String id, Argument arg)
	{
		this.id = id;
		this.arg = arg;
	}

	
	@Override
	public void perform(Executor exec) {
		
		if(var == null)
		{
			if( arg instanceof FunCallArgument)
			{
				FunCallArgument fc = (FunCallArgument) arg;
				Element<?> ret = exec.callOuterFunction(fc,line);
				if(ret instanceof ListElement)
				{
					ListElement le = (ListElement) ret;
					var = le.getContent();
				}	
			}
			else if (arg instanceof ArithmeticalArgument )
			{
				ArithmeticalArgument aa = (ArithmeticalArgument) arg;
				Element <?> ret = exec.callArithmeticalOperation(aa.getArgs().get(0),aa.getArgs().get(1),aa.getOperator(),line);
				if (ret != null)
				{
					if(!(ret.getContent() instanceof ArrayList))
						throw new RuntimeException("Nieprawdiłowy typ przypisywany do zmiennej. LINIA:"+line);
					ListElement ls = (ListElement) ret;
					var = ls.getContent();
				}
			}
			else 
				throw new RuntimeException("Niepoprawny argument deklaracji listy. LINIA: "+line);
			
			
		}
		if(!(var instanceof ArrayList))
			throw new RuntimeException("Nieprawdiłowy typ przypisywany do zmiennej. LINIA:"+line);
		ListElement l = new ListElement(var,line);
		if(exec.getCalledFunctions().size() == 0)
		{
			exec.getGlobalVariables().put(id, l);
		}
		else
		{
			exec.getCalledFunctions().getFirst().getLocalVariables().put(id, l);
		}
		var = null;
		
	}
}
