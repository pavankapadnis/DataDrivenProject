package com.mayframework.keyword;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UIKeyword {
	
public static RemoteWebDriver driver;
	
	public static void openBrowser(String browserName) {
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "G:\\A_java\\Jar Files\\geckodriver-new.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();

	}

	public static void closeBrowser() {
		driver.close();
	}
	
	public static void navigateBrowser(String navUrl) {
		driver.navigate().to(navUrl);
	}
	
	public static void quitBrowser() {
		driver.quit();
	}

	public static void launchUrl(String url) {
		driver.get(url);
	}
	
	public static  void dragDrop(WebElement selem, WebElement telem) {
		Actions act = new Actions(driver);
		act.moveToElement(selem).clickAndHold().moveToElement(telem).release().build().perform();
	}

	public static void acceptAlert() {
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}

	public static void getText() {
		// TODO Auto-generated method stub
		
	}

	public static String getAltText() {
		Alert alt = driver.switchTo().alert();
		String altText = alt.getText();
		return altText;
	}

	public static String dropdownSorted(WebElement selMonth) {
		Select sel = new Select(selMonth);
		List<WebElement> ls = sel.getOptions();
		List<String> al = new ArrayList<String>();
		
		for(WebElement e :ls) {
			al.add(e.getText());
		}
		List<String> templist = new ArrayList<String>(al);
		Collections.sort(al);
		
		System.out.println(al);
		System.out.println(templist);
		
		if(templist==al) {
			return "Dropdown list are sorted";
		}else {
			return "Dropdownlist are not sorted";
		}
	}

	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	public static ArrayList<String> getRowData(String filepath, int rownum) throws IOException {
		ArrayList<String> data = new ArrayList<String>();
		FileInputStream file = new FileInputStream(filepath);
		if(filepath.contains("xlsx")) {
			XSSFWorkbook work = new XSSFWorkbook(file);
			XSSFSheet sheet = work.getSheet("Sheet1");
			XSSFRow row = sheet.getRow(rownum);
			int cell = row.getLastCellNum();
			for(int i=0;i<cell;i++) {
				data.add(row.getCell(i).getStringCellValue());
			}
		}else if(filepath.contains("xls")) {
			HSSFWorkbook work = new HSSFWorkbook(file);
			HSSFSheet sheet = work.getSheet("Sheet1");
			HSSFRow row = sheet.getRow(rownum);
			int cell = row.getLastCellNum();
			//System.out.println("Cell ===== "+cell);
			for(int i=2;i<cell;i++) {
				data.add(row.getCell(i).getStringCellValue());
			}
		}
		return data;
	}

	public static LinkedHashMap<String, String> readExcel(String filepath) throws IOException {
		LinkedHashMap<String, String> lm = new LinkedHashMap<String, String>();
		FileInputStream file = new FileInputStream(filepath);
		XSSFWorkbook work = new XSSFWorkbook(file);
		XSSFSheet sheet = work.getSheet("Sheet1");
		int rowcount = sheet.getLastRowNum();
		XSSFRow row = sheet.getRow(0);
		int cellcount = row.getLastCellNum();
		
		for(int i =0;i<rowcount;i++) {
				String key = sheet.getRow(i).getCell(0).getStringCellValue();
				String value = sheet.getRow(i).getCell(1).getStringCellValue();
				lm.put(key, value);
		}
		return lm;
		
	}

	public static String readObjectFile(String dir, String key) throws IOException {
		FileInputStream file = new FileInputStream(dir);
		Properties prop = new Properties();
		prop.load(file);
		return (String) prop.get(key);
	}
	
}
