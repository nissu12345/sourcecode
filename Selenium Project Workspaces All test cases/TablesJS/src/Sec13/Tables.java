package Sec13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver","D:\\Selenium Files\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/30544/aus-vs-ind-2nd-t20i-india-tour-of-australia-2020-21");
	
		int sum =0;
		

		WebElement table = driver.findElement(By.xpath("//body/div[1]/div[2]/div[4]/div[2]/div[2]/div[1]"));
		
		
	//int rows =	table.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms']")).size();
	
	int coloms = table.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms']/div[3]")).size();
	
	
	
	for(int i=0;i<coloms-10;i++)
	{
String total =	table.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms']/div[3]")).get(i).getText();
int inttotal = Integer.parseInt(total);
//System.out.println(inttotal);

	sum = sum + inttotal ; 
	
	}
	
	//System.out.println(sum);

	String Extras =	table.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		
		int intExtras = Integer.parseInt(Extras);
		
		//System.out.println(intExtras);

String Actotal =		table.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();

int intActotal = Integer.parseInt(Actotal);

//System.out.println(intActotal);


int totalsum = sum + intExtras;

//System.out.println(totalsum);

if(intActotal==totalsum)
{
	System.out.println("count is correct");
}
else{
	System.out.println("count is incorrect");
}



// i was unable to limit the driver scope to one table so i used -10 in the for loop to exclude the extra 1st and 2nd table's info. 



	
	}
	
	

	
}
