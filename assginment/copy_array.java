package assginment;

public class copy_array {
      int arr[ ] = {5,4,3,2,1};
      int copyarr[]= new int[arr.length];
        for(int i=0; i<arr.length;i++)
        	copyarr[i] = arr[i];
        System.out.println("The original array is :");
         for(int i=0;i<arr.length;i++)
        	 Sytem.out.println(arr[i]+"");
             System.out.println("Conntect of the copied array is");
         for(int i =0; i<copyarr.length;i++)
        	 System.out.println(copyarr[i]+"");
}
}
