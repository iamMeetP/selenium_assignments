package testNG_Assignment;

import org.testng.annotations.Test;

public class ATM_usertestNG {
	   @Test
       public void cashwithdraw() {
    	   System.out.println("uesrs cashwithdraw");
       }
	   @Test(groups = "users")
	   public void cashdebit() {
		   System.out.println("uesrs cashdebit");
	   }
	   @Test
	   public void checkbalance() {
		   System.out.println("users checked balance");
	   }
}
