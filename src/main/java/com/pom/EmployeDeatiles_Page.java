package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeDeatiles_Page {
	public WebDriver driver;
	@FindBy(xpath="//input[@name='firstName']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@name='middleName']")
	private WebElement middlename;
	
	@FindBy(xpath="//input[@name='lastName']")
	private WebElement lastname;
	
	@FindBy(xpath="/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input")
	private WebElement empid;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submit;

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getMiddlename() {
		return middlename;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getEmpid() {
		return empid;
	}

	public WebElement getSubmit() {
		return submit;
	}
	public EmployeDeatiles_Page(WebDriver abc) {
		this.driver=abc;
		PageFactory.initElements(driver, this);
	}

}
