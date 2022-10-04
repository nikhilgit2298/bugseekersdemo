package a3_methods;

public class a1 {
	static public void method1() {
		System.out.println("Hello bug seeker");
	}
	static public void method2() {
		System.out.println("Hi bug seeker");		
	}
	
	public static void main(String[] args) {
		a1 nik=new a1();
		nik.method1();
		nik.method2();
		a1.method2();
		
	}

}
