package LocatorTech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingTexttoLocate {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","D:\\Selenium Files\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.merriam-webster.com/dictionary/cuff%20link");
		
		
		driver.findElement(By.xpath("//*[text()='CUFF LINK']")).click();
		
	
		
		
		/*
		 * locating a element using text is done by using the xpath tech.
		 */
		
			}

}
