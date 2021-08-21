package DropDowns;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaAlert {

	public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver","D:\\Selenium Files\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
	//	driver.findElement(By.id("alertbtn")).click();
		
		
		
		
		driver.findElement(By.id("name")).sendKeys("nissar");
		driver.findElement(By.id("confirmbtn")).click();
		
		Alert a = driver.switchTo().alert();
		
	System.out.println(a.getText());
	Thread.sleep(2000L);
		a.accept();
		

	}

}
