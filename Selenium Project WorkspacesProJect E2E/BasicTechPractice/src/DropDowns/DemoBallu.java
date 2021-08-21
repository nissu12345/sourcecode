package DropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoBallu {

	public static void main(String[] args) throws InterruptedException {
		

System.setProperty("webdriver.chrome.driver","D:\\Selenium Files\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("nissarahmedsyed2648");
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Applenissar");
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}
