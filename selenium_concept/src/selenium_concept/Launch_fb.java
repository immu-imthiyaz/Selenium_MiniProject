package selenium_concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_fb {
	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RIYAIMMU\\eclipse-workspace\\selenium_concept\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement fb = driver.findElement(By.id("email"));
		fb.sendKeys("9092229011");
		WebElement pswrd = driver.findElement(By.id("pass"));
		pswrd.sendKeys("110121riz");
		WebElement log = driver.findElement(By.name("login"));
		log.click();
		
	}

}
