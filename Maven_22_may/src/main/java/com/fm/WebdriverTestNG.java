package com.fm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class WebdriverTestNG {
	
	WebDriver driver;
	
	@BeforeTest
	public static void before() throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	
	}
	
	@AfterTest
	public void after() {
		driver.close();
	}
}