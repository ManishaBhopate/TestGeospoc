package com.selenium.test;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.selenium.ui.ProjectDetailPage;


public class SignUpTest {
	
	@Test
	public static void userSignUp() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		driver.findElement(By.id(ProjectDetailPage.SIGNUP)).click();
		driver.findElement(By.xpath(ProjectDetailPage.USERNAME)).isEnabled();
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
		jsExecutor.executeScript("document.getElementById('sign-username').value='testm10'"); 
		jsExecutor.executeScript("document.getElementById('sign-password').value='testmpwd10'"); 
		jsExecutor.executeScript("arguments[0].click();",driver.findElement(By.xpath(ProjectDetailPage.SIGNUP_BUTTON)));
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		driver.close();	
	}
	
	
}
