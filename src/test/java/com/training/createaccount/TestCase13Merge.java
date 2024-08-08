package com.training.createaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase13Merge {
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
		
		WebElement mergeaccount = driver.findElement(By.xpath("//a[text()='Merge Accounts']"));
		mergeaccount.click();
		
		WebElement textaccname = driver.findElement(By.id("srch"));
		textaccname.sendKeys("savi");
		
		WebElement findacc =driver.findElement(By.xpath("//input[@name='srchbutton']"));
		findacc.click();
		
		WebElement chkbox1 = driver.findElement(By.id("cid0"));
//		chkbox1.clear();
//		chkbox1.click();
		WebElement chkbox2 = driver.findElement(By.id("cid1"));
//		chkbox2.clear();
//		chkbox2.click();
		WebElement nextbtn = driver.findElement(By.xpath("//input[@name='goNext']"));
		nextbtn.click();
		
		WebElement merge= driver.findElement(By.xpath("//input[@name='save']"));
		merge.click();
		driver.switchTo().alert().accept();
		
//		WebElement okprompt = driver.findElement(By.xpath("//button[text()='Promt Alert']"));
		
//		WebElement nextbutton = driver.findElement(By.xpath("//input[@name='goNext']"));
//		nextbutton.click();
		
	}

}
