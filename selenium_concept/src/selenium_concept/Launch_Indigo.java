package selenium_concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Indigo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RIYAIMMU\\eclipse-workspace\\selenium_concept\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goindigo.in/add-on-services.html?linkNav=add-on-services_header");
		driver.manage().window().maximize();
		WebElement airline = driver.findElement(By.xpath("//div[@id='tab-details--1731830057']/div/div/div[2]/div[5]/div/div/picture/img"));
		airline.click();
	}

}
