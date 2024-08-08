//Test ID		TC22-defaultView

package com.training.leads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase22 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.manage().window().maximize();
		
		login();
		
		WebElement leads = driver.findElement(By.xpath("//a[text()='Leads']"));
		leads.click();
		
		WebElement Myunreadleads = driver.findElement(By.xpath("//option[@value='00Bak00000CjKUQ']"));
		Myunreadleads.click();

		WebElement usermenu = driver.findElement(By.xpath("//*[@id=\"userNavLabel\"]"));
		usermenu.click();
		
		WebElement menulist = driver.findElement(By.id("userNav-menuItems"));

		WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
		logout.click();
		
		Thread.sleep(2000);
		
		login();
		
		Thread.sleep(2000);
		WebElement leads1 = driver.findElement(By.xpath("//a[text()='Leads']"));
		leads1.click();
		
		WebElement golead = driver.findElement(By.xpath("//input[@title='Go!']"));
		golead.click();
		
	}
	public static void login() throws InterruptedException {
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("savi@enexus.com");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("ZXasqw1$");
		
		WebElement login= driver.findElement(By.id("Login"));
		login.click();
		Thread.sleep(2000);
	}
		
		

}
