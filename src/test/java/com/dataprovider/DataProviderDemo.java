package com.dataprovider;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.DataProvider;

import com.utility.UIKeyword;

public class DataProviderDemo {
		
	@DataProvider(name="senddata")
	public Iterator<String[]> readExcelData() throws IOException {
		String dir = (System.getProperty("user.dir"))+"/src/test/resources/ExampleExcel New.xls";
		ArrayList<String[]> al = UIKeyword.readData(dir);
		return al.iterator();
		
		
	}
	
	
}
