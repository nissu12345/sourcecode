package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import RedifOF.HomePagePOF;
import RedifOF.LogginPage;

public class LoginthePage {
	
	@Test
	
	public void Demo() throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver","D:\\Selenium Files\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		LogginPage in = new LogginPage(driver);
		in.Username().sendKeys("nissar");
		in.Password().sendKeys("76609");
		
		in.Signin().click();
		in.Backtohome().click();
		//POF
		HomePagePOF hm = new HomePagePOF(driver);
		Thread.sleep(2000L);
		
		hm.Search().sendKeys("reddiff");	
		hm.SearchBotton().click();
		
	
	}
	

}
