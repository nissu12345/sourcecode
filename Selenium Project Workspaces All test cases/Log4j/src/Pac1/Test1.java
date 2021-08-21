package Pac1;




import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Test1 {
	
	private static Logger Log =  LogManager.getLogger(Test1.class.getName());

	public static void main(String[] args) 
	
	{
		
Log.error("errro case");

Log.info("general info");

Log.debug("debug the case");

Log.fatal("fatal error case");
	}

}
