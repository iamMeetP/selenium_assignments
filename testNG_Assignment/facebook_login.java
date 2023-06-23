package testNG_Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class facebook_login {
       
	 public static final String EmailId ="email";
	 public static final String Password ="pass";
	 public static final String Loginid = "loginbutton";
	 
	 public String url;
	 public WebDriver driver;
	 public String username;
	 public String password;
	 
	 public FacebookLoginform() {
		 System.setProperty("webdriver.chrome.driver","D:\\Chrome Driver\\chromedriver.exe");
    	 WebDriver driver = new ChromeDriver();
    	 url = "https://www.facebook.com/";
    	 username ="patelmeet402@gmail.com";
    	 password ="123454557";
	 }
	 @Test
	 public void attemptLogin() {
		 driver.get(url);
		driver.manage().window().maximize();
		
		WebElement emailTag = driver.findElement(By.id(EMAILID));
		emailTag.clear();
		emailTag.sendKeys(username);
		
		WebElement passwordTag = driver.findElement(By.id(PASSWORDID));
		passwordTag.clear();
		passwordTag.sendKeys(password);
		
		WebElement loginTag = driver.findElement(By.id(LOGINID));
		loginTag.click();

	 }
}
