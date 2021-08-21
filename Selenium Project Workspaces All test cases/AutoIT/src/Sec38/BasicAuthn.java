package Sec38;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthn {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","D:\\Selenium Files\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
	driver.get("http://admin:admin@the-internet.herokuapp.com");
	
	driver.findElement(By.linkText("Basic Auth")).click();
		
	

	}

}
