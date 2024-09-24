package com.assessment;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebTables {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver","E:\\Tops 2024\\Selenium\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/webtables");		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@id='edit-record-1']")).click();
		Thread.sleep(2000);
		
		WebElement name = driver.findElement(By.xpath("//input[@id='firstName']"));
        name.clear();
        Thread.sleep(2000);
        name.sendKeys("tops");
        Thread.sleep(2000);

        driver.findElement(By.id("submit")).click();
        Thread.sleep(2000); 
        
        driver.findElement(By.id("delete-record-1")).click();
	    Thread.sleep(2000);
	    
	    Thread.sleep(2000);
	    driver.close();	
		}
}
