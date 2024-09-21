package com.fm;

import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleWebdrive {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		driver.close();
	}
}
