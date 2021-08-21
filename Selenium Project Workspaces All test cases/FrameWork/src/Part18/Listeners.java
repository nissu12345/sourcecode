package Part18;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{
	
	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("this cased failed  " +  result.getName());
		
		
	}

}
