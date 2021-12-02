package com.launch;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_face_newac {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RIYAIMMU\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		WebElement createnewlogin = driver.findElement(By.xpath("//p[contains(text(),'have an')]"));
		createnewlogin.click();
		
		Thread.sleep(2000);
		
		TakesScreenshot scr = (TakesScreenshot) driver;
		File scrFile = scr.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\RIYAIMMU\\eclipse-workspace\\Selenium_Concepts\\src\\com\\launch\\Launch_face_newac.java");
		
		
		
		
	
	}	
	}	