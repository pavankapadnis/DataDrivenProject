package com.myframework.mytest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.mayframework.keyword.UIKeyword;
import com.myframework.pageobject.Assignment;
import com.myframework.pageobject.DragAndDrop;
import com.myframework.pageobject.DropDown;
import com.myframework.pageobject.Homepage;
import com.myframework.pageobject.SimpleAlert;


public class AsterDemo extends Base {
	
	@Test
	public void testOne() {
		DragAndDrop dgdr = PageFactory.initElements(UIKeyword.driver, DragAndDrop.class);
		Assignment asign = PageFactory.initElements(UIKeyword.driver, Assignment.class);
		UIKeyword.launchUrl("https://testingshastra.com/assignments/drag-and-drop");
		Homepage home = PageFactory.initElements(UIKeyword.driver, Homepage.class);
		//home.assignmentLnkClick();
		//asign.dragAndDropClick();
		UIKeyword.dragDrop(dgdr.sourceImgOne, dgdr.targetImg);
		UIKeyword.dragDrop(dgdr.sourceImgTwo, dgdr.targetImg);
		UIKeyword.dragDrop(dgdr.sourceImgThree, dgdr.targetImg);
		UIKeyword.dragDrop(dgdr.sourceImgFour, dgdr.targetImg);
		
	}
	
	@Test
	public  void testTwo() {
		UIKeyword.launchUrl("https://testingshastra.com/assignments/simple-alert");
		SimpleAlert salert = PageFactory.initElements(UIKeyword.driver, SimpleAlert.class);
		salert.enterName.sendKeys("Pavan");
		salert.clickMe.click();
		String altText = UIKeyword.getAltText();
		System.out.println(altText);
		UIKeyword.acceptAlert();
	}
	
	@Test
	public void dropdownListSortedOrNot() {
		UIKeyword.launchUrl("https://testingshastra.com/assignments/drop-down");
		DropDown dpdw = PageFactory.initElements(UIKeyword.driver, DropDown.class);
		String sortList = UIKeyword.dropdownSorted(dpdw.selMonth);
		System.out.println(sortList);
	}
	
	@Test
	public void dropdownListSortedOrNotTwo() {
		UIKeyword.launchUrl("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		DropDown dpdw = PageFactory.initElements(UIKeyword.driver, DropDown.class);
		String sortList = UIKeyword.dropdownSorted(dpdw.selGlobalqa);
		System.out.println(sortList);
	}
	
}
