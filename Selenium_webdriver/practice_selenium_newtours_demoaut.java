package Selenium_webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice_selenium_newtours_demoaut {
         public static void main(String[] args) {
        	 System.setProperty("webdriver.chrome.driver","D:\\Chrome Driver\\chromedriver.exe");
        	 WebDriver driver = new ChromeDriver();
        	 driver.get("https://www.indiainfoline.com/business-partners/lp/Franchise_Campaign_1.html?utm_source=google&utm_medium=cpc&utm_campaign=FAN_SubBroker_Top-Core_Exact_All_Search_Google_India&campaignid=12240274706&adgroupid=117501550459&device=c&keyword=demo%20stock%20trading%20platform&creative=528820016598&matchtype=b&placements={placements}&network=s&Property_Address={Property_Address}&gclid=EAIaIQobChMI8NC95NDs_gIVfJlmAh1jlABNEAAYAyAAEgJ58PD_BwE");
		
              driver.findElement(By.name("name")).sendKeys("Meet Patel");
              driver.findElement(By.name("mobile")).sendKeys("7096512010");
              driver.findElement(By.name("email")).sendKeys("pmv110319@gmail.com");
              driver.findElement(By.name("city")).sendKeys("Ahmedabad");
              driver.findElement(By.name("btnSubmit")).click();
              
         }
         
}
