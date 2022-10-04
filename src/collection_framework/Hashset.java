package collection_framework;
import java.util.HashSet;    // not used in automation so dont take seriously     
import java.util.Set;          //duplicate values not allowed
public class Hashset {

	public static void main(String[] args) {
		Set p = new HashSet();
			
		p.add("p");
		p.add("i");
		p.add("n");
		p.add("s");
		p.add("m");
	
		System.out.println(p);
		System.out.println(p.contains("m"));   // to check value present in array
	    p.remove("m");
	    System.out.println(p);                //true output
	    System.out.println(p.isEmpty());      // to check array whether empty or not
	    System.out.println(p.size());
	}
}

