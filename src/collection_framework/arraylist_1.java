package collection_framework;

import java.util.ArrayList;
import java.util.List;

public class arraylist_1 {

	public static void main(String[] args) {
		List n = new ArrayList();    //handle by index  , comes from interface list where ArrayList is a class   
		n.add("n");         //add data in array
		n.add("i");         //add data in array
		n.add("k");         //add data in array
		n.add("h");         //add data in array
		n.add("i");         //add data in array   //allow duplicate values
		n.add("l");         //add data in array
		
		System.out.println(n);               //array output
		System.out.println(n.size());        //determine size of an array
		System.out.println(n.get(0));        //get or fetch specific value from from array (index starts from 0 )
		System.out.println(n.contains("l"));//check given element present in array or not
		n.remove(2);                        //remove element in array based on its index number(starts from 0)
		System.out.println(n);              //updated array
		n.clear();                          //clear the array
		System.out.println(n);              //updated array after clear command, its empty now
		System.out.println(n.isEmpty());    //check whether array is empty or not
		

	}

}
