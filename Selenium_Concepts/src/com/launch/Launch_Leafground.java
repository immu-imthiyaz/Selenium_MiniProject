package com.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Launch_Leafground {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RIYAIMMU\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
		
		driver.manage().window().maximize();
		
	    driver.findElement(By.xpath("(//a[contains(@class,'link maxheight')])[5]")).click();
	
	    Thread.sleep(3000); 
	    
	    WebElement opt = driver.findElement(By.xpath(("(//select)[5]")));
	    
		opt.click();
	    Select s = new Select(opt);	
	    
		s.selectByValue("2");
		Thread.sleep(3000);
		
		s.selectByValue("3");
		
	}

}
