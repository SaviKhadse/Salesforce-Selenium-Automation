//Test ID	TC37

package com.training.randomscenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.util.Calendar;

//import java.util.TimeZone;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase37 {
static WebDriver driver;

private static TestCase37 DateUtil;
	
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
		
		WebElement currDate= driver.findElement(By.xpath("//a[@href='/00U/c?md3=218&md0=2024']"));
		currDate.click();
		
		WebElement selTime= driver.findElement(By.xpath("//a[@href='/00U/e?retURL=%2F00U%2Fc%3Fmd3%3D218%26md0%3D2024&aid=005ak000005xtiL&anm=Savita+ABCD&evt4=8%2F5%2F2024&evt13=4%3A00+PM&RecurrenceStartDateTime=8%2F5%2F2024']"));
		selTime.click();
		
		WebElement subCombo= driver.findElement(By.xpath("//img[@title='Subject Combo (New Window)']"));
		subCombo.click();
		
		WebElement typeOther = driver.findElement(By.id("evt5"));
		typeOther.sendKeys("Other");
		
		WebElement endTime = driver.findElement(By.id("EndDateTime_time"));
		endTime.click();
		
		WebElement selectTime7 = driver.findElement(By.id("timePickerItem_38"));
		selectTime7.click();
		
		WebElement recurrence = driver.findElement(By.id("IsRecurrence"));
		recurrence.click();
		
		WebElement weekly = driver.findElement(By.xpath("//label[text()='Weekly']"));
		weekly.click();
		
		String futureDate = TestCase37.getFutureDate(14);
//		System.out.println(futureDate);
		WebElement recEndDate = driver.findElement(By.id("RecurrenceEndDateOnly"));
		recEndDate.sendKeys(futureDate);
		
		WebElement saveEvent= driver.findElement(By.xpath("//input[@title='Save']"));
		saveEvent.click();
		
		WebElement monthView = driver.findElement(By.xpath("//img[@title='Month View']"));
		monthView.click();
	}
	public static String getFutureDate(int daysToAdd) {
        LocalDate today = LocalDate.now();
        LocalDate futureDate = today.plusDays(daysToAdd);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyyy"); // Format as needed
        return futureDate.format(formatter);
    }
}
