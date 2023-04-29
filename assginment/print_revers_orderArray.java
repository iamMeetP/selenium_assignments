package assginment;

public class print_revers_orderArray {
     public static void main(String[] args) {
		Integer[] intArray = {10,20,30,40,50};
		System.out.println("original array:");
			for(int i=0;i<intArray.length;i++)
				System.out.println(intArray[i]+"");
			System.out.println();
			System.out.println("original array is printed revers order");
			   for(int i=intArray.length-1;i>=0;i--)
				   System.out.println(intArray[i]+"");
	}
}
