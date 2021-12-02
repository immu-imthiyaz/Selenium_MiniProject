package com.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Frame_form {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RIYAIMMU\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/frame.html");

		Thread.sleep(3000);
		WebElement f1 = driver.findElement(By.xpath("//*[@id=\"wrapframe\"]/iframe"));
	
		driver.switchTo().frame(f1);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"Click\"]")).click();
		
		driver.switchTo().defaultContent();
		Thread.sleep(3000);

		WebElement f2 = driver.findElement(By.xpath("(//*[@id=\"wrapframe\"]/iframe)[2]"));
		driver.switchTo().frame(f2);
		Thread.sleep(3000);

		WebElement f3 = driver.findElement(By.xpath("(//*[@id=\"frame2\"])[1]"));
	
		driver.switchTo().frame(f3);
		Thread.sleep(3000);
		driver.findElement(By.id("Click1")).click();
		
		System.out.println(f3.getText());
		

		
	}

}
