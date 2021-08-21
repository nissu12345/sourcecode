package screens;

import java.io.File;

import org.apache.commons.io.FileUtils;

public class screens2 {
	
	public static void main(String[] args)
	{
System.setProperty("webdriver.chrome.driver","D:\\Selenium Files\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		
		 TakesScreenshot scrShot =((TakesScreenshot)driver);

	        //Call getScreenshotAs method to create image file

	                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

	            //Move image file to new destination

	            

	                //Copy file at destination

	                FileUtils.copyFile(SrcFile, );

		
	}

}
