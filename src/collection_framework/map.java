package collection_framework;

import java.util.HashMap;
import java.util.Map;

public class map {

	public static void main(String[] args) {
		Map np = new HashMap();          //reference to key and value pair
		np.put(191099, "pratiksha");
		np.put(2298, "nikhil");
		np.put(230, "praniti");
		System.out.println(np.get(230));
		System.out.println(np.get(191099));
	}

}
