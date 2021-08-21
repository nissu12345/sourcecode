package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	
	public WebDriver driver;
	
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	By Email = By.xpath("//input[@type='email']");
	
	By PassWord = By.xpath("//input[@type='password']");
	
	
	By Login = By.xpath("//input[@type='submit']");
	
	
	By ForgotPassword = By.cssSelector("[href*='password/new']");
	
	
	
	//	By Login = By.cssSelector("a[href*='sign_in']"); not working for me
	
	
	
	
	
	public WebElement Email()
	{
		return driver.findElement(Email);
	}
	
	public WebElement PassWord()
	{
		return driver.findElement(PassWord);
	}
	
	public WebElement Login()
	{
		return driver.findElement(Login);
	}

	public ForgotPass ForgotPassword()
	{
		 driver.findElement(ForgotPassword).click();
		 ForgotPass fp = new ForgotPass(driver);
		 return fp;
	}

}
