package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LogInPom {

	@FindBy(how= How.XPATH,using="//input[@id='email']")
	private WebElement email;
	
	
	@FindBy(xpath="//input[@id='pass']")
	private WebElement pass ;
	
	@FindBy(name="login")
	private WebElement clickbutton ;

	public WebElement getEmail() {
		return email;
	}

	

	public WebElement getPass() {
		return pass;
	}

	

	public WebElement getClickbutton() {
		return clickbutton;
	}

	
	
	
	
	
}
