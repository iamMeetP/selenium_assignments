package assginment;

import java.awt.List;

public class third_ele_remove_arraylist {
     public static void main(String[] args) {
		List list =new Arraylist();
		list.add("Red");
		list.add("Green");
		list.add("blue");
		list.add("White");
		list.add("pink");
		System.out.println(list);
		list.remove(3);
		System.out.println(list);
	}
}
