package Firstcase;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnitTest {

	public static void main(String[] args) {
		
		
	System.setProperty("webdriver.chrome.driver","D:\\Selenium Files\\chromedriver.exe");
		
WebDriver driver = new ChromeDriver();
driver.get("https://google.com");
System.out.println(driver.getTitle());


	}

}
