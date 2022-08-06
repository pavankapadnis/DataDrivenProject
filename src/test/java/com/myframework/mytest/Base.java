package com.myframework.mytest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.mayframework.keyword.UIKeyword;

public class Base {
	
	@BeforeMethod
	public void openBrowser() {
		UIKeyword.openBrowser("chrome");
	}

	@AfterMethod
	public void tearBrowser() {
		UIKeyword.closeBrowser();
	}
	
}
