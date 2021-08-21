package Reports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;


public class ExtentRe {
	ExtentReports extent;

	@BeforeTest
	public void TestReports()
	{
	String path =	System.getProperty("user.dir") + "\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		// using reporter object we can set the reporter title and we and set its window title
		//reporter.config.settitle
		//reporter.config.setname - both are not exact
		
		
		 extent = new ExtentReports();
		 extent.attachReporter(reporter);
		 
		extent.setSystemInfo("Tester", "nissar");
		
	}
	
	
	@Test
	
	public void Result()
	
	{
		ExtentTest test = extent.createTest("demo test");
		
		// whenever we createtest an object get created using that we can twick the extentreporters operations.
		
System.setProperty("webdriver.chrome.driver","D:\\Selenium Files\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://qaclickacademy.com");
System.out.println(driver.getTitle());	
driver.close();
test.fail("wantedly failed");
extent.flush();
	}

}

