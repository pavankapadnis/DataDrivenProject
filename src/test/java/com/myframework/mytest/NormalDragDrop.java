package com.myframework.mytest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NormalDragDrop {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		RemoteWebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testingshastra.com/assignments/drag-and-drop");
		WebElement elemso = driver.findElement(By.cssSelector("img[src=\"/images/java-fullstack.png\"]"));
		WebElement elemtar = driver.findElement(By.cssSelector("div#trash"));
		Actions act = new Actions(driver);
		act.moveToElement(elemso).clickAndHold().moveToElement(elemtar).release().build().perform();
	
	}
	
}
