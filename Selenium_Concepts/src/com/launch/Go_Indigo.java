package com.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Go_Indigo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RIYAIMMU\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		   
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goindigo.in/");
		Thread.sleep(3000);
		
		WebElement flightbook = driver.findElement(By.xpath("(//a[contains(@class,'header-modal')])[2]"));
		
		flightbook.click();
		
		WebElement mob = driver.findElement(By.xpath("(//input[@type='tel'])[2]"));
		
		mob.sendKeys("9092229011");
		
		
		WebElement pswd = driver.findElement(By.xpath("//a[contains(text(),'Forgot')]"));
		
		pswd.click();
		
		
	
		
	}

}
