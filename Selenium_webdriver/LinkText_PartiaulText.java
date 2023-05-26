package Selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText_PartiaulText {
       public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Chrome Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.partialLinkText("Create new account")).click();
		
	}
}
