package LocatorTech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicCases {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","D:\\Selenium Files\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.trivago.in/en?themeId=280&sem_keyword=trivago&sem_creativeid=381249320137&sem_matchtype=e&sem_network=g&sem_device=c&sem_placement=&sem_target=&sem_adposition=&sem_param1=&sem_param2=&sem_campaignid=259742967&sem_adgroupid=24450848727&sem_targetid=kwd-5593367084&sem_location=9050507&cip=9119000005&gclid=CjwKCAiA8Jf-BRB-EiwAWDtEGncvexsk7yTPLjp6Qg_IA-Flu1pGOKIg0QJCEQH048sRtZA5AHtGkRoC_WQQAvD_BwE");
		
		//driver.findElement(By.xpath("//*[@class='dealform-button__head']/following-sibling::time")).click(); // 2 sibblings method
		
	String rr = driver.findElement(By.xpath("//*[@class='dealform__query-wrapper']/parent::div")).getText(); // child -- parent method
	
	/*
	 * reverse traversing is possible only with xpath not by using css.
	 * first find the relation between the elements whether parent-child or child-child then find the locator
	 */
	System.out.println(rr);
	}

}
