package com.myframework.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DropDown {
	
	@FindBy(css="select.single-select")
	public WebElement selMonth;
	
	@FindBy(css="div.single_tab_div >p>select")
	public WebElement selGlobalqa;
	
}
