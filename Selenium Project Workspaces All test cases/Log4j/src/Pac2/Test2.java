package Pac2;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Pac1.Test1;

public class Test2 {

	private static Logger Logg =  LogManager.getLogger(Test1.class.getName());
	public static void main(String[] args) {
	
		Logg.error("errro case 2 ");

		Logg.info("general info 2");

		Logg.debug("debug the case 2");

		Logg.fatal("fatal error case 2");

	}

}
