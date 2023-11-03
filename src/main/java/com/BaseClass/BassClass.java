package com.BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BassClass {
	public static WebDriver driver;
	
	public static WebDriver browserlanch(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(browser.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}
		return driver;
		
	}
	
	public static void close() {
		driver.close();
	}
	
	public static void quit() {
		driver.quit();
	}
	
	public static void navigateto(String url) {
		 driver.navigate().to(url);
	}
	
	public static void navigateback() {
		driver.navigate().back();
	}
	
	public static void navigateforward() {
		driver.navigate().forward();
	}
	
	public static void refresh() {
		driver.navigate().refresh();
	}
	public static void getUrl(String url) {
		driver.get(url);
	}
	public static void alart() {
		driver.switchTo().alert();
	}
	public static void alartAccept() {
		driver.switchTo().alert().accept();
	}
	public static void alartdismiss() {
		driver.switchTo().alert().dismiss();
	}
	public static void alartsendValue(String value) {
		driver.switchTo().alert().sendKeys(value);	
	}
	public static void inputonElement(WebElement input,String value) {
		input.sendKeys(value);	
	}
	public static void clickonElement(WebElement input) {
		input.click();
	}
	public static void wait1() throws InterruptedException {
		Thread.sleep(3000);
		
	}
	public static void selectwebelement(WebElement input) {
		input.isSelected();
		
	}
	public static void clearwebelement(WebElement input) {
		input.clear();
	}
	
	
	

}
