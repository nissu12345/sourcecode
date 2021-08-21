package LocatorTech;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentChild {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver","D:\\Selenium Files\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.udemy.com/course/online-login-authentication-system-without-database-using-php/");
		//driver.findElement(By.xpath("//*[@data-purpose='header']/div[6]")).click();
		
		/*
		 * need some clarity hoe to pick the div valuess
		 * now i have taken a parent xpath and given the div tag name with its value
		 * 
		 * i was unable to do // parents xpath/div/div/div[6]
		 */
		
		
	}

}
