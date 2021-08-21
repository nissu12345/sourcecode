package Sec13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript2 {

	public static void main(String[] args) {

		

			System.setProperty("webdriver.chrome.driver","D:\\Selenium Files\\chromedriver.exe");
					
					WebDriver driver = new ChromeDriver();
					
					driver.get("https://ksrtc.in/oprs-web/");
					int i=0;
					
				driver.findElement(By.id("fromPlaceName")).sendKeys("beng");
				
				
				
				JavascriptExecutor js = (JavascriptExecutor)driver;
				
				String script = "return document.getElementById(\"fromPlaceName\").value;";
				
		String Place	=	(String) js.executeScript(script);
		
		while(!Place.equalsIgnoreCase("bengaluru airport"))
		{
			
			i++;
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
			
			Place=(String) js.executeScript(script);
			
			if(i>10)
			{
				break;
			}
		}
		
		
		if(i>10)
		{
			System.out.println("element not found 2nd exec");
		}
		
		else 
		{
			System.out.println("element  found 2nd exec");
		}
				
		System.out.println(Place);		
	}

}
