package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener implements ITestListener
{

	public void onStart(ITestContext result) 
	{
		Reporter.log("Program Started in "+ result.getName(), true);
	}
	
	public void onTestStart(ITestResult result)
	{
		Reporter.log("Execution Started in "+ result.getName(), true);
	}
	
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("Execution Success in "+ result.getName(), true);
	}
	
	public void onFinish(ITestContext result) 
	{
		Reporter.log("Program Run Finished in "+ result.getName(), true);
	}
	
	public void onTestFailure(ITestResult result) 
	{
		Reporter.log("Execution Failed in "+ result.getName(), true);
	}
	
	public void onTestSkipped(ITestResult result) 
	{
		Reporter.log("Execution Skipped in "+ result.getName(), true);
	}
}
