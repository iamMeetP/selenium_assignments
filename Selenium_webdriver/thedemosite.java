package Selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class thedemosite {
        public static void main(String[] args) {
        	System.setProperty("webdriver.chrome.driver","D:\\Chrome Driver\\chromedriver.exe");
       		WebDriver driver = new ChromeDriver();
       		driver.get("https://thedemosite.co.uk/contact/");
       		
       		driver.findElement(By.name("fcb44c85")).sendKeys("Meet");
       		driver.findElement(By.name("0112ce16")).sendKeys("Patel");
       		driver.findElement(By.name("012af4e3")).sendKeys("pmv110319@gmail.com");
       		driver.findElement(By.name("fd8a921a")).sendKeys("Hello");
       		driver.findElement(By.className("uagb-forms-main-submit-button-text")).click();
		}
}
