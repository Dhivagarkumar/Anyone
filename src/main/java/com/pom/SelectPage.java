package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPage {
	public WebDriver driver;
	
	@FindBy(xpath="//html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")
	private WebElement pim;
	
	@FindBy(xpath="//a[text()='Add Employee']")
	private WebElement addemploy;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getPim() {
		return pim;
	}

	public WebElement getAddemploy() {
		return addemploy;
	}
	public SelectPage(WebDriver abc) {
		this.driver=abc;
		PageFactory.initElements(driver, this);
	}
	
}
