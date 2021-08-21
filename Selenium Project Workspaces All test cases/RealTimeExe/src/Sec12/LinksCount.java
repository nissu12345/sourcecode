package Sec12;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksCount {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver","D:\\Selenium Files\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
	System.out.println(driver.findElements(By.tagName("a")).size());  
	
WebElement fp =	driver.findElement(By.id("gf-BIG"));

System.out.println(fp.findElements(By.tagName("a")).size());



WebElement cp = fp.findElement(By.xpath("//table/tbody/tr/td[1]/ul")); //u can give locator in 2 ways 

 System.out.println(cp.findElements(By.tagName("a")).size()); 
  
 int csize = cp.findElements(By.tagName("a")).size();
 
 for(int i=1;i<csize;i++)
 {
	String clicklink = Keys.chord(Keys.CONTROL,Keys.ENTER);
	 cp.findElements(By.tagName("a")).get(i).sendKeys(clicklink);
 }	 
 
 
Set<String>	 ids = driver.getWindowHandles();
Iterator<String> it =ids.iterator();
while(it.hasNext()) {
	String w = it.next();
	driver.switchTo().window(w);
	System.out.println(driver.getTitle());
}
	}

}//once check thr result in good network.the order of titles is changing
