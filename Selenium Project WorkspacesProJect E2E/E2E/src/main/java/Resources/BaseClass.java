package Resources;

import java.io.File;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public WebDriver driver;
	
public Properties prop;
	
	
	public WebDriver Intiallization() throws IOException
	{
		
			 prop = new Properties();
		
		FileInputStream fis = new FileInputStream("F:\\Selenium Project WorkspacesProJect\\E2E\\src\\main\\java\\Resources\\Data.properties");
		
		prop.load(fis);
		
			
		
		String BrowserNew = prop.getProperty("browser");
				
		if(BrowserNew.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","D:\\Selenium Files\\chromedriver.exe");
			
			driver = new ChromeDriver();
			
			driver.get("https://qaclickacademy.com");
		}
		
		else if (BrowserNew.equals("Firefox"))
		{
			/*
			 * System.setProperty("webdriver.gecko.driver","Path_of_Firefox_Driver");//not having driver on machine
 driver = new FirefoxDriver(); 
			 */
		}
		
		else if(BrowserNew.equals("Ie"))
		{
			/*
			 *  System.setProperty("webdriver.ie.driver", "Path_of_Firefox_Driver");//not having driver on machine
			 *    driver=new InternetExplorerDriver(); 
			 */
		}
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}

	public void ScreenShotPath(String Method,WebDriver driver) throws IOException
	{
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		String DestinationFile = System.getProperty("user.dir")+"\\reports\\"+Method+".png";
				
		FileUtils.copyFile(src, new File(DestinationFile));
}
	
}


