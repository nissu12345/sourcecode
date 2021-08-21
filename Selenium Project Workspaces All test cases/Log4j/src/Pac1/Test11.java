package Pac1;




import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test11 {
	
	private static Logger Log =  LogManager.getLogger(Test11.class.getName());

	public static void main(String[] args) 
	
	{
		
Log.error("errro case 11");

Log.info("general info 11");

Log.debug("debug the case 11");

Log.fatal("fatal error case 11");
	}

}
