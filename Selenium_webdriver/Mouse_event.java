package Selenium_webdriver;

import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_event {
        public static void main(String[] args) throws InterruptedException {
        	System.setProperty("webdriver.chrome.driver","D:\\Chrome Driver\\chromedriver.exe");
    		WebDriver driver = new ChromeDriver();
    		driver.get("https://www.amazon.in/");
    		
    		driver.manage().window().maximize();
    	WebElement minitv =	driver.findElement(By.linkText("Amazon miniTV"));
    	WebElement deals  =	driver.findElement(By.linkText("Today's Deals"));
    	WebElement mobile =	driver.findElement(By.linkText("Mobiles"));
    	
    	Actions action = new Actions(driver);
    	action.moveToElement(minitv).build().perform();
    	
    	Thread.sleep(2000);
    	
    	action.moveToElement(deals).build().perform();
    	
    	Thread.sleep(2000);
    	
    	action.moveToElement(mobile).build().perform();
    	
    	Thread.sleep(1000);
    	driver.quit();
    	
		}
}
