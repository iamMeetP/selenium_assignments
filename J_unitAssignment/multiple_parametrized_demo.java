package J_unitAssignment;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import JUnit_frame.Addition;

public class multiple_parametrized_demo {
	@RunWith(Parameterized.class)
	public class J_003_ParametrizedTest {
	     int a;
	     int b;
	     int res;
	     
	     
	     public J_003_ParametrizedTest(int a, int b, int res) {
			super();
			this.a = a;
			this.b = b;
			this.res = res;
		}


		@Test
	     public void testAddition() {
	    	 Addition aa = new Addition();
	    	 int actual = aa.add(a, b);
	    	 int expected = res;
	    	 assertEquals(expected, actual);
	     }
		
		@Parameters
		public static List<Object[]> getData(){
			
			Object obj[][] = new Object[3][3];
			
			obj[0][0] = 10;
			obj[0][1 ]= 20;
			obj[0][2 ]= 30;
			

			obj[1][0] = 10;
			obj[1][1 ]= 50;
			obj[1][2 ]= 30;
				

			obj[2][0] = 10;
			obj[2][1 ]= 20;
			obj[2][2 ]= 30;
				
			return Arrays.asList(obj);
				
			
			
			
		}
}
