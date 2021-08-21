package LocatorTech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleParentChild {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","D:\\Selenium Files\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//*[@id='content']/ntp[3]/div/input")).sendKeys("fb");;

	}

}
