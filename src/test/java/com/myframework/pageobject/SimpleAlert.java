package com.myframework.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SimpleAlert {
	
	@FindBy(css="input#user")
	public WebElement enterName;	
	
	@FindBy(css="button.alert-btn")
	public WebElement clickMe;
	
}
