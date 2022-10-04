package collection_framework;

import java.util.HashMap;
import java.util.Map;

public class map_1 {

	public static void main(String[] args) {
		Map fruit = new HashMap();
		fruit.put(100, "apple");           //key value pair always          key=position 1  , value=position 2
		fruit.put(500, "mango");           //key value pair always
		fruit.put(300, "strawberry");      //key value pair always
		fruit.put(250, "peach");           //key value pair always
		fruit.put("guava", 80);            //key value pair always
		System.out.println(fruit.get(300));          //put key to get output as value
		System.out.println(fruit.get("guava"));      //put key to get output as value
	

	}

}
