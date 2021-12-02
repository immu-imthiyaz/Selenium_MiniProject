package com.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_script_excicuture {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RIYAIMMU\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement scr = driver.findElement(By.xpath("//div[@class='nav-logo-base nav-sprite']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView();", scr);
		
		
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,-3000);");
		
		Thread.sleep(4000);


		
		js.executeScript("window.scrollBy(0,+1500);");

		
		js.executeScript("arguments[0].click();",scr);
		
		
	}
	

}
