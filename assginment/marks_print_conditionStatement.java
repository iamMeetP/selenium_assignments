package assginment;

public class marks_print_conditionStatement {
	  int marks;
      System.out.println("enter marks :");
      marks = sc.nextInt();
      if(marks<35) {
      	System.out.println("fail");
      }
      else if(marks>=35 && marks<=50) {
         System.out.println("D class");
      }
      else if(marks>=51 && marks<=71) {
      	System.out.println("c class");
      }
      else if(marks>=71 && marks<=80) {
      	System.out.println("B class");
      }
      else if (marks>=81 && marks<=90) {
      	System.out.println("a class");
      }
      else if(marks>=91 && marks<=100) {
      	System.out.println("a+ class");
      }
      else {
      	System.out.println("invalid marks");
      	 }
}
