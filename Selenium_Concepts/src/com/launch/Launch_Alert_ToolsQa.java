package com.launch;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Alert_ToolsQa {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RIYAIMMU\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/alerts");
			driver.findElement(By.id("alertButton")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("timerAlertButton")).click();
	Thread.sleep(7000);
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(2000);
		driver.findElement(By.id("confirmButton")).click();
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("immuriya");
		Thread.sleep(3000);
		alert.accept();
		
	
		
		
		
		
		
		
		
	}

}
