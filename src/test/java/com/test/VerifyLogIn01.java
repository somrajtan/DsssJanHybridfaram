package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.PageObject.LogInPom;
import com.utility.BaseClass;
import com.utility.LibraryClass;

public class VerifyLogIn01 extends BaseClass  {
	
	@Test
	public void verifylogInWithValidCredential() {
	LogInPom login = PageFactory.initElements(driver, LogInPom.class);

		LibraryClass.sendkey(login.getEmail(), excel.getStringData("Sheet1", 0, 0));
		LibraryClass.sendkey(login.getPass(), excel.getStringData("Sheet1", 1, 1));
		LibraryClass.click(login.getClickbutton());
		Assert.assertTrue(false);
		
		
	
		
		
		
		
		
		
		
		
	}

}
