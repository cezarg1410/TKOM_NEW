package elements.buildInFuncs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import elements.Element;
import elements.ListElement;
import elements.NumberElement;
import execution.Executor;
import execution.Log;
import execution.exceptions.FunctionExecExcetpion;
import operations.arguments.Argument;
import operations.arguments.VariableArgument;
import utils.Utils;

public class BuildInFunction {
	
	public static Element<?> call(Executor exec, ArrayList<Argument> args, String id,int line) {
		if(id.equals(BuildInFunctionsEnum.append.toString()))
		{
			append(exec,args,line);
			return null;
		}
		else if(id.equals(BuildInFunctionsEnum.appendAt.toString()))
		{
			appendAt(exec,args,line);
			return null;
		}
		else if(id.equals(BuildInFunctionsEnum.delete.toString()))
		{
			delete(exec,args,line);
			return null;
		}
		else if(id.equals(BuildInFunctionsEnum.deleteAll.toString()))
		{
			deleteAll(exec,args,line);
			return null;
		}
		else if(id.equals(BuildInFunctionsEnum.deleteFrom.toString()))
		{
			deleteFrom(exec,args,line);
			return null;
		}
		else if(id.equals(BuildInFunctionsEnum.sublist.toString()))
		{
			return sublist(exec,args,line);
		}
		else if(id.equals(BuildInFunctionsEnum.equal.toString()))
		{
			return equal(exec, args,line);
		}
		else if(id.equals(BuildInFunctionsEnum.sort.toString()))
		{
			return sort(exec,args,line);
		}
		else if(id.equals(BuildInFunctionsEnum.printf.toString()))
		{
			print(exec,args,line);
		}
		return null;
		
	}
	
	
	private static Element<?> sublist(Executor exec, ArrayList<Argument> args,int line) {
		if(args.size() != 3)
			throw new FunctionExecExcetpion("Nieprawidłowa ilosć argumentów funkcji append. LINIA: "+line);
		
		Element<?> list = Utils.calcArgument(args.get(0), exec,line);
		if(!(list instanceof ListElement))
			throw new FunctionExecExcetpion("Pierwszy argument funkcji sublist nie jest listą. LINIA: "+line);
		
		
		Element<?> first = Utils.calcArgument(args.get(1), exec,line);
		if(!(first instanceof NumberElement))
			throw new FunctionExecExcetpion("Drugi argument funkcji sublist nie jest liczbą. LINIA: "+line);
		
		Element<?> second = Utils.calcArgument(args.get(2), exec,line);
		if(!(second instanceof NumberElement))
			throw new FunctionExecExcetpion("Trzeci argument funkcji sublist nie jest liczbą. LINIA: "+line);
		
		ListElement rList = (ListElement) list; 
		NumberElement from = (NumberElement) first;
		NumberElement to = (NumberElement) second;
		
		if(from.getContent() <0 || from.getContent() > rList.getContent().size()-1 || to.getContent() < 0 
				|| to.getContent() > rList.getContent().size() -1 || to.getContent() < from.getContent())
			throw new RuntimeException("Niepoprawne wartości liczbowe funkcji sublist. LINIA: "+line);
		List<Integer> res = rList.getContent().subList(from.getContent(), to.getContent());
		ArrayList<Integer> toAdd = new ArrayList<>();
		toAdd.addAll(res);
		return new ListElement(toAdd,line);
	}


	private static void delete(Executor exec, ArrayList<Argument> args,int line) {
		if(args.size() != 2)
			throw new FunctionExecExcetpion("Nieprawidłowa ilosć argumentów funkcji append. LINIA: "+line);
		Element<?> first = Utils.calcArgument(args.get(0), exec,line);
		if(!(first instanceof ListElement))
			throw new FunctionExecExcetpion("Pierwszy argument funkcji delete nie jest listą. LINIA: "+line);
		Element<?> second = Utils.calcArgument(args.get(1), exec,line);
		if(!(second instanceof NumberElement))
			throw new FunctionExecExcetpion("Drugi argument funkcji delete nie jest liczbą. LINIA: "+line);
		ListElement list = (ListElement) first;
		NumberElement val = (NumberElement) second;
		list.getContent().remove(val.getContent());
	}
	
	private static void deleteFrom(Executor exec, ArrayList<Argument> args,int line) {
		if(args.size() != 2)
			throw new FunctionExecExcetpion("Nieprawidłowa ilosć argumentów funkcji append. LINIA: "+line);
		Element<?> first = Utils.calcArgument(args.get(0), exec,line);
		if(!(first instanceof ListElement))
			throw new FunctionExecExcetpion("Pierwszy argument funkcji deleteFrom nie jest listą. LINIA: "+line);
		Element<?> second = Utils.calcArgument(args.get(1), exec,line);
		if(!(second instanceof NumberElement))
			throw new FunctionExecExcetpion("Drugi argument funkcji deleteFrom nie jest liczbą. LINIA: "+line);
		ListElement list = (ListElement) first;
		NumberElement val = (NumberElement) second;
		list.getContent().remove(val.getContent().intValue());
		
	}
	
