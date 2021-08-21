package DropDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendars {

	public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver","D:\\Selenium Files\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://spicejet.com");
		
		Thread.sleep(3000L);
		
	driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
	
	while(!driver.findElement(By.xpath("//div[@class='ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-left']/div")).getText().contains("August"))
	{
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
	}
		
	List<WebElement> dates = driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']/table/tbody/tr/td"));

int noofdays =	dates.size();

for(int i=0;i<noofdays;i++)
{
String day =	dates.get(i).getText();
if(day.equalsIgnoreCase("17"))
{
	dates.get(i).click();
}
}

	}
}
