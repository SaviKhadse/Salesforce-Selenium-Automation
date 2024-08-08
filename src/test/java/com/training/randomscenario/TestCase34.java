//Test ID	TC34

package com.training.randomscenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase34 {
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
		
		WebElement Home = driver.findElement(By.xpath("//a[@title='Home Tab']"));
		Home.click();
		
		WebElement fnamelname = driver.findElement(By.xpath("//a[text()='Savita Khadse']"));
		fnamelname.click();
		
		WebElement editprofile = driver.findElement(By.xpath("//img[@title='Edit Profile']"));
		editprofile.click();
		
		WebElement aboutframe = driver.findElement(By.id("contactInfoContentId"));
		
		driver.switchTo().frame(aboutframe);
		WebElement abouttab = driver.findElement(By.id("aboutTab"));
		abouttab.click();
		
		WebElement editlastname= driver.findElement(By.id("lastName"));
		editlastname.clear();
		editlastname.sendKeys("ABCD");
		
		WebElement saveall = driver.findElement(By.xpath("//input[@value='Save All']"));
		saveall.click();
		
	}

}
