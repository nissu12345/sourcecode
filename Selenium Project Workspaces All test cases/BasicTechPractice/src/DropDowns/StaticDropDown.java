package DropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver","D:\\Selenium Files\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		Thread.sleep(5000L);
		
		WebElement StaticDrop = driver.findElement(By.xpath("//*[@name='ctl00$mainContent$DropDownListCurrency']"));
		
		Select s = new Select(StaticDrop);
		
	//	Select s = new Select(driver.findElement(By.xpath("//*[@name='ctl00$mainContent$DropDownListCurrency']")));
		
	// webelement can also be passed as mentioned above 	
		
		
	//	s.selectByValue("2"); // not worked
		
	s.selectByVisibleText("USD");
	
		
	//	s.selectByIndex(2); // use on eof the any method to select the dropdown
	String value =	s.getFirstSelectedOption().getText();
		
	System.out.println(value);
	
	
	/*in case of static dropdowns
	 * first get url..use thread if required
	 * webpage element loactor path to be passeed to a webelement 
	 * pass the object of webelement as argument to the Select class step
	 * now use the object of the select class and select the required option using provided methods
	 * using the same object we can find all the first/all selected options and getText it and pass it into a string
	 * println the String object
	 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	/*	parallel done with class
		try {
			Thread.sleep(7000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement StaticDropDown = driver.findElement(By.xpath("//*[@id='ctl00_mainContent_DropDownListCurrency']"));
		Select s = new Select(StaticDropDown);
		s.selectByIndex(3);
	System.out.println(s.getFirstSelectedOption().getText());
		
*/
	}

}