	private static void deleteAll(Executor exec, ArrayList<Argument> args,int line)
	{
		if(args.size() != 2)
			throw new FunctionExecExcetpion("Nieprawidłowa ilosć argumentów funkcji append. LINIA: "+line);
		Element<?> first = Utils.calcArgument(args.get(0), exec,line);
		if(!(first instanceof ListElement))
			throw new FunctionExecExcetpion("Pierwszy argument funkcji deleteAll nie jest listą. LINIA: "+line);
		Element<?> second = Utils.calcArgument(args.get(1), exec,line);
		if(!(second instanceof NumberElement))
			throw new FunctionExecExcetpion("Drugi argument funkcji deleteAll nie jest liczbą. LINIA: "+line);
		ListElement list = (ListElement) first;
		NumberElement val = (NumberElement) second;
		while(list.getContent().remove(val.getContent())) { }

	}
	

	public static void append(Executor exec,ArrayList<Argument> args,int line)
	{
		if(args.size() != 2)
			throw new FunctionExecExcetpion("Nieprawidłowa ilosć argumentów funkcji append. LINIA: "+line);
		Element<?> first = Utils.calcArgument(args.get(0), exec,line);
		if(!(first instanceof ListElement))
			throw new FunctionExecExcetpion("Pierwszy argument funkcji append nie jest listą. LINIA: "+line);
		Element<?> second = Utils.calcArgument(args.get(1), exec,line);
		if(!(second instanceof NumberElement))
			throw new FunctionExecExcetpion("Drugi argument funkcji append nie jest liczbą. LINIA: "+line);
		ListElement list = (ListElement) first;
		NumberElement val = (NumberElement) second;
		list.getContent().add(val.getContent());
		
	}


	private static void appendAt(Executor exec, ArrayList<Argument> args,int line) {
		if(args.size() != 3)
			throw new FunctionExecExcetpion("Nieprawidłowa ilosć argumentów funkcji append. LINIA: "+line);
		Element<?> first = Utils.calcArgument(args.get(0), exec,line);
		if(!(first instanceof ListElement))
			throw new FunctionExecExcetpion("Pierwszy argument funkcji appendAt nie jest listą. LINIA: "+line);
		Element<?> second = Utils.calcArgument(args.get(1), exec,line);
		if(!(second instanceof NumberElement))
			throw new FunctionExecExcetpion("Drugi argument funkcji appendAt nie jest liczbą. LINIA: "+line);
		Element<?> third = Utils.calcArgument(args.get(2), exec,line);
		if(!(third instanceof NumberElement))
			throw new FunctionExecExcetpion("Trzeci argument funkcji appendAt(Indeks) nie jest liczbą. LINIA: "+line);
		ListElement list = (ListElement) first;
		NumberElement val = (NumberElement) second;
		NumberElement idx = (NumberElement) third;
		
		list.getContent().add(idx.getContent(), val.getContent());
		
	}
	private static Element<?> equal(Executor exec, ArrayList<Argument> args,int line)
	{
		if(args.size() != 2)
			throw new FunctionExecExcetpion("Nieprawidłowa ilosć argumentów funkcji equal. LINIA: "+line);
		Element<?> first = Utils.calcArgument(args.get(0), exec,line);
		Element<?> second = Utils.calcArgument(args.get(1), exec,line);
		
		if(!first.getClass().equals(second.getClass()))
			throw new FunctionExecExcetpion("Nie można porównywać dwóch argumentów różnych typów. LINIA: "+line);
		if(first instanceof ListElement && second instanceof ListElement)
		{
			ListElement f = (ListElement) first;
			ListElement s = (ListElement) second;
			
			ArrayList<Integer> fir = f.getContent();
			ArrayList<Integer> sec = s.getContent();
			
			if (fir == null && sec == null)
			{
				return new NumberElement(1,line);
			}

		    if((fir == null && sec != null) 
		      || sec != null && fir == null
		      || fir.size() != sec.size())
		    {
		    	return new NumberElement(0,line);
		    }

		    Collections.sort(fir);
		    Collections.sort(sec);
		    if(fir.equals(sec))
		    {
		    	return new NumberElement(1,line);
		    }
		    return new NumberElement(0,line);   
		}
		else
		{
			NumberElement f = (NumberElement) first;
			NumberElement s = (NumberElement) second;
			if(f.getContent().equals(s.getContent()))
				return new NumberElement(1,line);
			return new NumberElement(0,line);
		}
		
	}
	private static Element<?> sort(Executor exec, ArrayList<Argument> args,int line)
	{
		if(args.size() != 1)
			throw new FunctionExecExcetpion("Nieprawidłowa ilosć argumentów funkcji sort. LINIA: "+line);
		Element<?> list = Utils.calcArgument(args.get(0), exec,line);
		if(!(list instanceof ListElement))
			throw new FunctionExecExcetpion("Nieprawidłowa argument funkcji sort. Oczekiwany listy. LINIA: "+line);
		ListElement le = (ListElement) list;
		ArrayList<Integer> res = new ArrayList<>();
		le.getContent().forEach((v)->res.add(v));
		Collections.sort(res);
		return new ListElement(res,line);
	}
	private static void print(Executor exec, ArrayList<Argument> args,int line)
	{
		if(args.size() != 1)
			throw new FunctionExecExcetpion("Nieprawidłowa ilosć argumentów funkcji print. LINIA: "+line);
		Element<?> elem = Utils.calcArgument(args.get(0), exec,line);
		String id = null;
		if(args.get(0) instanceof VariableArgument)
		{
			VariableArgument va = (VariableArgument) args.get(0);
			id = va.getVarId();
		}
		String msg = id==null ? ("LINIA: "+ line + " " + elem.toString()) : ("LINIA: "+ line + " " + " ID: " + id + ". " +  elem.toString()) ;
		Log.log(msg);
	}
}
