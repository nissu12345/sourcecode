package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	
	public WebDriver driver;
	
	
	public LandingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	By Loginto = By.xpath("//span[contains(text(),'Login')]");
	
	By TextDisplayed =	By.xpath("//div[@class='text-center']");
	
	
	By NavigateBar = By.xpath("//header/div[2]/div[1]/nav[1]");
	
	
	
	//	By Login = By.cssSelector("a[href*='sign_in']");
	
	
	public LoginPage getLogin()
	{
		 driver.findElement(Loginto).click();
		 LoginPage op = new LoginPage(driver);
		 return op;
		 
	}

	public WebElement TextDisplayed()
	{
		return driver.findElement(TextDisplayed);
	}
		
	public WebElement NavigateBar()
	{
		return driver.findElement(NavigateBar);
	}

	

}
