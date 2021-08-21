package Part18;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG2 {
	
	@Test(groups= {"Smoke"})
	
	public void Ploan()
	{
		System.out.println("good");
	}
@BeforeSuite
public void firstsuite()

{
	System.out.println("I am the number one");
	
}


@AfterSuite

public void LastSuite()
{
	System.out.println("I am the number one from last");
}

@Parameters({"URl"})
@Test

public void Extra(String Para)
{
	System.out.println("ok");
	System.out.println(Para);
}
}
