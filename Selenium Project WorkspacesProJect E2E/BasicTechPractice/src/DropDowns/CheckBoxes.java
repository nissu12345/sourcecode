package DropDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","D:\\Selenium Files\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://spicejet.com");
		
		Thread.sleep(3000L);
		driver.findElement(By.xpath("//input[@name='ctl00$mainContent$chk_friendsandfamily']")).click();
		System.out.println(driver.findElement(By.xpath("//input[@name='ctl00$mainContent$chk_friendsandfamily']")).isSelected());
		// step to check whether the checkbox is selected 
	int size =	driver.findElements(By.xpath("//input[@type='checkbox']")).size();
	//commom xpath to find the number of the checkboxes
	System.out.println(size);
	/*	
		
	List<WebElement> box =	driver.findElements(By.xpath("//div[@id='discount-checkbox']/div"));
	
	for(WebElement bo: box)
	{
		bo.click();
		Thread.sleep(2000L);
	}code to select the checkboxes using for loop
	*/
	
	
	}

}
