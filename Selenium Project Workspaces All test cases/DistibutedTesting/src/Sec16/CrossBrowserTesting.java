package Sec16;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class CrossBrowserTesting {

	public static void main(String[] args) {
		//http://192.168.43.230:4444/grid/register/ -- server details
		
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setPlatform(Platform.WIN10);
		dc.setBrowserName("chrome");
		
		WebDriver driver = new RemoteWebDriver(new URl("http://192.168.43.230:4444/wd/hub"),dc );
		driver.get("https://fb.com");

	}

}


/*at node side ad stand alone server and required browser in the same path 
 * give the following command in the cmd to configure it as the node 
 * # java -DWebdriver.chrome.driver="its path with extension" -jar "stand alone jar" -role Webdriver -hub "hub address-http://192.168.43.230:4444/grid/register" -port any random unused port number
 * 
 * 
 * */
