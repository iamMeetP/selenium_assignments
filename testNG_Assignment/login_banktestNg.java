package testNG_Assignment;

import org.testng.annotations.Test;

public class login_banktestNg {
	   @Test(priority = 2,groups = "users")
       public void login() {
    	   System.out.println("login users");
       }
	   @Test(priority = 1)
	   public void register() {
		   System.out.println("register users");
	   }
}
