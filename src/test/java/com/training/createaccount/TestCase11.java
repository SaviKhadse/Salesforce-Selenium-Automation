//Test ID	TC10 CreateAccount

package com.training.createaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase11 {
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
		
		
		WebElement newbutton = driver.findElement(By.xpath("//input[@name='new']"));
		newbutton.click();
		
		WebElement accname = driver.findElement(By.id("acc2"));
		accname.sendKeys("sss");
		
		WebElement typedropdown = driver.findElement(By.xpath("//option[text()='Technology Partner']"));
		typedropdown.click();
		
		WebElement custpriority = driver.findElement(By.xpath("//option[text()='High']"));
		custpriority.click();
		
		WebElement saveaccount = driver.findElement(By.xpath("//input[@name='save']"));
		saveaccount.click();
		
	}

}
