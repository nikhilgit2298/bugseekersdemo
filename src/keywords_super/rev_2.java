package keywords_super;             // to call method of parent class

class r2{
	void m1() {
		System.out.println("nik");
	}
}

public class rev_2 extends r2 {
	void m2() {
		super.m1();
		System.out.println("nikhil");
	}

	public static void main(String[] args) {
		rev_2  p = new rev_2();
		p.m2();// by calling method2,we get output of method1 & method2 as reference of method1 present in method2

	}

}
