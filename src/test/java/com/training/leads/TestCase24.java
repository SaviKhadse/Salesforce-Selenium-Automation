//Test ID		TC24

package com.training.leads;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase24 {

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
		
		WebElement leads = driver.findElement(By.xpath("//a[text()='Leads']"));
		leads.click();
		
		WebElement newbutton = driver.findElement(By.xpath("//input[@title='New']"));
		newbutton.click();
		
		WebElement lastname = driver.findElement(By.id("name_lastlea2"));
		lastname.sendKeys("ABCD");
		
		WebElement company = driver.findElement(By.id("lea3"));
		company.sendKeys("ABCD");
		
		WebElement save = driver.findElement(By.xpath("//input[@title='Save']"));
		save.click();
		
	}

}
