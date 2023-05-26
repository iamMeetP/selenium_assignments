package Selenium_webdriver;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_event {
        public static void main(String[] args) {
        	 System.setProperty("webdriver.chrome.driver","D:\\Chrome Driver\\chromedriver.exe");
        	 WebDriver driver = new ChromeDriver();
        	 driver.get("https://www.guru99.com/keyboard-mouse-events-files-webdriver.html");
        	 
        	 WebElement txtusername = driver.findElement(By.id("email"));
        	 
        	 Actions action = new Actions(driver);
        	 action.moveToElement(txtusername)
        	 .click()
        	 .keyDown(txtusername, Keys.SHIFT)
        	 .sendKeys(txtusername, "hello")
        	 .keyUp(txtusername, Keys.SHIFT)
        	 .doubleClick(txtusername)
        	 .contextClick()
        	 .build()
        	 .perform();
        	 
        	 
        	 
        	 
        	 
        	 
		}
}
