package DropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class E2ESpicejet {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Files\\chromedriver.exe");
		
WebDriver driver = new ChromeDriver();
		
		driver.get("https://spicejet.com");
		
		Thread.sleep(2000L);


		
		driver.findElement(By.xpath("//input[@class='select_CTXT']")).sendKeys("hyd");
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).sendKeys("london");
		
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		
		
WebElement StaticDrop = driver.findElement(By.xpath("//*[@name='ctl00$mainContent$DropDownListCurrency']"));


		
		Select s = new Select(StaticDrop);

		s.selectByVisibleText("USD");
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5"))
		{
			
			System.out.println("disabled");
			Assert.assertTrue(true);}

			else
			{
				Assert.assertFalse(false);
				System.out.println("enabled");
			}
	
		
		String value =	s.getFirstSelectedOption().getText();
		
		System.out.println(value);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}

}

