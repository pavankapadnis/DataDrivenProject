package com.myframework.mytest;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

import com.mayframework.keyword.UIKeyword;

public class ReadExcelSheet {

	public static void readExcel() throws IOException {
		String dir = (System.getProperty("user.dir"))+"\\src\\test\\resources\\Statecodes.xlsx";
		
		LinkedHashMap<String, String> lm = UIKeyword.readExcel(dir);
		
		for(Map.Entry<String, String> entry:lm.entrySet()) {
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
	}
	
	
	public static void main(String[] args) throws IOException {
		readExcel();
	}

}
