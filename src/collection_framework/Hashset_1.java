package collection_framework;

import java.util.HashSet;
import java.util.Set;

public class Hashset_1 {

	public static void main(String[] args) {
		Set n = new HashSet(); // not handle by index , comes from interface set where HashSet is a class
		n.add("n");                                     //add data in array
		n.add("i");                                     //add data in array
		n.add("k");                                     //add data in array
		n.add("h");                                     //add data in array
		n.add("i");                                     //add data in array        //not allow duplicate value
		n.add("l");                                     //add data in array
		System.out.println(n);                          //not allow duplicate value here "i"
		System.out.println(n.size());                   //determine size of an array
		System.out.println(n.isEmpty());                //check whether array is empty or not
		n.remove("k");                                  //remove specific element , not by index , direct put value
		System.out.println(n);                          //updated array
		System.out.println(n.contains("i"));            //check given element present in array or not
		n.clear();                                      //clear the array
		System.out.println(n);                          //updated array after clear command, its empty now
		
	}

}
