package assginment;

public class Multiple_catch_blocks {
       public static void main(String[] args) {
		  try {
			  int a[]= new int[5];
			  a[5]=30/0;
			  
		  }
		  catch(Arithmetic Exception e) {
			  System.out.println("Arithmetic Exception occure");
		  }
		  catch(ArrayIndexOutOfBound Exception e) {
			  System.out.println("ArrayIndexOutOfBound occures");
		  }
		  catch(Exception e) {
			  System.out.println("parent exception occures");
		  }
		      System.out.println("rest of the code");
	}
}
