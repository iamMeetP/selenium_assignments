package Selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registergmail {
         public static void main(String[] args) {
        	 System.setProperty("webdriver.chrome.driver","D:\\Chrome Driver\\chromedriver.exe");
        	 WebDriver driver = new ChromeDriver();
        	 driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=SignUp");
        	 
        	 driver.findElement(By.name("firstName")).sendKeys("Meet");
        	 driver.findElement(By.name("lastName")).sendKeys("Patel");
        	 driver.findElement(By.name("Username")).sendKeys("pmv110319@gmail.com");
        	 driver.findElement(By.name("Passwd")).sendKeys("meet110319");
        	 driver.findElement(By.name("ConfirmPasswd")).sendKeys("meet110319");
        	 driver.findElement(By.xpath("//*[@id=\"view_container\"]/div/div/div[2]/div/div[1]/div/form/span/section/div/div/div[3]/div[3]/div/div[1]/div/div/div[1]/div/input"));
             driver.findElement(By.className("VfPpkd-vQzf8d")).click(); 	 
        	 
		}
         
         
         
         
}
