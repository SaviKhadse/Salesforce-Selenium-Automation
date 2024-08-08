//Test ID	TC36

package com.training.randomscenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase36 {

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
		
		WebElement hometab= driver.findElement(By.xpath("//a[@title='Home Tab']"));
		hometab.click();
		
		WebElement currDate= driver.findElement(By.xpath("//a[@href='/00U/c?md3=217&md0=2024']"));
		currDate.click();
		
		WebElement selTime= driver.findElement(By.xpath("//a[@href='/00U/e?retURL=%2F00U%2Fc%3Fmd3%3D217%26md0%3D2024&aid=005ak000005xtiL&anm=Savita+ABCD&evt4=8%2F4%2F2024&evt13=8%3A00+PM&RecurrenceStartDateTime=8%2F4%2F2024']"));
		selTime.click();
		
//		String parenthandle = driver.getWindowHandle();
		
		WebElement subCombo= driver.findElement(By.xpath("//img[@title='Subject Combo (New Window)']"));
		subCombo.click();
	
//		for(String handle: driver.getWindowHandles()) {
//			driver.switchTo().window(handle);
//		}
		
		WebElement typeOther = driver.findElement(By.id("evt5"));
		typeOther.sendKeys("Other");
		
//		WebElement other= driver.findElement(By.xpath("//a[text()='Other']"));
//		other.click();
		
//		driver.switchTo().window(parenthandle);
		
		WebElement endTime = driver.findElement(By.id("EndDateTime_time"));
		endTime.click();
		
		WebElement selectTime9 = driver.findElement(By.id("timePickerItem_42"));
		selectTime9.click();
		
		WebElement saveEvent= driver.findElement(By.xpath("//input[@title='Save']"));
		saveEvent.click();
		
	}
}
