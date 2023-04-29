package assginment;

import java.util.Scanner;

public class p1 {
     public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a=");
		int a =sc.nextInt();
		System.out.println("Enter b=");
		int b =sc.nextInt();
		System.out.println("Enter c=");
		int c = sc.nextInt();
		
		if(a>b && a>c) {
			System.out.println("A is grater then B and c");
		}
		else if(b>a && b>c) {
			System.out.println("B is grater then a and c");
		}
        else if(c>a && c>b) {
        	System.out.println("C is grater then a and b");
        }
        	else {
        		System.out.println("Invalid Input");
        	}
        
		}
	}

