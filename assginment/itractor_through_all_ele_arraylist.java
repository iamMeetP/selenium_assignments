package assginment;

import java.awt.List;

public class itractor_through_all_ele_arraylist {
	public static void main(String[] args) {
		List list = new arraylist();
		list.add("red");
		list.add("white");
		list.add("pink");
		list.add("black");
		list.add("yellow");
		System.out.println(list);
		Itractor itr = list.itractor();
		while(itr.hashnext()) {
			System.out.println(itr.next());
		}
		
	}

}
