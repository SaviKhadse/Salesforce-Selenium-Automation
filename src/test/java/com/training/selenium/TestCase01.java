//	1. Test ID-	Login Error Message - 1

package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase01 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("abc@abc.com");
		
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		
		WebElement login= driver.findElement(By.id("Login"));
		login.click();
		
		WebElement error = driver.findElement(By.id("error"));
		String errTxt = error.getText();
		System.out.println(errTxt);
		
		
	}

}
