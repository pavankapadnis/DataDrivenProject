package com.myframework.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DragAndDrop {
	
	@FindBy(css = "img[src='/images/java-fullstack.png']")
	public WebElement sourceImgOne;

	@FindBy(css = "img[src='/images/java-selenium.png']")
	public WebElement sourceImgTwo;

	@FindBy(css = "img[src='/images/Python-Selenium.png']")
	public WebElement sourceImgThree;

	@FindBy(css = "img[src='/images/MERN-Stack-Development.jpg']")
	public WebElement sourceImgFour;

	@FindBy(css = "div#trash")
	public WebElement targetImg;

	/*
	 * public DragAndDrop() { UIKeyword keyword = new UIKeyword(); DragAndDrop drdp
	 * = PageFactory.initElements(keyword.driver, DragAndDrop.class); }
	 */
	
}
