package Sec14;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Files\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.google.com/");
				
				
				TakesScreenshot ts = (TakesScreenshot)driver;
				
	File src = ts.getScreenshotAs(OutputType.FILE);
	
	FileUtils.copyFile(src, new File("C:\\Users\\nissa\\Screenshot.png"));
	
					
	
	//remember we have to use fileutils and if java cant take it take the jar file from the maven or opera--opera commons io download
	
	
	
}

}
