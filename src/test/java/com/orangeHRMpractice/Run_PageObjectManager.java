package com.orangeHRMpractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;

import com.BaseClass.BassClass;
import com.pageobjectmanager.Page_Object_Manager;

public class Run_PageObjectManager extends BassClass {
	public static WebDriver driver= browserlanch("chrome");
	public static Page_Object_Manager pom = new Page_Object_Manager (driver);
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		getUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		wait1();
		inputonElement(pom.getLp().getUsername(), "Admin");
		inputonElement(pom.getLp().getPass(), "admin123");
		clickonElement(pom.getLp().getLogin());
		wait1();
		
		clickonElement(pom.getSp().getPim());
		wait1();
		clickonElement(pom.getSp().getAddemploy());
		wait1();
		
		inputonElement(pom.getEp().getFirstname(), "DHIVAGAR");
	    inputonElement(pom.getEp().getMiddlename(), "Kumar");
	    inputonElement(pom.getEp().getLastname(), "Dhiva007");
	    clickonElement(pom.getEp().getEmpid());
	    Robot ro = new Robot();
		ro.keyPress(KeyEvent.VK_CONTROL);
		ro.keyPress(KeyEvent.VK_A);
		ro.keyRelease(KeyEvent.VK_A);
		ro.keyRelease(KeyEvent.VK_CONTROL);
		ro.keyPress(KeyEvent.VK_DELETE);
		ro.keyRelease(KeyEvent.VK_DELETE);
		inputonElement(pom.getEp().getEmpid(), "40007");
		clickonElement(pom.getEp().getSubmit());


	}

}
