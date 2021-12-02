package com.launch;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_screenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RIYAIMMU\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		
		WebElement scr = driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));
		
		JavascriptExecutor scroll = (JavascriptExecutor) driver;
		
		scroll.executeScript("arguments[0].scrollIntoView();", scr);
		
		Thread.sleep(2000);
		
		scroll.executeScript("window.scrollBy(0,-2000);");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		
		File inp = ts.getScreenshotAs(OutputType.FILE);
		
		File destination = new File("C:\\Users\\RIYAIMMU\\eclipse-workspace\\Selenium_Concepts\\ScreenShotf1\\pic1.png");
		
		FileUtils.copyFile(inp, destination);
		
		
		
		
		
		
		
	}

}
