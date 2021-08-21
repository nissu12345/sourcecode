package Firstcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class spicejet {
	
	public static void main(String[] args)
	{
		
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Files\\chromedriver.exe");
			
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.spicejet.com/");
	driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Thiruvananthapuram (TRV)')]")).click();

		
	}

}
