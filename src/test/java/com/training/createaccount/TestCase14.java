//Test ID	TC14 incomplete

package com.training.createaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase14 {
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

		WebElement accwithlast = driver.findElement(By.xpath("//a[contains(text(),'Accounts with last')]"));
		accwithlast.click();
		Thread.sleep(2000);
		
		WebElement datefield = driver.findElement(By.id("ext-gen148"));
		datefield.click();
		
		WebElement createddate = driver.findElement(By.xpath("//div[text()='Created Date']"));
		createddate.click();
		
		WebElement fromdate = driver.findElement(By.id("ext-gen152"));
		fromdate.click();
		
		WebElement today1 =driver.findElement(By.xpath("//button[text()='Today']"));
		today1.click();
		
		WebElement todate = driver.findElement(By.id("ext-gen154"));
		todate.click();
		
		Thread.sleep(1000);
		WebElement today2 =driver.findElement(By.id("ext-gen296"));
		today2.click();
		
		WebElement save= driver.findElement(By.id("ext-gen49"));
		save.click();
		
		WebElement repname = driver.findElement(By.id("saveReportDlg_reportNameField"));
		repname.sendKeys("report1");
		WebElement repunikname = driver.findElement(By.id("saveReportDlg_DeveloperName"));

		repunikname.click();
		
		WebElement saveAndrun = driver.findElement(By.id("ext-gen316"));
		saveAndrun.click();
	}

}
