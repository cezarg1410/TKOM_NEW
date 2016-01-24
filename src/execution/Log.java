package execution;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.*;


public class Log {

	private static Logger logger = null;
	private static Log log = null;
	private static final String LOG_DIR = "./txt/";
	private static final String LOG_EXT = ".txt";
	private static ConsoleHandler consoleHandler;
	private static FileHandler fileHandler;

	private Log() throws SecurityException, IOException
	{
		logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		logger.setLevel(Level.ALL);
		consoleHandler = new ConsoleHandler();
		consoleHandler.setLevel(Level.ALL);
		String fn = createFileName();
		fileHandler = new FileHandler(LOG_DIR+fn);
		consoleHandler.setFormatter(new SimpleFormatter());
		fileHandler.setFormatter(new SimpleFormatter());
		logger.addHandler(consoleHandler);
		logger.addHandler(fileHandler);
	}	
	
	private static void logAll(String msg)
	{
		StringBuilder msgToLog = new StringBuilder();
		msgToLog.append(msg+System.lineSeparator());
		msgToLog.append("---------------------------------------------------------"+System.lineSeparator());
		logger.log(Level.ALL, msgToLog.toString());
	}
	
	private static String createFileName()
	{
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
		Date now = new Date();
		String strDate = sdf.format(now);
		return strDate + LOG_EXT;
	}
	
	// Called once in Executor
	public static void init() throws SecurityException, IOException
	{
		if(log == null)
			log = new Log();
	}
	
	public static void log(String msg)
	{
		logAll(msg);
	}

}

