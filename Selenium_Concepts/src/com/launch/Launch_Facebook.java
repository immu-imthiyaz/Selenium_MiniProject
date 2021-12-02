package com.launch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Launch_Facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RIYAIMMU\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("firstname")).sendKeys("immu");
		
		driver.findElement(By.name("lastname")).sendKeys("imthiyaz");
		
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9092229011");
		
		driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("1239892380");
		
		WebElement date = driver.findElement(By.id("day"));
		
		Select d = new Select(date);
		
		d.selectByValue("11");
		
		WebElement month = driver.findElement(By.id("month"));
		
		Select m = new Select(month);
		
		m.selectByVisibleText("Oct");
		
		WebElement year = driver.findElement(By.id("year"));
		
		Select y = new Select(year);
		
		y.selectByValue("1997");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		List<WebElement> y1 = y.getOptions();
		
		for (WebElement yr: y1) {
			String text = yr.getText();
			System.out.println(text);
			
		}
		
		WebElement fs = m.getFirstSelectedOption();
		System.out.println(fs.getText());
		
		boolean multiple = d.isMultiple();
		System.out.println(multiple);
		
		
		
		
		
		
	}

}
