package Selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class imageoflogo_fb {
         public static void main(String[] args) {
        	 System.setProperty("webdriver.chrome.driver","D:\\Chrome Driver\\chromedriver.exe");
        	 WebDriver driver = new ChromeDriver();
        	 driver.get("https://www.facebook.com/login.php");
        	 
        	 driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/img"));
		}
}
