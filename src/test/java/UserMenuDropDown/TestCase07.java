//Test ID	TC06

package UserMenuDropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase07 {
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
//		Select user menu for <username> drop down[TC01]
		WebElement usermenu = driver.findElement(By.xpath("//*[@id=\"userNavLabel\"]"));
		usermenu.click();
		
		WebElement profile = driver.findElement(By.xpath("//a[text()='My Profile']"));
		profile.click();
//		Click "My profile" option from user menu
		WebElement editprofile = driver.findElement(By.xpath("//img[@alt=\"Edit Profile\"]"));
		editprofile.click();
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='contactInfoContentId']"));
		driver.switchTo().frame(frame);
		
		WebElement about = driver.findElement(By.xpath("//a[contains(text(),'About')]"));
		about.click();
//		Click on About tab and enter <Lastname> and click on save all button
		WebElement lastname = driver.findElement(By.id("lastName"));
		lastname.clear();
		lastname.sendKeys("Khadse");
		String lastnametext = lastname.getText();
//		System.out.println(lastnametext);
		
		WebElement saveall =driver.findElement(By.xpath("//input[@class='zen-btn zen-primaryBtn zen-pas']"));
		saveall.click();
		
//		WebElement feed = driver.findElement(By.id("profileTab_sfdc.ProfilePlatformFeed"));
//		feed.click();

		Thread.sleep(3000);
	
//		post();
//		file();
		profilepic();
	}
	public static void post() throws InterruptedException {
//		WebElement post = driver.findElement(By.xpath("//span[text()='Post']"));
//		post.click();
//		
//		WebElement postframe = driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
//		driver.switchTo().frame(postframe);
//		
//		WebElement posttext= driver.findElement(By.xpath("//body[contains(text(),'Share an update, @mention someone...')]"));
//		posttext.click();
//		posttext.sendKeys("Hi");
//		driver.switchTo().defaultContent();
//		Thread.sleep(3000);
//		
//		WebElement share = driver.findElement(By.id("publishersharebutton"));
//		share.click();
		
		
		WebElement file= driver.findElement(By.xpath("//span[text()='File']"));
		file.click();
		
		WebElement uploadfile=driver.findElement(By.id("chatterUploadFileAction"));
		uploadfile.click();
		
		WebElement choosefile = driver.findElement(By.id("chatterFile"));
		choosefile.sendKeys("/Users/savitakhadse/Desktop/Java/SFDC 37 Testcases.xlsx");
		
		
}
	
	public static void file() {

		WebElement file= driver.findElement(By.xpath("//span[text()='File']"));
		file.click();
		
		WebElement uploadfile=driver.findElement(By.id("chatterUploadFileAction"));
		uploadfile.click();
		
		WebElement choosefile = driver.findElement(By.id("chatterFile"));
		choosefile.sendKeys("/Users/savitakhadse/Desktop/Java/SFDC 37 Testcases.xlsx");
		
		WebElement share = driver.findElement(By.id("publishersharebutton"));
		share.click();
		
	}
	public static void profilepic() throws InterruptedException {
//		Thread.sleep(2000);
		WebElement switchTomoderator = driver.findElement(By.xpath("//div[@class='photoUploadSection']"));
		Actions actions = new Actions(driver);
		actions.moveToElement(switchTomoderator).build().perform();
		
		WebElement picupdate =driver.findElement(By.id("uploadLink"));
		picupdate.click();
		
		WebElement chooseframe = driver.findElement(By.xpath("//iframe[@id='uploadPhotoContentId']"));
		driver.switchTo().frame(chooseframe);
		
		WebElement choosepic = driver.findElement(By.id("j_id0:uploadFileForm:uploadInputFile"));
		choosepic.sendKeys("/Users/savitakhadse/Desktop/Personal/Screenshot 2024-03-04 at 10.10.03 PM.png");
		
		WebElement savepic =driver.findElement(By.xpath("//input[@id='j_id0:uploadFileForm:uploadBtn']"));
		savepic.click();
	
		WebElement croppic = driver.findElement(By.xpath("//div[@class='imgCrop_clickArea']"));
		croppic.click();
		
		WebElement savecroppic =driver.findElement(By.xpath("//input[@id='j_id0:j_id7:save']"));
		savecroppic.click();
	}
	
}
