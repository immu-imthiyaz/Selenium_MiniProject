package com.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Instagram {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RIYAIMMU\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver = new	ChromeDriver ();
		driver.get("https://www.instagram.com/?hl=en");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement f = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		
		
		f.click();
		
	}			
	}				