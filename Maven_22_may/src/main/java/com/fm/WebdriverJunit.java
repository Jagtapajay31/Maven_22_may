package com.fm;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverJunit {
	
	WebDriver driver;
	@Before
	public void before() throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		}
	@Test
	public void test() throws InterruptedException {
		driver.findElement(By.cssSelector("input.input_error.form_input")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input.submit-button.btn_action")).click();
		Thread.sleep(2000);
		}

	@After
	public void after() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}
}