package RedifOF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePOF {
	
	
	WebDriver driver;
	
	public HomePagePOF(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
		
	}
// page factory need the driver info so we pass it in the constructor	

	
	@FindBy(xpath="//input[@name='srchword']")
	WebElement Search;
	
	
	@FindBy(className="newsrchbtn")
	WebElement SearchBotton;
	
	
	
	public WebElement Search()
	{
		return Search;
	}
	

	public WebElement SearchBotton()
	{
		return SearchBotton;
	}
}
