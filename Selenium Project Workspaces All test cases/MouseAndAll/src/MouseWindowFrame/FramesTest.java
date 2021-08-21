package MouseWindowFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesTest {

	public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver","D:\\Selenium Files\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
	//driver.switchTo().frame(0);
int s =		driver.findElements(By.tagName("iframe")).size();
System.out.println(s);
	driver.switchTo().frame(driver.findElement(By.xpath("//div[@id='content']/iframe")));
	System.out.println(driver.getTitle());
driver.findElement(By.xpath("//div[@id='draggable']")).click();
		
		Actions a = new Actions(driver);  
		
		WebElement Source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement Target = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		
		a.dragAndDrop(Source,Target ).build().perform();;
driver.switchTo().defaultContent();
System.out.println(driver.getTitle());

// plese remember build and perform in actions class
// int- index;string--id for the frame selection
	}

}
