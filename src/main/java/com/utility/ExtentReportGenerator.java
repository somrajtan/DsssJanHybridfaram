package com.utility;

import java.io.File;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenerator {
	
	public static ExtentReports repotMethod() {
		
		File file =new File(System.getProperty("user.dir")+"\\Report\\xxp.html");
		
		ExtentSparkReporter extentspark =new ExtentSparkReporter(file);
		extentspark.config().setDocumentTitle("Dss_batch_Report");
		extentspark.config().setReportName("FacebookApplication");
		extentspark.config().setTheme(Theme.STANDARD);
		
		ExtentReports extentrepot =new ExtentReports();
		extentrepot.attachReporter(extentspark);
		extentrepot.setSystemInfo("Qa Name", "somraj");
		extentrepot.setSystemInfo("Operating system", "Windows");
		extentrepot.setSystemInfo("TestType", "Regretion");
		return extentrepot;
	}
	
	
	
}
