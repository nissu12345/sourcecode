package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPass {
	
	
	public WebDriver driver;
	
	
	public ForgotPass(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	By Loginto = By.xpath("//input[@id='user_email']");
	
	By SendMeInstructions =	By.xpath("//body/section[@id='hero']/div[1]/form[1]/div[2]/input[1]");
	
	
		
	//	By Login = By.cssSelector("a[href*='sign_in']");
	
	
	

	public WebElement Loginto()
	{
		return driver.findElement(Loginto);
	}
		
	public WebElement SendMeInstructions()
	{
		return driver.findElement(SendMeInstructions);
	}



}
