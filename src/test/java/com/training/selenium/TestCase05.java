package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase05 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("123");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("22131");
		
		WebElement login= driver.findElement(By.id("Login"));
		login.click();
		
		WebElement loginerrortext = driver.findElement(By.id("error"));
		String logerror = loginerrortext.getText();
		System.out.println(logerror);
		
		}
}
