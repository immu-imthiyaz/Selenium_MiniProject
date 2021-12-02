package com.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Sel {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RIYAIMMU\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement fb = driver.findElement(By.xpath("//input[@type='text']"));
        fb.sendKeys("9092229011");
        WebElement paswrd = driver.findElement(By.xpath("//input[@type='password']"));
        paswrd.sendKeys("110121riz");
        WebElement log = driver.findElement(By.xpath("//button[@value='1']"));
       log.click(); 
        
        
	}   
	}