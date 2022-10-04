package keywords_super;       // to call method of parent class

class b5{
	void m1() {
		System.out.println("m1");
	}	
}

public class a2 extends b5 {
	void m2() {
		super.m1();
		
		System.out.println("m2");
	}
	
	public static void main(String[] args) {
		a2 n = new a2();
		n.m2();

	}

}
