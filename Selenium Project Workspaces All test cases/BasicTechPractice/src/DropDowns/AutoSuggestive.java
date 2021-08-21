package DropDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","D:\\Selenium Files\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(4000L);
		
	
List<WebElement>	Options =	driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
		
for(WebElement Option:Options) {
	
	if(Option.getText().equalsIgnoreCase("india")) {
		Option.click();
		break;
	}
}

}

	}
/*
 * careful while passing elements to the list and looping
 * 
 * send the text to the text box 
 * then pass all the text box elements into an list and go for a for loop and find the reqired text in it
 * break the if looping condition
 */

