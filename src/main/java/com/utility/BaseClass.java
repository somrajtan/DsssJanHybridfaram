package com.utility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	
	public static  WebDriver  driver;
	public static CongiDataProvider config;
	public static ExcelDataProvider excel;
	
	@BeforeSuite
	public void configdatasetup() throws IOException {
		 config=new CongiDataProvider();
		  excel=new ExcelDataProvider();
		
	}
	
	@Parameters("browser")
    @BeforeMethod
	public void beforeMethod(String browser) {
    	
    	
    	
		if(browser.equalsIgnoreCase("chrome")) {
			
	    	WebDriverManager.chromedriver().setup();
			 driver =new ChromeDriver();

				driver.manage().window().maximize();
			 driver.get(config.getStageUrl());
		}
		else if
       (browser.equalsIgnoreCase("edge")) {
			
	    	WebDriverManager.chromedriver().setup();
			 driver =new EdgeDriver();

				driver.manage().window().maximize();
			 driver.get(config.getLiveUrl());
		}
    	
    
		
	}
    
    
    

    @AfterMethod
	public void afterMethod() {
		driver.close();
		
	}
	
	
	
	
	
	
	
	
}
