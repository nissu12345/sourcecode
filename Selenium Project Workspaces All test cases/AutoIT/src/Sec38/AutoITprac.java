package Sec38;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutoITprac {

	public static void main(String[] args) throws  InterruptedException, IOException {
		
System.setProperty("webdriver.chrome.driver","D:\\Selenium Files\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		
		driver.findElement(By.id("pickfiles")).click();
		
		
		Runtime.getRuntime().exec("C:\\Users\\nissa\\OneDrive\\Documents\\FlieToBeUploaded.exe");
		
		
//		driver.findElement(By.id("processTask")).click();
//		
//		
WebDriverWait w = new WebDriverWait(driver, 5);
w.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("pickfiles"))));

//driver.findElement(By.id("pickfiles")).click();

File f= new File("C:\\Users\\nissa\\Downloads\\Fresher (1).pdf");
		
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