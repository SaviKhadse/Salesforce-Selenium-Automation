//Test ID	TC07

package UserMenuDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase08 {
	static WebDriver driver ;
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
		usermenu();
//		personal();
//		displaylayout();
//		email();
		calRemainder();
	}
	public static void usermenu() throws InterruptedException {
		
		WebElement usermenu = driver.findElement(By.xpath("//*[@id=\"userNavLabel\"]"));
		usermenu.click();
		
		WebElement mysettings = driver.findElement(By.xpath("//a[text()='My Settings']"));
		mysettings.click();
	
	}
	
	public static void personal() {
		WebElement personal = driver.findElement(By.id("PersonalInfo_font"));
		personal.click();
		
		WebElement loginhistory = driver.findElement(By.id("LoginHistory_font"));
		loginhistory.click();
		
		WebElement downloadloginhistory = driver.findElement(By.xpath("//a[contains(text(),'Download login history')]"));
		downloadloginhistory.click();
	}
	
		public static void displaylayout() {
			WebElement displaylayout = driver.findElement(By.id("DisplayAndLayout_font"));
			displaylayout.click();
			
			WebElement customizetab = driver.findElement(By.id("CustomizeTabs_font"));
			customizetab.click();
			
//			WebElement customapp = driver.findElement(By.xpath("//option[contains(text(),'Salesforce Chatter')]"));
//			customapp.click();	
			
			WebElement salesforcechatt = driver.findElement(By.xpath("//option[text()='Salesforce Chatter']"));
			salesforcechatt.click();
			
			WebElement availabletabsreport = driver.findElement(By.xpath("//option[text()='Reports']"));
			availabletabsreport.click();
			
			WebElement addreports = driver.findElement(By.id("duel_select_0_right"));
			addreports.click();
			WebElement savetab = driver.findElement(By.xpath("//input[@name='save']"));
			savetab.click();
		}
		
		public static void email() {
//			Thread.sleep(2000);
			WebElement email = driver.findElement(By.id("EmailSetup_font"));
			email.click();
			
			WebElement myemailsetting = driver.findElement(By.id("EmailSettings_font"));
			myemailsetting.click();
			
			WebElement emailname = driver.findElement(By.id("sender_name"));
			emailname.sendKeys("Savita Khadse");
			
			WebElement emailaddress = driver.findElement(By.id("sender_email"));
			emailaddress.sendKeys("savitakhadse@enexus.com");
			
//			WebElement automaticbcc = driver.findElement(By.xpath("//td[text()='Automatic Bcc']"));
			WebElement bccyes = driver.findElement(By.id("auto_bcc1"));
			
			WebElement saveemail = driver.findElement(By.xpath("//input[@name='save']"));
			
			if(bccyes.isSelected()) {
				
				saveemail.click();
//				
			}else {
				bccyes.click();
			}
				
			WebElement successmsg= driver.findElement(By.id("meSaveCompleteMessage"));
		
			System.out.println(successmsg.getText());
	}
	
	
	public static void calRemainder() {
		
		WebElement calrem = driver.findElement(By.id("CalendarAndReminders_font"));
		calrem.click();
		
		WebElement activity = driver.findElement(By.id("Reminders_font"));
		activity.click();
		
		WebElement testbutton = driver.findElement(By.id("testbtn"));
		testbutton.click();
		
	
		for(String handle:driver.getWindowHandles()) {

			System.out.println(handle);
			System.out.println(driver.getTitle());
		}
		
	}
	
	
	
	
	
	

}
