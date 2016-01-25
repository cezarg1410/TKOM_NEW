package execution;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.*;

public class Log {

	private static Logger logger = null;
	private static Log log = null;
	private static ConsoleHandler consoleHandler;
	private static FileHandler fileHandler;
	private static String fileStr;
	private static final String EXT = ".txt";
	private static final String FILE = "./txt/";
	private static String createdStr;

	Log(Boolean toFile, Boolean toConsole, String destPath) throws SecurityException, IOException
	{
		logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		logger.setLevel(Level.ALL);
		if(toConsole != null)
		{
			consoleHandler = new ConsoleHandler();
			consoleHandler.setLevel(Level.ALL);
			consoleHandler.setFormatter(new SimpleFormatter());
			logger.addHandler(consoleHandler);
		}
		if(toFile != null)
		{
			fileStr = destPath;
			if(fileStr == null)
			{
				createdStr = FILE + createFileName();
				fileHandler = new FileHandler(createdStr + EXT);
			}
			else
				fileHandler = new FileHandler(fileStr);
			
			fileHandler.setFormatter(new SimpleFormatter());
			logger.addHandler(fileHandler);
		}
	}	
	
	private static void logAll(String msg)
	{
		StringBuilder msgToLog = new StringBuilder();
		msgToLog.append(msg+System.lineSeparator());
		msgToLog.append("---------------------------------------------------------"+System.lineSeparator());
		logger.log(Level.ALL, msgToLog.toString());
	}

	// Called once in Executor
	public static void init(String destPath, Boolean toFile, Boolean toConsole) throws SecurityException, IOException
	{
		if(log == null)
			log = new Log(toFile,toConsole,destPath);
	}
	
	public static void log(String msg)
	{
		logAll(msg);
	}
	
	public static void logStack(Exception e)
	{
		String fileName;
		if(fileStr != null)
		{
			fileName = fileStr;
		}
		else
		{
			fileName = createdStr + "_STACK_TRACE_" + EXT;
		}
		File file = new File(fileName);
		
		try (PrintStream ps = new PrintStream(file)){	
			e.printStackTrace(ps);
		} catch (Exception ex) {
		    System.out.println("Błąd podczas logowanie StackTrace");
		}
	}
	
	private static String createFileName()
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
		Date now = new Date();
		String strDate = sdf.format(now);
		return strDate;
	}
}

