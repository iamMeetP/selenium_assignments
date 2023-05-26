package Selenium_webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windows_alerts_popups {
           public static void main(String[] args) {
        	   System.setProperty("webdriver.chrome.driver","D:\\Chrome Driver\\chromedriver.exe");
          		WebDriver driver = new ChromeDriver();
          		driver.get("https://demo.guru99.com/popup.php");
          		
          		driver.findElement(By.linkText("Click Here")).click();
          		
          		    String mainWindow = driver.getWindowHandle();
          		    System.out.println(mainWindow);
          		
          		    Set<String> allwindows =driver.getWindowHandles();
          		     for(String s :allwindows) {
          		    	 if(!s.equals(mainWindow)) {
          		    		 driver.switchTo().window(s);
          		    	 }
          		     }
          		
          		
          		
          		String email = "pmv110319@gmail.com";
          		driver.findElement(By.name("emailid")).sendKeys(email);
          		driver.findElement(By.name("btnLogin")).click();
          		driver.close();
          		driver.quit();
		}
}
