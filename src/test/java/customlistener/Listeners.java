package customlistener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners implements ITestListener {

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult arg0) {
		System.setProperty("org.uncommons.reportng.escape-output", "false");  
		Reporter.log("<a href=\"https://www.google.com\" target=\"blank\">Screenshot link</a>");
		Reporter.log("<br>");
		Reporter.log("<a href=\"https://www.google.com\" target=\"blank\"><img height=100 width=100 src=\"C:\\Users\\Admin\\Documents\\VTO\\M3.jpg\"></a>");
System.out.println("Capture Screenshot : "+ arg0.getName());		
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

}
