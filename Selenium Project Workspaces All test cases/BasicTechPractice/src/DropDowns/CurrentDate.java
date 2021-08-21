package DropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CurrentDate {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","D:\\Selenium Files\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://spicejet.com");
		Thread.sleep(1000L);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
		
		Thread.sleep(2000L);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		//driver.findElement(By.xpath("//a[@class='ui-state-default.ui-state-highlight.ui-state-active']")).click();
// selecting the current date,create the locator basing on the highlight text.
		// remove the spaces if any present in the class attribute to write a css locator
	}

}
