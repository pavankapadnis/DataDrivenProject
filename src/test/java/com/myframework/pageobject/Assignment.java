package com.myframework.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Assignment {
	
	@FindBy(css = "a[href=\"/assignments/confirmation-alert\"]")
	public WebElement comfirmationAlert;

	@FindBy(css = "a[href=\"/assignments/prompt\"]")
	public WebElement promptAlert;

	@FindBy(css = "href=\"/assignments/simple-alert\"")
	public WebElement simpleAlert;

	@FindBy(css = "a[href=\"/assignments/windowHandlingDemo\"]")
	public WebElement windowHandling;

	@FindBy(css = "a[href=\"/assignments/parent-window\"]")
	public WebElement frameHandling;

	@FindBy(css = "a[href=\"/assignments/drag-and-drop\"]")
	public WebElement dragAndDrop;

	@FindBy(css = "a[href=\"/assignments/drop-down\"]")
	public WebElement dropDown;

	@FindBy(css = "a[href=\"/assignments/Tooltip\"]")
	public WebElement toolTip;

	/*
	 * public Assignment() { UIKeyword keyword = new UIKeyword(); Assignment
	 * assignment = PageFactory.initElements(keyword.driver, Assignment.class); }
	 */
	
	public void comfirmationAlertClick() {
		comfirmationAlert.click();
	}

	public void promptAlertClick() {
		promptAlert.click();
	}
	
	public void simpleAlertClick() {
		simpleAlert.click();
	}
	
	public void windowHandlingClick() {
		windowHandling.click();
	}
	
	public void frameHandlingClick() {
		frameHandling.click();
	}
	
	public void dragAndDropClick() {
		dragAndDrop.click();
	}
	
	public void dropDownClick() {
		dropDown.click();
	}
	
	public void toolTipClick() {
		toolTip.click();
	}
	
}
