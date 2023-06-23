package testNG_Assignment;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class gmail_logintest {
	
	     static WebDriver driver;
	     @BeforeSuite
         public void setup() {
	    	 String url = ("https://www.gmail.com");
	    	 System.setProperty("webdriver.chrome.driver","D:\\Chrome Driver\\chromedriver.exe");
     		 WebDriver driver = new ChromeDriver();
     		 driver.get(url);
     		 driver.manage().window().maximize();
     		 
         }
	     @Test
	     public void login() {
	    	 driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("pmv110319@gmail.com");
	    	 driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
	    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    	 driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("12345");
	    	 driver.findElement(By.xpath("//div[@id='passwordNext]")).click();
	     }
	     @AfterSuite
	     public void quit() {
	    	 driver.quit();
	     }
}
