package com.launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Launch_incog {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RIYAIMMU\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		Thread.sleep(3000);
		ChromeOptions ch = new ChromeOptions();
		Thread.sleep(2000);
		
		ch.addArguments("incognito");
		Thread.sleep(2000);

		WebDriver driver = new ChromeDriver(ch);
		
		driver.get("https://www.amazon.in/");
		
	}

}
