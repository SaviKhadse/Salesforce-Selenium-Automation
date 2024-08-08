//Test ID	TC35

package com.training.randomscenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase35 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("savi@enexus.com");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("ZXasqw1$");
		
		WebElement login= driver.findElement(By.id("Login"));
		login.click();
		Thread.sleep(3000);
		alltab();
	
	}
		public static void alltab() throws InterruptedException {
			WebElement alltab= driver.findElement(By.xpath("//img[@title='All Tabs']"));
			alltab.click();
			
			WebElement custtab= driver.findElement(By.xpath("//input[@name='customize']"));
			custtab.click();
			
			WebElement remtab= driver.findElement(By.xpath("//option[text()='Assets']"));
			remtab.click();
			
			WebElement remove= driver.findElement(By.xpath("//img[@title='Remove']"));
			remove.click();
			
			WebElement savebutton= driver.findElement(By.xpath("//input[@title='Save']"));
			savebutton.click();
			
			WebElement usermenu = driver.findElement(By.xpath("//*[@id=\"userNavLabel\"]"));
			usermenu.click();
			
			WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
			logout.click();
			
			
//				WebDriverManager.chromedriver().setup();
				 driver = new ChromeDriver();
				driver.get("https://login.salesforce.com");
				driver.manage().window().maximize();
			
			WebElement username = driver.findElement(By.id("username"));
			username.sendKeys("savi@enexus.com");
			
			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys("ZXasqw1$");
			
			WebElement login= driver.findElement(By.id("Login"));
			login.click();
			Thread.sleep(3000);
			
		}
		
}
