package DropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WhileLoops {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","D:\\Selenium Files\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
driver.findElement(By.xpath("//div[@class='paxinfo']")).click();
Thread.sleep(2000L);

int i=0;
while(i<8) {
	
	driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();
	i++;
	}
/*
for(int i=0;i<5;i++) {
	
	driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();

}
	*/	

driver.findElement(By.xpath("//input[@class='buttonN']")).click();;
System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());

	
}
	
}
// concentrate on looping 
		
	
		

	


