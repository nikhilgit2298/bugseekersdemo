package polymorphism;           // overloading method  + no of argument different

public class a2 {
	
	public void m1(String p) {
		System.out.println("m1");
	}
	
	public void m1(String p , String n) {
		System.out.println("m1_2");
	}
	
	public static void main(String[] args) {
	
		a2 a = new a2();
		a.m1("pratiksha");
		a.m1("pratiksha", "niikhil");

	}

}
