package com.utility;

import org.openqa.selenium.WebElement;

public class LibraryClass {


	
public static  void sendkey(WebElement element ,String value) {
	
	
		
		if(element.isDisplayed()&& element.isEnabled()) {
			element.sendKeys(value);
			
		}else {
			
		System.out.println("unable to send value");
		}
		
		
	}
	
	
public static  void click(WebElement element) {
		
		if(element.isDisplayed()&& element.isEnabled()) {
			element.click();
			
		}else {
			
		System.out.println("unable to ");
		}
		
		
	}


}
