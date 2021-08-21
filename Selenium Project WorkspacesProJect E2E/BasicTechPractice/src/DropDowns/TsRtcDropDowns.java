package DropDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TsRtcDropDowns {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","D:\\Selenium Files\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
driver.get("https://www.tsrtconline.in/oprs-web/");
driver.findElement(By.xpath("//input[@name='fromPlaceName']")).sendKeys("ban");
Thread.sleep(2000L);



List<WebElement> places =driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));

for(int i=0;i<places.size();i++)
{
	if(places.get(i).getText().equalsIgnoreCase("banjaar")) {
		places.get(i).click();
		break;
	}
}

Thread.sleep(2000L);
driver.findElement(By.xpath("//input[@name='toPlaceName']")).sendKeys("yel");
Thread.sleep(2000L);
List<WebElement> Toplace =driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
for(WebElement toplace: Toplace) {
	if(toplace.getText().equalsIgnoreCase("Yellandu")) {
		toplace.click();
		break;
	}
}

	/* to place for loop method-2
	 * for(WebElement place:places){
	 * if(place.getText().equalsIgnoreCase("banjaar"))
	 * {
	 * place.click();
	 * break;
	 * }
	 * }
	 * note-careful at passing webelements into list and while writting the x-path of the webelements and while looping
	 */
	


	}

}
