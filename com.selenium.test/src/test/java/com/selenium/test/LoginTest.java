package com.selenium.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.selenium.ui.ProjectDetailPage;

public class LoginTest {

	@Test
	public static void loginlogout() throws AWTException 
	{
	System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.demoblaze.com/index.html");
	driver.findElement(By.id(ProjectDetailPage.Login)).click();
	driver.findElement(By.id(ProjectDetailPage.LOGIN_USERNAME)).isEnabled();
	JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
	jsExecutor.executeScript("document.getElementById('loginusername').value='testm11'"); 
	jsExecutor.executeScript("document.getElementById('loginpassword').value='testmpwd11'"); 
	jsExecutor.executeScript("arguments[0].click();",driver.findElement(By.xpath(ProjectDetailPage.LOGIN_BUTTON)));
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
}
}
