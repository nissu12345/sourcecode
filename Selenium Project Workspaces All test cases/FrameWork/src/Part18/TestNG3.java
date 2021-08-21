package Part18;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG3 {
	
	
	@BeforeMethod
	
	public void FirstMethod()
	{
		System.out.println("first of method");
	}
	
	@Test(groups= {"Smoke"})
	
	public void WebLogincar()
	{
		System.out.println("Weblogincar");
	}
	@Parameters({"URl"})
	@Test 
	public void MobileSingincar(String CarPara)
	{
		System.out.println("MobileSingincar");
		System.out.println(CarPara);
	}
	@Parameters({"URl","API"})
	@Test
	public void MobileSingoutincar(String url,String api)
	{
		System.out.println("MobileSingoutcar");
		System.out.println(url);
		System.out.println(api);
	}
	@Test(timeOut=4000)
	public void MobileLogincar()
	{
		System.out.println("Mobilelogincar");
	}
	
	@Test(enabled=false)
	public void APILogincar()
	{
		System.out.println("APIlogincar");
	}
	
	@AfterMethod
	
	public void LastMethod()
	{
		System.out.println("Last of method");
	}
	

}
