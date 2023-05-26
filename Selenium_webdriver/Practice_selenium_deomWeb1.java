package Selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_selenium_deomWeb1 {
       public static void main(String[] args) {
    	System.setProperty("webdriver.chrome.driver","D:\\Chrome Driver\\chromedriver.exe");
   		WebDriver driver = new ChromeDriver();
   		driver.get("https://phptravels.com/demo/");
   		
   		
   		 WebElement fname = driver.findElement(By.name("first_name"));
   		 fname.sendKeys("Meet");
   		 WebElement lname = driver.findElement(By.name("last_name"));
   		 lname.sendKeys("Patel");
   		 WebElement bname = driver.findElement(By.name("business_name"));
   		 bname.sendKeys("Uma Solar");
   	     WebElement email =driver.findElement(By.name("email"));
   	     email.sendKeys("pmv110319@gmail.com");
   		 WebElement num1 = driver.findElement(By.id("numb1"));
   		 System.out.println(num1.getText());
   	     String numm1 = num1.getText();
   	      WebElement num2 = driver.findElement(By.id("numb2"));
		 System.out.println(num2.getText());
	     String numm2 = num2.getText();
	     int number1 = Integer.parseInt(numm1);
	     int number2 = Integer.parseInt(numm2);
	     WebElement res = driver.findElement(By.id("number"));
	     int newnum = number1+number2;
	     res.sendKeys(String.valueOf(newnum));
   	     
   	     
   	     
   	     
   		driver.findElement(By.id("demo")).click();
	}     
	
}	

