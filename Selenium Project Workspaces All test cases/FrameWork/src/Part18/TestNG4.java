package Part18;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG4 {
	
	@BeforeClass
	public void Bclass()
	{
		System.out.println(" Before class 0f 4");
	}
	
	
	@AfterTest
	
	public void last()
	{
		System.out.println("i will execute last");
	}
	
	@Test 
	
	public void WebLoginHome()
	{
		System.out.println("WebloginHome");
	}
	
	@Test(dependsOnMethods= {"WebLoginHome" })
	public void MobileLoginHome()
	{
		System.out.println("MobileloginHome");
	}
	
	@Test(groups= {"Smoke"})
	public void APILoginHome()
	{
		System.out.println("APIloginHome");
	}

	@AfterClass
	
	public void Afclass()
	{
		System.out.println("after class 0f 4");
	}
	
	@Test(dataProvider="getData")
	
	public void zmultimethods(String uname,String passw)
	{
		System.out.println("multi dependencies");
		System.out.println(uname);
		System.out.println(passw);
	}
	
	@DataProvider
	
	public Object[][] getData()
	{
		Object[][] data = new Object[3][2];
		data[0][0] = "firstuname";
		data[0][1] = "firstpass";
		data[1][0] = "secuname";
		data[1][1] = "secpass";
		data[2][0] = "thirduname";
		data[2][1] = "passuname";
		return data;
		
		// row - no of combinations ;columns = no of data inputs
	}
	
	
	
	
	
	
	}

