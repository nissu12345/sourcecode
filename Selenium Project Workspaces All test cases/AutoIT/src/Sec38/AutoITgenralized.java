package Sec38;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoITgenralized {

	
		
		
		public static void main(String[] args) throws  InterruptedException, IOException {
			
			
String DefaultDir		=	System.getProperty("User.dir");
			
			System.setProperty("webdriver.chrome.driver","D:\\Selenium Files\\chromedriver.exe");

			HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		    chromePrefs.put("profile.default_content_settings.popups", 0);
		    chromePrefs.put("download.default_directory", DefaultDir);
			
			ChromeOptions Options = new ChromeOptions();
			
			Options.setExperimentalOption("prefs", chromePrefs);
			
					WebDriver driver = new ChromeDriver(Options);
					
					
					
					
					driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
					
					driver.get("https://www.ilovepdf.com/word_to_pdf");
					
					driver.findElement(By.id("pickfiles")).click();
					
					
					Runtime.getRuntime().exec("C:\\Users\\nissa\\OneDrive\\Documents\\FlieToBeUploaded.exe");
					
					
//					driver.findElement(By.id("processTask")).click();
				
			WebDriverWait w = new WebDriverWait(driver, 5);
			w.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("pickfiles"))));
			
			
	//				driver.findElement(By.id("pickfiles")).click();

			File f= new File(DefaultDir + "/Fresher (1).pdf");
					
			if(f.exists())
			{
				System.out.println("file found");
			}
			else
			{
				System.out.println("file not found");
			}
					
f.delete();

	}

}
//**********************************//dont run virus issue...................