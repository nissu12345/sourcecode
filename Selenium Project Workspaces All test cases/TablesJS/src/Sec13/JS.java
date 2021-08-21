package Sec13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver","D:\\Selenium Files\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ksrtc.in/oprs-web/");
		
		// after sending beng we should select a place which contain airport
		
		
		driver.findElement(By.id("fromPlaceName")).sendKeys("beng");
		Thread.sleep(1000L);
		
//		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
//		
//		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		
		//System.out.println(driver.findElement(By.id("fromPlaceName")).getText());
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		String Text = "return document.getElementById(\"fromPlaceName\").value;";
		
		String place =	(String) js.executeScript(Text);
		
		
		
		int i =0;
	while(!place.equalsIgnoreCase("bengaluru Airport"))
	{
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		i++;
		Thread.sleep(1000L);
		
		 place = (String) js.executeScript(Text);
		 
		 System.out.println(place);
		 
		 if(i>10) 
		 {
			 break;
		 }
		
	}
	
	if(i>10)
	{
		System.out.println("element not found");
	}
	else 
	{
		System.out.println("element found");
	}
	
	driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ENTER);
	
	
// when u inspect the element and find a hidden text that means element is hidden to get it you should use js to get it
	//we cant get the text by using the getText of driver
	
	}

}
