package LocatorTech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegularExp {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","D:\\Selenium Files\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.xpath("//*[contains(@autocomplete,'username')]")).sendKeys("nissarahmedsyed2648@gmail.com");;
		driver.findElement(By.cssSelector("[name*=pass]")).sendKeys("76609");;
		driver.findElement(By.cssSelector("button#loginbutton")).click();
		
		// TODO Auto-generated method stub

	}

}
