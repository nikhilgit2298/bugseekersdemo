package access_modifier_1;

import access_modifier.a1;

public class b1 extends a1 {             //child class creation

	public static void main(String[] args) {
		
	    b1 z = new b1();                     //object creation of child class
    	System.out.println(z.L);             //protected variable
		System.out.println(z.p);             //public variable can be call without child creation
		

	}

}
