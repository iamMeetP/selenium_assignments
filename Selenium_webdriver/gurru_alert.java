package Selenium_webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gurru_alert {
        public static void main(String[] args) {
        	 System.setProperty("webdriver.chrome.driver","D:\\Chrome Driver\\chromedriver.exe");
     		 WebDriver driver = new ChromeDriver();
     		 driver.get("https://demo.guru99.com/test/delete_customer.php");
     		 
     		 driver.findElement(By.name("cusid")).sendKeys("MeetP");
     		 driver.findElement(By.name("submit")).click();
     		 
     		 WebElement cancelbtn = driver.findElement(By.name("cusid"));
     		 cancelbtn.click();
     		 Alert cancelAlert = driver.switchTo().alert();
     		 System.out.println(cancelAlert.getText());
     		 cancelAlert.dismiss();
		}
}
