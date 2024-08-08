package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumFrame {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://selenium-prd.firebaseapp.com/home.html");
		driver.manage().window().maximize();
		
	
		
//		WebElement frame = (WebElement) driver.findElement(By.xpath("//iframe[@id='marketing']"));
//		driver.switchTo().frame(frame);
		
//		WebElement register = driver.findElement(By.xpath("//span[@contains(text(),'Register']"));
//		register.click();
		



	}

}
