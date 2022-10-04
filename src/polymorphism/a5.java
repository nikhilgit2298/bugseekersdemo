package polymorphism;     //overriding   + sequence of argument

class nikhu{
	public void m1(String n , int p) {
		System.out.println("from nik");
	}
}
public class a5 extends nikhu{
	public void m1(String p , int n) {
		System.out.println("from a5");
	}
	public static void main(String[] args) {
	 a5 a = new a5();
	 
	 a.m1("pratiksha", 2298);
		

	}

}
