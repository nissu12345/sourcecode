package Package;

import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import org.apache.logging.log4j.*;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.LandingPage;
import Resources.BaseClass;
import junit.framework.Assert;
import org.apache.logging.log4j.*;
public class ValidationBar extends BaseClass {
	
	public WebDriver driver;
	
	private static Logger Log =  LogManager.getLogger(ValidationBar.class.getName());
	
	
@BeforeTest
	
	public void Intialization() throws IOException
	{
		driver=Intiallization();
		driver.get("http://www.qaclickacademy.com/");
	}
	
	
	@Test
	
	public void UseCase() throws IOException, InterruptedException
	{
		
		LandingPage hm = new LandingPage(driver);
		
		Assert.assertTrue(hm.NavigateBar().isDisplayed());
		
		Log.info("validated element is displayed");
		
	}
	
@AfterTest
	
	public void teardown()
	{
		driver.close();
	}

// this should close individual windows after resp operations.
	}


