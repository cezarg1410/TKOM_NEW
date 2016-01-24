package operations;

import elements.Element;
import elements.NumberElement;
import execution.Executor;
import operations.arguments.Argument;
import operations.arguments.ArithmeticalArgument;
import operations.arguments.FunCallArgument;

public class NumberDeclarationOperation extends Operation{

	Integer var = null;
	Argument arg;
	
	public NumberDeclarationOperation(String id, Integer var,int line)
	{
		this.id =id;
		this.var = var;
		this.line = line;
		
	}
	
	public NumberDeclarationOperation(String id, Argument arg,int line)
	{
		this.id = id;
		this.arg = arg;
		this.line = line;
	}

	@Override
	public void perform(Executor exec) {
		
		if(var == null)
		{	
			if(arg instanceof FunCallArgument)
			{
				FunCallArgument fc = (FunCallArgument) arg;
				Element<?> ret = exec.callOuterFunction(fc,line);
				if(!(ret.getContent() instanceof Integer))
					throw new RuntimeException("Nieprawdiłowy typ przypisywany do zmiennej. LINIA:"+line);
				var = (Integer)ret.getContent();
			}
			else
			{
				ArithmeticalArgument aa = (ArithmeticalArgument) arg;
				Element <?> ret = exec.callArithmeticalOperation(aa.getArgs().get(0),aa.getArgs().get(1),aa.getOperator(),line);
				if (ret != null)
				{
					if(!(ret.getContent() instanceof Integer))
						throw new RuntimeException("Nieprawdiłowy typ przypisywany do zmiennej. LINIA:"+line);
					var = (Integer)ret.getContent();
				}
			}
			
		}
		
		NumberElement l = new NumberElement(var,line);
		if(exec.getCalledFunctions().size() == 0)
		{
			exec.getGlobalVariables().put(id, l);
		}
		else
		{
			exec.getCalledFunctions().getFirst().getLocalVariables().put(id, l);
		}
		
	}

}
