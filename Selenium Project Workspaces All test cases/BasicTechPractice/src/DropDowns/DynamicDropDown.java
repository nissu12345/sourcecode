package DropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","D:\\Selenium Files\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");

		driver.findElement(By.xpath("//input[@class='select_CTXT']")).sendKeys("hyd");
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).sendKeys("london");
		
		
		/*
		 * in general dynamic  dropdown we have to select a webelement  by giving its locator
		 * from location can be giving normally
		 * to location we have to indicate the index as it will be available in from box also or we can can go for parent child traversing 
		 */
		
		// this site has became auto suggestive,this is an auto suggestive case
	}

}
