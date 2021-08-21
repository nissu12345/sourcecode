package Sec16;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Grid {

	public static void main(String[] args) throws MalformedURLException {
	
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setPlatform(Platform.WIN10);
		dc.setBrowserName("chrome");
		
		WebDriver driver = new RemoteWebDriver(new URL("http://192.168.43.230:4444/wd/hub"),dc);
		
		driver.get("htpps://fb.com");
		
		
	}

}
