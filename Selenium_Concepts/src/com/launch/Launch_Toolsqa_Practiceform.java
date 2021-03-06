package com.launch;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Launch_Toolsqa_Practiceform {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RIYAIMMU\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30 , TimeUnit.SECONDS);
		driver.findElement(By.id("firstName")).sendKeys("immu");
		
		driver.findElement(By.id("lastName")).sendKeys("imthiyaz");
		
		driver.findElement(By.id("userEmail")).sendKeys("mdimmu07@gmail.com");

		driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();
		
		driver.findElement(By.id("userNumber")).sendKeys("1234567890");
		
		driver.findElement(By.id("dateOfBirthInput")).click();
		
		Select sc = new Select(driver.findElement(By.xpath("(//select)[1]")));

		sc.selectByIndex(0);
		
		Select sc1 = new Select(driver.findElement(By.xpath("(//select)[2]")));
		
		sc1.selectByVisibleText("1996");
		
		driver.findElement(By.xpath("(//div[@role='option'])[12]")).click();
//		Thread.sleep(4000);
		
		driver.findElement(By.id("subjectsInput")).sendKeys("form practice");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollTo(0,1000)");
		driver.findElement(By.xpath("//label[text()='Sports']")).click();
		
		driver.findElement(By.xpath("//label[text()='Music']")).click();
		
		driver.findElement(By.id("currentAddress")).sendKeys("66 chennai");
		
		driver.findElement(By.xpath("//div[text()='Select State']")).click();
		
		driver.findElement(By.xpath("//div[text()='Rajasthan']")).click();
		
		driver.findElement(By.xpath("//div[text()='Select City']")).click();
		
		driver.findElement(By.xpath("//div[text()='Jaipur']")).click();
		
		driver.findElement(By.id("submit")).click();
		
		Thread.sleep(3000);

		TakesScreenshot ts = (TakesScreenshot) driver;
		File ts1 = ts.getScreenshotAs(OutputType.FILE);
		File scr = new File("C:\\Users\\RIYAIMMU\\eclipse-workspace\\Selenium_Concepts\\ScreenShotf1\\pic2.png");
		
		FileUtils.copyFile(ts1, scr);
		Thread.sleep(3000);
	
		driver.findElement(By.id("closeLargeModal")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
