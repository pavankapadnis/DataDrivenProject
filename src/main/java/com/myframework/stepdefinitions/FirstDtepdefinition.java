package com.myframework.stepdefinitions;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.testng.Assert;

import com.mayframework.keyword.UIKeyword;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstDtepdefinition {
	
	UIKeyword keyword = new UIKeyword();
	String title="";
	
	@Given("open browser and launch the url.")
	public void m1() {
		keyword.openBrowser("chrome");
		keyword.launchUrl("https://www.testingshastra.com");
	}
	
	@When("we get the title of home pages")
	public void m2() {
		title = keyword.getTitle();
	}
	
	@Then("It must be equal to expected")
	public void m3() {
		Assert.assertEquals("Testing Shastra | Training | Placement", title);
	}
	
	/*
	 * @After public void closeBrowser() { keyword.closeBrowser(); }
	 */
	
	@BeforeStep
	private void beforeStep() {
		System.out.println("This is before step++++++++");
	}
	
	@AfterStep
	private void stepAfter() {
		System.out.println("This is After step-------------");
	}
	/*
	int x,y,r=0;
	String st1,st2,st3="";
	String pk1,pk2;
	
	@Given("this is {int} and {int} Parameter")
	public void getTwoNumber(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	@When("addition of above number")
	public void additionOfNumbers() {
		r=x=y;
		System.out.println(r);
	}
	
	@Then("check addition is even or not")
	public void checkAdditionEven() {
		Assert.assertTrue(r%2==0, "Addition is odd");
	}
	
	@Given("this is {word} and {word} Parameter here")
	public void getString(String st1,String st2) {
		this.st1=st1;
		this.st2=st2;  
	}
	
	@When("join the above string")
	public void addString() {
		st3+=st1+st2;
	}
	
	
	@Then("check string join or not")
	public void printString() {
		Assert.assertEquals(st3, "PavanKapadnis");
	}
	
	
	@Given("this is {string} String Parameter")
	public void getFullString(String st1) {
		this.pk1=st1;
	}
	
	@When("take string in two global variable")
	public void addFullString() {
		pk1=pk2;
	}
	
	
	@Then("compare two global string")
	public void printFullString() {
		Assert.assertEquals(pk2, pk1);
	}
	
	@Given("pass the city name and state:")
	public void getCityNameAndState(DataTable dl) {
		Map mp = dl.asMap();
		Set<Map.Entry> me = mp.entrySet();
		for(Map.Entry ms:me) {
			System.out.println(ms.getKey()+"\t"+ms.getValue());
		}		
		
	}
	
	@Given("pass the Only city name:")
	public void getCityName(List<String> ls){
		System.out.println("Capitals of different states");
		for(String lst:ls) {
			System.out.println(lst);
		}
	}
	
	@Given("I have {string} and {string}")
	public void cityInfo(String city,String state) {
		System.out.println("State Name "+state+" Capital of state "+city);
	}
	
	@Given("we have only {string} of excel sheet")
	public void we_have_only_of_excel_sheet(String data) throws IOException {
		int rownum = Integer.parseInt(data);
		String filepath = "G:\\Statecodes.xlsx";
		ArrayList<String> state = UIKeyword.getRowData(filepath,rownum);
		for(String datae:state) {
			System.out.print(datae+"\t");
		}
	}
	*/
}
