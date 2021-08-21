package RedifOF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogginPage {
	
	
	WebDriver driver;
	
	public LogginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By Username = By.xpath("//input[@id='login1']");
	
	By Password = By.id("password");

	By Signin = By.name("proceed");
	
	
	By Backtohome = By.linkText("rediff.com");
	
	
	
	public WebElement Username()
	{
		return driver.findElement(Username);
	}
	
	public WebElement Password()
	{
		return driver.findElement(Password);
	}
	
	

	public WebElement Signin()
	{
		return driver.findElement(Signin);
	}
	
	public WebElement Backtohome()
	{
		return driver.findElement(Backtohome);
	}
}
