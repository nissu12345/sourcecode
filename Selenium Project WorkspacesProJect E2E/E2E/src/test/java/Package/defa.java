package Package;

import java.awt.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class defa {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Files\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://www.path2usa.com/travel-companions");
				
				driver.findElement(By.id("travel_date")).click();
				
				
				//August 17	
				
				
			while(!driver.findElement(By.xpath("//div[@class='datepicker-days']/table/thead/tr[1]/th[2]")).getText().contains("August"))
			{
				driver.findElement(By.xpath("//div[@class='datepicker-days']/table/thead/tr[1]/th[3]")).click();
			}
				
	ArrayList<WebElement> days = (ArrayList<WebElement>) driver.findElements(By.className("day"));

		int noofdays = days.size();

		for(int i=0;i<noofdays;i++)
		{
			String actualday = days.get(i).getText();
			if(actualday.equalsIgnoreCase("17"))
			{
				days.get(i).click();
				break;
			}
		}
	}

}
