package com.launch;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Alert {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RIYAIMMU\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();
		Alert alert1 = driver.switchTo().alert();
		Thread.sleep(2000);
		alert1.accept();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='confirmAlert()']")).click();
		Alert alert2 = driver.switchTo().alert();
		alert2.dismiss();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@onclick='confirmPrompt()']")).click();
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("immu");
		Thread.sleep(3000);
		
		alert3.accept();
		
		
	}

}
