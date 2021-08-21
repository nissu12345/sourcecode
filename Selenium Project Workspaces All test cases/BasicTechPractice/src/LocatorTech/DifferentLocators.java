package LocatorTech;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class DifferentLocators {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Files\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.xpath("//*[@autocomplete='username']")).sendKeys("nissarahmedsyed2648@gmail.com");;
		
		driver.findElement(By.cssSelector("[name='pass']")).sendKeys("7660920282");;
		
		driver.findElement(By.cssSelector("button#loginbutton")).click();
		
		int a = driver.findElements(By.tagName("a")).size();
		
		System.out.println(a);
		
		
	//	System.out.println(driver.findElement(By.linkText("Forgotten password?")).getText());
		
		/*
		 * css
		 * xpath
		 * id
		 * tagname
		 * classname
		 * linltext
		 * anchor a-- link
		 * 
		 */
		
		
		
	}

}
