package Part18;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG1 {
	
	@Test(groups= {"Smoke"})
	
	public void Demo()
	{
		System.out.println("Hello");
	}

	@Parameters({"URl"})
	@Test
	
	public void SecondTest(String paraname)
	{
		System.out.println("Bye..");
		System.out.println(paraname);
	}

	@BeforeTest
	
	public void first()
	{
		System.out.println("i will execute first");
	}
	
	@Test
	
	public void Orange()
	{
		Assert.assertTrue(false);
	}
}
