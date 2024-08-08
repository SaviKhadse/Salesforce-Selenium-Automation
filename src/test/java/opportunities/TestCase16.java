//Test ID	TC16

package opportunities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase16 {
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
		
		WebElement opportunity = driver.findElement(By.xpath("//a[text()='Opportunities']"));
		opportunity.click();
		
		WebElement newopportunity = driver.findElement(By.xpath("//input[@name='new']"));
		newopportunity.click();
		
		WebElement opponame = driver.findElement(By.id("opp3"));
		opponame.sendKeys("Automation");

		WebElement accname = driver.findElement(By.id("opp4"));
		accname.sendKeys("Global");		
//		
//		String parenthandle = driver.getWindowHandle();
//		WebElement searchaccname = driver.findElement(By.xpath("//img[@title='Account Name Lookup (New Window)']"));
//		searchaccname.click();
//		for(String handle:driver.getWindowHandles()) {
//			System.out.println(handle);
//			driver.switchTo().window(handle);
//		}
//		WebElement searchinnew = driver.findElement(By.id("lksrch"));
//		searchinnew.sendKeys("Global");
//		WebElement lookup1 = driver.findElement(By.xpath("//a[@class=' dataCell ']"));
//		lookup1.click();
//		
		WebElement closedt = driver.findElement(By.id("opp9"));
		closedt.click();
		
		WebElement selectdt = driver.findElement(By.xpath("//a[text()='Today']"));
		selectdt.click();
		
		WebElement stage = driver.findElement(By.xpath("//option[text()='Prospecting']"));
		stage.click();
		
		WebElement probability = driver.findElement(By.id("opp12"));
		probability.clear();
		probability.sendKeys("5");
		
		WebElement Leadsrc = driver.findElement(By.xpath("//option[text()='Web']"));
		Leadsrc.click();
		
		WebElement primarycampaignsrc = driver.findElement(By.id("opp17"));
		
		primarycampaignsrc.sendKeys("DM Campaign to Top Customers - Nov 12-23, 2001");
		
		WebElement save = driver.findElement(By.xpath("//input[@title='Save']"));
		save.click();
		
//		String parenthandle = driver.getWindowHandle();
//		WebElement search = driver.findElement(By.xpath("//img[@title='Primary Campaign Source Lookup (New Window)']"));
//		search.click();
//		
//		for(String handle:driver.getWindowHandles()) {
//			driver.switchTo().window(handle);
//			
//		}
//	
//		WebElement searchinhandle=driver.findElement(By.id("lksrch"));
//		searchinhandle.sendKeys("*DM");
//		WebElement gobutton =driver.findElement(By.xpath("//input[@title='Go!']"));
//		gobutton.click();
//		WebElement lookup = driver.findElement(By.xpath("//a[@text()='DM Campaign to Top Customers - Nov 12-23, 2001']"));
//		lookup.click();
//		driver.switchTo().window(parenthandle);
//		
//		
//		
////		String parenthandle = driver.getWindowHandle();
//		for(String handle:driver.getWindowHandles()) {
//			driver.switchTo().window(handle);
//			WebElement lookup = driver.findElement(By.xpath("//a[@class=' dataCell ']"));
//			lookup.click();
//		}
//		
	}

}
