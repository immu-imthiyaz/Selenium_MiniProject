package com.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_dairymilk {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RIYAIMMU\\eclipse-workspace\\Selenium_Concepts\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.cadburygifting.in/personalised-gifts.html?utm_source=google_ads&utm_medium=search&utm_campaign=MDLZ_CJD_Search_RMKT_Brand_EXACT%20(Website%20Visitors)&utm_campaign=MDLZ_CJD_Search_PROS_Brand_Exact&utm_term=cadbury&utm_medium=ppc&utm_source=adwords&hsa_ver=3&hsa_mt=e&hsa_kw=cadbury&hsa_acc=3307066076&hsa_grp=128880024402&hsa_tgt=aud-797648986688:kwd-110209455&hsa_ad=545812510719&hsa_src=g&hsa_cam=14652182773&hsa_net=adwords&gclid=Cj0KCQiAhf2MBhDNARIsAKXU5GR6FOR5sgNP2e_YUsk5GJQbx0offYCK66SDaiESLTvG7b3yi6FhmIUaAtLyEALw_wcB");

		driver.manage().window().maximize();
	    Thread.sleep(3000);
		WebElement rr = driver.findElement(By.xpath("(//a[@role='menuitem'])[2]"));
	
	    
	
		Thread.sleep(4000);
	
		rr.click();
		
		driver.findElement(By.id("4426")).click();
	
	}
}