package collection_framework;
import java.util.ArrayList;
import java.util.List;
public class arraylist {                 //list followed by index

	public static void main(String[] args) {
		List n = new  ArrayList();          //A and L of ArrayList must be capital to import

		n.add(191099);
		n.add(2298);
		n.add("nitiksha");
		n.add("praniti");
		n.add("nisha");
		n.add("katiksha");
		
		System.out.println(n);
		System.out.println(n.size());
		n.remove(5);
		System.out.println(n);
		System.out.println(n.get(0));
		System.out.println(n.contains("nisha"));
		
		//   note = to clear list or all data in array use   = n.clear();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
