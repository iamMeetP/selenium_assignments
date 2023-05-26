package Selenium_webdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Droup_down {
         public static void main(String[] args) {
        	 System.setProperty("webdriver.chrome.driver","D:\\Chrome Driver\\chromedriver.exe");
        	 WebDriver driver = new ChromeDriver();
        	 driver.get("https://www.facebook.com/");
        	 
        	 driver.findElement(By.linkText("Create new account")).click();
        	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        	 driver.findElement(By.name("firstname")).sendKeys("Selenium");
        	 driver.findElement(By.name("lastname")).sendKeys("Java");
        	 driver.findElement(By.name("reg_email__")).sendKeys("7096512010");
        	 driver.findElement(By.name("reg_passwd__")).sendKeys("1546454546");
        	 
        	 
        	 WebElement day = driver.findElement(By.id("day"));
        	 Select days = new Select(day);
        	 days.selectByVisibleText("21");
        	 
        	 WebElement month = driver.findElement(By.id("month"));
        	 Select months = new Select(month);
        	 months.selectByVisibleText("Jan");
        	 
        	 WebElement year = driver.findElement(By.id("year"));
        	 Select years = new Select(year);
        	 years.selectByVisibleText("2019");
		}
         
         
         
}
