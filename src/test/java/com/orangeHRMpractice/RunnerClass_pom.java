package com.orangeHRMpractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;

import com.BaseClass.BassClass;
import com.pom.EmployeDeatiles_Page;
import com.pom.LoginPage;
import com.pom.SelectPage;

public class RunnerClass_pom extends BassClass{
	public static WebDriver driver= browserlanch("chrome");
	public static LoginPage lp = new LoginPage(driver);
	public static SelectPage sp = new SelectPage(driver);
	public static EmployeDeatiles_Page ep = new EmployeDeatiles_Page(driver);
	
	public static void main(String[] args) throws InterruptedException, AWTException {
    getUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    wait1();
    inputonElement(lp.getUsername(), "Admin");
    inputonElement(lp.getPass(), "admin123");
    clickonElement(lp.getLogin());
    wait1();
    
    clickonElement(sp.getPim());
    wait1();
    clickonElement(sp.getAddemploy());
    wait1();
    
    inputonElement(ep.getFirstname(), "DHIVAGAR");
    inputonElement(ep.getMiddlename(), "Kumar");
    inputonElement(ep.getLastname(), "Dhiva007");
    clickonElement(ep.getEmpid());
    Robot ro = new Robot();
	ro.keyPress(KeyEvent.VK_CONTROL);
	ro.keyPress(KeyEvent.VK_A);
	ro.keyRelease(KeyEvent.VK_A);
	ro.keyRelease(KeyEvent.VK_CONTROL);
	ro.keyPress(KeyEvent.VK_DELETE);
	ro.keyRelease(KeyEvent.VK_DELETE);
	inputonElement(ep.getEmpid(), "40007");
	clickonElement(ep.getSubmit());

}
}
