package himobile.utils;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class TestListners extends TestListenerAdapter{
	
	public void onTestFailure(ITestResult tr){
		
		System.out.println("Test is Fail "+tr.getName());
	
	}
	
	public void onTestSkipped(ITestResult tr){
		
		System.out.println("Test is Skipped "+tr.getName());
	
	}
	
	public void onTestSuccess(ITestResult tr){
		
		System.out.println("Test Pass "+tr.getName());
	
	}

}
