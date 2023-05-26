package Selenium_webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_btn {
        public static void main(String[] args) {
        	 System.setProperty("webdriver.chrome.driver","D:\\Chrome Driver\\chromedriver.exe");
     		 WebDriver driver = new ChromeDriver();
     		 driver.get("https://demo.guru99.com/test/radio.html");
     		 
     		 driver.manage().window().maximize();
     		 List<WebElement> gender = driver.findElements(By.name("webform"));
     		 gender.get(2).click();
     		 
     		
		}
}
	