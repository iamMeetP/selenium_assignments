package J_unitAssignment;

import java.util.Arrays;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_process_facebook {
	@RunWith(Parameterized.class)
	public class J_004_LoginTest {
	    
		String email;
		String password;
		
		
		
		
		public J_004_LoginTest(String email, String password) {
			super();
			this.email = email;
			this.password = password;
		}
		static WebDriver driver;
	    @BeforeClass
	    public static void OpenBrowser() {
	    	System.setProperty("webdriver.chrome.driver","D:\\Chrome Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
	    }


		@Test
		public void testLogin() {
			driver.findElement(By.id("email"));
			emailEle.clear();
			emailEle.sendkeys(email);
			driver.findElement(By.id("pass"));
			passele.clear();
			passele.sendkeys(password);
			
		}
		@Parameters
		public static List<Object[]> passData() {
			Object o[][] = new Object[4][2];
			
			o[0][0]= "invalidemail@gmail.com";
			o[0][1] = "invalidpass";
			
			o[1][0]= "invalidemail@gmail.com";
			o[1][1] = "validpass";
			
			o[2][0]= "validemail@gmail.com";
			o[2][1] = "invalidpass";
			
			o[3][0]= "validemail@gmail.com";
			o[3][1] = "validpass";
			
			return Arrays.asList(o);
			
		}
		
	}

}
