package com.utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class ListnerClass extends BaseClass implements ITestListener {
	
	ExtentReports extentreport=ExtentReportGenerator.repotMethod();
	ExtentTest extentTest;
	String	 testname;
	public void onTestStart(ITestResult result) {
			 testname = result.getName();
		     extentTest = extentreport.createTest(testname);
		
	}

	public void onTestSuccess(ITestResult result) {
		
		extentTest.log(Status.PASS, testname+" pass");
		
	}

	public void onTestFailure(ITestResult result) {
		extentTest.log(Status.FAIL, testname+" fail");
		extentTest.addScreenCaptureFromBase64String(takeScreenshot());
	}

	public void onTestSkipped(ITestResult result) {
		extentTest.log(Status.SKIP, testname+" skipped");
	}

	public void onFinish(ITestContext context) {
		extentreport.flush();
	}

	public String takeScreenshot() {
		
		String ts = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
		return ts;
		
	}	
	
	
	
}
