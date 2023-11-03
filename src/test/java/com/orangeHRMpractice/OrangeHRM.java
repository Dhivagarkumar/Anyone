package com.orangeHRMpractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BaseClass.BassClass;

public class OrangeHRM extends BassClass{
	
	public static void main(String[] args) throws InterruptedException, AWTException {
		
		getUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		wait1();
		WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
		inputonElement(username, "Admin");
		
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		inputonElement(pass, "admin123");
		
		WebElement loginBTN = driver.findElement(By.xpath("//button[@type='submit']"));
		clickonElement(loginBTN);
		wait1();
		
		WebElement pm = driver.findElement(By.xpath("//html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a"));
		clickonElement(pm);
		wait1();
		
		WebElement addemp = driver.findElement(By.xpath("//a[text()='Add Employee']"));
		clickonElement(addemp);
		wait1();
		
		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstName']"));
		inputonElement(firstname, "DHIVAGAR");
		
		WebElement middlename = driver.findElement(By.xpath("//input[@name='middleName']"));
		inputonElement(middlename, "Kumar");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastName']"));
		inputonElement(lastname, "Dhiva007");
		
		WebElement empid = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/input"));
		clickonElement(empid);
		Robot ro = new Robot();
		ro.keyPress(KeyEvent.VK_CONTROL);
		ro.keyPress(KeyEvent.VK_A);
		ro.keyRelease(KeyEvent.VK_A);
		ro.keyRelease(KeyEvent.VK_CONTROL);
		ro.keyPress(KeyEvent.VK_DELETE);
		ro.keyRelease(KeyEvent.VK_DELETE);
		inputonElement(empid, "4007");
		
		WebElement savebtn = driver.findElement(By.xpath("//button[@type='submit']"));
		clickonElement(savebtn);
		wait1();
		
		WebElement emplylist = driver.findElement(By.xpath("//a[text()='Employee List']"));
		clickonElement(emplylist);
		wait1();
		
		WebElement hintname = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input"));
		clickonElement(hintname);
		inputonElement(hintname, "DHIVAGAR");
		
		WebElement id = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/input"));
		clickonElement(id);
		inputonElement(id, "4007");
		
		WebElement serch = driver.findElement(By.xpath("//button[@type='submit']"));
		clickonElement(serch);
		
//		WebElement nickname = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[2]/div/div/div[2]/input"));
//		clickonElement(nickname);
//		inputonElement(nickname, "dhiva4007");
//		
//		WebElement otherid = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[2]/div/div[2]/input"));
//		inputonElement(otherid, "453778");
//		
//		WebElement licno = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/input"));
//		inputonElement(licno, "123456789012345");
//		
//		WebElement expdate = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[2]/div/div[2]/div/div/input"));
//		inputonElement(expdate, "2024-07-15");
	}
	

}
