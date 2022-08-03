package com.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UIKeyword {

	public static ArrayList<String[]> readData(String dir) throws IOException {
		ArrayList<String[]> mydata = new ArrayList<String[]>();
		FileInputStream file = new FileInputStream(dir);
		HSSFWorkbook work = new HSSFWorkbook(file);
		HSSFSheet sheet = work.getSheet("Sheet1");
		int rowcount = sheet.getLastRowNum();
		HSSFRow row = sheet.getRow(1);
		int cellcount = row.getLastCellNum();
		String[] data = new String[7];
		for (int i = 1; i < 2; i++) {
			for(int j =1;j<cellcount;j++){
				data[j-1] = sheet.getRow(i).getCell(j).getStringCellValue();
			}
			mydata.add(data);

		}
		return mydata;
	}
}
