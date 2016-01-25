package app;

import execution.Executor;
import jargs.gnu.CmdLineParser;

public class Main {


	

	public static void main(String[] args) {
	
		
		CmdLineParser parser = new CmdLineParser();
	    CmdLineParser.Option logToFile     		= parser.addBooleanOption('l', "Logowanie do pliku");
	    CmdLineParser.Option logToConsole    	= parser.addBooleanOption('c', "Logowanie do konsoli");
	    CmdLineParser.Option logStackTrace      = parser.addBooleanOption('t', "Logowanie stackTrace");
       	CmdLineParser.Option sourcePath  		= parser.addStringOption ('s', "Ścieżka do pliku z kodem źródłowym");
       	CmdLineParser.Option destPath      		= parser.addStringOption('w', "Ścieżka do pliku wynikowego (Domyślnie w formacie data,czas)");
       	CmdLineParser.Option helpOpt          	= parser.addBooleanOption('h', "Pomoc");
        try {
    			parser.parse(args);
    	} 
        catch (CmdLineParser.OptionException e) 
        {
        	System.exit(1);
        }
        Boolean help = (Boolean) parser.getOptionValue(helpOpt);
        if(help != null)
        {
        	showHelp();
        }
        String sourcePathStr = (String) parser.getOptionValue(sourcePath);
        String destPathStr = (String) parser.getOptionValue(destPath);
        Boolean logToFileBoolean = (Boolean) parser.getOptionValue(logToFile);
        Boolean logToConsoleBoolean = (Boolean) parser.getOptionValue(logToConsole);
        Boolean logStackTraceBoolean = (Boolean) parser.getOptionValue(logStackTrace);

		Executor exec = new Executor(sourcePathStr,destPathStr,logToFileBoolean,logToConsoleBoolean,logStackTraceBoolean);
		exec.initCompilation();
	
	}

	private static void showHelp() {
		StringBuilder sb = new StringBuilder();
		sb.append("POMOC"+System.lineSeparator());
		sb.append("-l Logowanie do pliku"+System.lineSeparator());
		sb.append("-c Logowanie do konsoli"+System.lineSeparator());
		sb.append("-s Ścieżka do pliku z kodem źródłowym"+System.lineSeparator());
		sb.append("-w Ścieżka do pliku wynikowego"+System.lineSeparator());
		sb.append("-h Pomoc"+System.lineSeparator());
		System.out.print(sb.toString());
		
	}

}
