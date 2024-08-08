//Test ID	TC11 Createnewview

package com.training.createaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase12 {
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
		Thread.sleep(2000);
		WebElement accounts=driver.findElement(By.xpath("//a[text()='Accounts']"));
		accounts.click();
		
		WebElement newview = driver.findElement(By.xpath("//a[text()='Create New View']"));
		newview.click();
		Thread.sleep(2000);
		WebElement vname = driver.findElement(By.id("fname"));
		vname.sendKeys("mynewview");
		
		WebElement uniquename = driver.findElement(By.id("devname"));
		uniquename.sendKeys("MNV");
		
		WebElement viewsave = driver.findElement(By.xpath("//input[@name='save']"));
		viewsave.click();
		
	}

}
