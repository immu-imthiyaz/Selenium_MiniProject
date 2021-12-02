package com.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Frames {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RIYAIMMU\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		driver.switchTo().frame("wrapframe");
		Thread.sleep(2000);
		driver.switchTo().frame("frame2");
		driver.findElement(By.id("Click1")).click();
	}

}
