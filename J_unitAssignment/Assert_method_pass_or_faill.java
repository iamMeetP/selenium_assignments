package J_unitAssignment;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.junit.Test;

import JUnit_frame.Addition;

public class Assert_method_pass_or_faill {
       @Test
	   public void test() {
		   Addition a = new Addition();
		   int actual = a.add(10, 20);
		   int expected = 40;
		 //  assertFalse(false);
		   assertTrue(false);
	   }
}
