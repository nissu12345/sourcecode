package Package;

import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.LandingPage;
import Resources.BaseClass;
import junit.framework.Assert;

public class Validation extends BaseClass {
	
	public WebDriver driver;
	private static Logger Log =  LogManager.getLogger(Validation.class.getName());
	
	
	
@BeforeTest
	
	public void Intialization() throws IOException
	{
		driver=Intiallization();
		driver.get("http://www.qaclickacademy.com/");
		
		Log.info("homepage landed");
	}
	
	@SuppressWarnings("deprecation")
	@Test
	
	public void UseCase() throws IOException, InterruptedException
	{
		
		//driver.get(prop.getProperty("url")); //throwing security error
	
		LandingPage hm = new LandingPage(driver);
		Assert.assertEquals(hm.TextDisplayed().getText(), "FEATURED COURSES");
		Log.info("Text is validated");
	}
	
	@AfterTest
	
	public void teardown()
	{
		driver.close();
	}
	
	
	
	
	}


