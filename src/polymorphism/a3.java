package polymorphism;        // overloading   +   sequence of argument is different

public class a3 {
	
	public void m1(int n , String p) {
		System.out.println("m1");
	}
	

	public void m1(String n , int p) {
		System.out.println("m1_2");
	}
	
	public static void main(String[] args) {
	a3 a = new a3();
	a.m1(2298, "pratiksha");
	a.m1("nikhil", 191099);

	}

}
