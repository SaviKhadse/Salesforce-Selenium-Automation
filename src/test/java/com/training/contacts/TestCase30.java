//Test ID	TC30

package com.training.contacts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase30 {
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
		
		WebElement contacts= driver.findElement(By.xpath("//a[text()='Contacts']"));
		contacts.click();
		WebElement createnewview= driver.findElement(By.xpath("//a[text()='Create New View']"));
		createnewview.click();
		
		WebElement uniquename= driver.findElement(By.id("devname"));
		uniquename.sendKeys("EFGH");
		
		WebElement save= driver.findElement(By.xpath("//input[@title='Save']"));
		save.click();
		
		WebElement errmsg = driver.findElement(By.xpath("//div[text()=' You must enter a value']"));
		String errormessage = errmsg.getText();
		System.out.println(errormessage);
	}
}
