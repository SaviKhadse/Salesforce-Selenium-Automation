//Test ID	TC25

package com.training.contacts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase25 {
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
		
		WebElement newbutton = driver.findElement(By.xpath("//input[@title='New']"));
		newbutton.click();
		
		WebElement lastname = driver.findElement(By.id("name_lastcon2"));
		lastname.sendKeys("Sharma");
		
		WebElement accname = driver.findElement(By.id("con4"));
		accname.sendKeys("kavi");
//		String parenthandle = driver.getWindowHandle();
		
//		WebElement searchaccname = driver.findElement(By.xpath("//img[@title='Account Name Lookup (New Window)']"));
//		searchaccname.click();
//		
//		for(String handle:driver.getWindowHandles()) {
//			System.out.println(handle);
//			driver.switchTo().window(handle);
//		}
//		WebElement accname = driver.findElement(By.id("lksrch"));
//		accname.sendKeys("Global");
		WebElement save =driver.findElement(By.xpath("//input[@title='Save']"));
		save.click();

	}

}
