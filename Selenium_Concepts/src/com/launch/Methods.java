package com.launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RIYAIMMU\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.navigate().to("https://www.flipkart.com/");
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
//		driver.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
