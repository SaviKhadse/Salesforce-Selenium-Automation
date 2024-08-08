//Test ID	TC12 Editview 

package com.training.createaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase13 {
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
		
		WebElement viewdropdown = driver.findElement(By.xpath("//option[text()='mynewview']"));
		viewdropdown.click();
		
		WebElement viewedit = driver.findElement(By.xpath("//a[text()='Edit']"));
		viewedit.click();
		
		WebElement vname = driver.findElement(By.id("fname"));
		vname.clear();
		vname.sendKeys("newview");
		
		WebElement uniquename = driver.findElement(By.id("devname"));
		uniquename.clear();
		uniquename.sendKeys("NV");
		
		WebElement field = driver.findElement(By.xpath("//option[text()='Account Name']"));
		field.click();

		WebElement operator = driver.findElement(By.xpath("//option[text()='contains']"));
		operator.click();
		
		WebElement value = driver.findElement(By.id("fval1"));
		value.sendKeys("a");
		Thread.sleep(1000);
		
		WebElement availablefield = driver.findElement(By.id("colselector_select_0"));
		Select displayfield = new Select(availablefield);
		displayfield.selectByVisibleText("Last Activity");
		
		WebElement addfield = driver.findElement(By.id("colselector_select_0_right"));
		addfield.click();
		
		WebElement viewsave = driver.findElement(By.xpath("//input[@title='Save']"));
		viewsave.click();

	}

}
