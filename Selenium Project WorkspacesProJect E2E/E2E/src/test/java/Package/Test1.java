package Package;


import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;

import java.io.IOException;


import org.apache.logging.log4j.*;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import PageObject.ForgotPass;
import PageObject.LandingPage;
import PageObject.LoginPage;
import Resources.BaseClass;


public class Test1 extends BaseClass {
	
	public WebDriver driver;
	
	private static Logger Log =  LogManager.getLogger(Test1.class.getName());
	
@BeforeTest
	
	public void Intialize() throws IOException
	{
		driver=Intiallization();
		
		
	}
	@Test(dataProvider="getData")
	
	public void UseCase(String Uname,String Password,String Text) throws IOException, InterruptedException
	{
		
		//	driver.get(prop.getProperty("url")); throwing security error
		
		driver.get("http://www.qaclickacademy.com/");
		
		LandingPage hm = new LandingPage(driver);
		
		Thread.sleep(2000L);
		LoginPage op =	hm.getLogin();
		
		
		
		Thread.sleep(1000L);
		
		op.Email().sendKeys(Uname);
		Thread.sleep(1000L);
		op.PassWord().sendKeys(Password);
		Thread.sleep(1000L);
		op.Login().click();
		Thread.sleep(1000L);
	ForgotPass fp =	op.ForgotPassword();
	fp.Loginto().sendKeys("nissar");
	Thread.sleep(1000L);
	fp.SendMeInstructions().click();
	Thread.sleep(1000L);
		
		/*
		 *  where every a new window opens on clicking a link,we can define the opening window page object 
		 *  in the page object step used for clicking the link
		 */
		
		
		
		
		
		
		
		
				
		System.out.println(Text);
		
		Log.info("Login Done");
	}
	
@DataProvider
	
	public Object[][] getData()
	{
		Object[][] data = new Object[2][3];
		
		
		data[0][0] = "geniun customer";
		data[0][1] = "45845";
		data[0][2] = "text";
		
		data[1][0] = "Fraud customer";
		data[1][1] = "45120";
		data[1][2] = "texting";
		
		return data;
		
		
	}

@AfterTest

public void teardown()
{
	driver.close();
	Log.info("window closed");
}

}
