package com.myframework.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage {
	
	@FindBy(css="a[href=\"/recent-placements\"]")
	public WebElement recentPlacementLnk;
	
	@FindBy(css="a[href=\"https://www.youtube.com/channel/UCg_SUG_BAPtVUvTSKse2xBg\"]")
	public WebElement videosLnk;
	
	@FindBy(css="a[href='/assignments']")
	public WebElement assignmentLnk;
	
	@FindBy(css="a[href=\"/notes\"]")
	public WebElement notesLnk;
	
	@FindBy(css="a[href=\"/contact-us\"]")
	public WebElement contactLnk;
	
	/*
	 * public Homepage() { UIKeyword keyword = new UIKeyword(); Homepage home =
	 * PageFactory.initElements(keyword.driver, Homepage.class); }
	 */
	
	public void recentPlacementLnkClick() {
		recentPlacementLnk.click();
	}
	
	public void videosLnkClick() {
		videosLnk.click();
	}
	
	public void assignmentLnkClick() {
		assignmentLnk.click();
	}
	
	public void notesLnkClick() {
		notesLnk.click();
	}
	
	public void contactLnkClick() {
		contactLnk.click();
	}
	
}
