package GlobalVariables;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Property {

	public static void main(String[] args) throws IOException {
		
		
		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream("F:\\Selenium Project Workspaces\\FrameWork\\src\\GlobalVariables\\data.properties");
		
prop.load(fis);

System.out.println(prop.getProperty("browser"));

prop.setProperty("browser", "firefox");

System.out.println(prop.getProperty("browser"));

FileOutputStream fos = new FileOutputStream("F:\\Selenium Project Workspaces\\FrameWork\\src\\GlobalVariables\\data.properties");

prop.store(fos, null);




	}

}
