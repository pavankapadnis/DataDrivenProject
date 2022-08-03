package com.dataprovider;

import org.testng.annotations.Test;

public class DataGet {

	
	
	@Test(dataProvider = "senddata", dataProviderClass = DataProviderDemo.class)
	public void testOne(String fname, String lname, String gen, String age, String con, String date, String id) {
		System.out.println(fname);
	}
	
}
