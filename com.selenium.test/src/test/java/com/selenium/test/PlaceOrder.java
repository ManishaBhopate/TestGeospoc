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

public class PlaceOrder {
	
	@Test
	public static void placeOrder() throws AWTException 
	{
		System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		driver.findElement(By.xpath(ProjectDetailPage.CONTACT_LINK)).click();
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver; 
		jsExecutor.executeScript("document.getElementById('recipient-email').value='Test@gmail.com'"); 
		jsExecutor.executeScript("document.getElementById('recipient-name').value='Test67'"); 
		jsExecutor.executeScript("document.getElementById('message-text').value='This is test message'"); 
		jsExecutor.executeScript("arguments[0].click();",driver.findElement(By.xpath(ProjectDetailPage.CONTACT_SENDMESSAGE)));
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath(ProjectDetailPage.CART_LINK)).click();
		driver.findElement(By.xpath(ProjectDetailPage.PLACE_ORDER)).click();
		jsExecutor.executeScript("document.getElementById('name').value='DNK'"); 
		jsExecutor.executeScript("document.getElementById('country').value='india'"); 
		jsExecutor.executeScript("document.getElementById('city').value='Pune'"); 
		jsExecutor.executeScript("document.getElementById('card').value='232223233'"); 
		jsExecutor.executeScript("document.getElementById('month').value='04'"); 
		jsExecutor.executeScript("document.getElementById('year').value='2022'"); 
		jsExecutor.executeScript("arguments[0].click();",driver.findElement(By.xpath(ProjectDetailPage.PURCHASE)));
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		driver.close();
		
	}

}
