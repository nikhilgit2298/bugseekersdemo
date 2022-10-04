package access_modifier;

public class a2 {

	public static void main(String[] args) {
		a1 k = new a1();                            // object for class a1 /package access_modifier
		
		System.out.println(k.n);                   //default variable
		System.out.println(k.p);                   //public variable
		System.out.println(k.L);                   //protected variable
		
	}

}
