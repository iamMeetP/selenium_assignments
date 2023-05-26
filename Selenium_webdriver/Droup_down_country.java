package Selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Droup_down_country {
        public static void main(String[] args) {
        	 System.setProperty("webdriver.chrome.driver","D:\\Chrome Driver\\chromedriver.exe");
     		 WebDriver driver = new ChromeDriver();
     		 driver.get("https://demo.guru99.com/test/newtours/register.php");
     		 
     		 WebElement droupdown = driver.findElement(By.name("country"));
     		 Select droupdonws = new Select(droupdown);
     		 droupdonws.selectByVisibleText("AUSTRALIA");
		}
}
