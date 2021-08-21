package Syncronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitExplicitWaits {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","D:\\Selenium Files\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://spicejet.com");
		
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
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
			}
			

			else
			{
				
				System.out.println("enabled");
			}
	
		
		String value =	s.getFirstSelectedOption().getText();
		
		System.out.println(value);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		//wait.until(ExpectedConditions.presenceOfElementLocated((By) driver.findElement(By.xpath("//div[@class='next-buttons']"))));

		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='btnOKToBoardTnC']"))));
		
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='btnOKToBoardTnC']")));

		driver.findElement(By.xpath("//input[@id='btnOKToBoardTnC']")).click();
		driver.findElement(By.xpath("//div[@class='next-buttons']")).click();
		
		// above is the example of implicit and explicit waits
		
		// explicit wait is applied when search is loaded for the tickets and  condition is given to wait until required element is displayed
	}

}
