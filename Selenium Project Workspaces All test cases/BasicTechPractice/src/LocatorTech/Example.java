// example two for the sibling and child-parent concept

package LocatorTech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","D:\\Selenium Files\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		/*	
		try {
			Thread.sleep(4000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		driver.findElement(By.xpath("//*[@for='radio2']/following-sibling::label[1]")).isDisplayed();
		 driver.findElement(By.xpath("//*[@for='radio2']/following-sibling::label/input")).getText();
		driver.findElement(By.xpath("//*[@for='radio2']/following-sibling::label/input")).click();
		
	*/	//siblings
		
		
	String s =	driver.findElement(By.xpath("//*[@id='dropdown-class-example']/parent::fieldset")).getText();

	System.out.println(s);
	
	//child parent
	
	}

}
