package DropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class RadioBottons {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver","D:\\Selenium Files\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://spicejet.com");
		Thread.sleep(2000L);
		
		
		driver.findElement(By.xpath("//table[@class='tblTrip']/tbody/tr/td[2]/input")).click();
		
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			
			System.out.println("enabled");
			Assert.assertTrue(true);}
		
			else
			{
				Assert.assertFalse(false);
				System.out.println("not enabled");
			}
		}
		

	
	// is enabled is mal-funtioning so we use condition of the webelement that changes with enabling and disabling
	// every enable botton has its respective varaible that chages with enabling and disabilling
	
	}

// here we are not using the isEnabled as it is not showing right state
