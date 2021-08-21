package MouseWindowFrame;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","D:\\Selenium Files\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://accounts.google.com/signup");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//footer[@class='RwBngc']/ul/li[2]/a")).click();
		
		
	Set<String> ids = driver.getWindowHandles();
Iterator<String> it =	ids.iterator();


String parent =it.next();
String child = it.next();

driver.switchTo().window(child);
System.out.println(driver.getTitle());
driver.switchTo().window(parent);
System.out.println(driver.getTitle());

//while(it.hasNext()) {
//String c =	 it.next();
//driver.switchTo().window(c);
//driver.getTitle();
//	 
//System.out.println(driver.getTitle());	
// using this i am unabke to shift to the parent window..need to know the technique
//}
	
	// here windows are reached by there object declared 
// two methods-- driver.getwindowhandles and switchto.window .we have to shift from the child window to the parent window after
//operating on the chikd window

	}

}
