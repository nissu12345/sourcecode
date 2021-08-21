package screens;
import org.openqa.selenium.WebDriver;

public class Sceens1 {

	public static void main(String[] args)
	{
		
System.setProperty("webdriver.chrome.driver","D:\\Selenium Files\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		
		TakesScreenshot ts = (TakesScreenShot)driver;
		
		File src  = ts.getScreensshotas(OutputType.File);
		
		FileUtils.copyFile(Src, new File(D://LiveProjects//Screenshots//scren.png));
		
		
	}
}
