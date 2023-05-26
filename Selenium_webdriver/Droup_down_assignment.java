package Selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Droup_down_assignment {
         public static void main(String[] args) {
        	 System.setProperty("webdriver.chrome.driver","D:\\Chrome Driver\\chromedriver.exe");
     		 WebDriver driver = new ChromeDriver();
     		 driver.get("http://the-internet.herokuapp.com/dropdown");
     		 
     		 
     		 WebElement dropdown = driver.findElement(By.id("dropdown"));
     		 Select dropdowns = new Select(dropdown);
     		 dropdowns.selectByVisibleText("Option 2");
		}
}
	