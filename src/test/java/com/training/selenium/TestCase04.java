//4. Test ID -Forgot Password- 4 A

package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase04 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		
		WebElement forgotpassword = driver.findElement(By.id("forgot_password_link"));
		forgotpassword.click();
		
		WebElement username = driver.findElement(By.id("un"));
		username.sendKeys("savi@enexus.com");
		
		WebElement continu = driver.findElement(By.id("continue"));
		continu.click();

	}

}
