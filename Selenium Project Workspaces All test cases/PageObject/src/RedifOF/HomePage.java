package RedifOF;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By Search = By.xpath("//input[@name='srchword']");
	By SearchBotton = By.className("newsrchbtn");
	
	
	
	public WebElement Search()
	{
		return driver.findElement(Search);
	}
	

	public WebElement SearchBotton()
	{
		return driver.findElement(SearchBotton);
	}
}
