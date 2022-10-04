package Inheritance;
class c1{
	void m1() {
		System.out.println("i am m1");
	}
}
class c2 extends c1{
	void m2() {
		System.out.println("i am m2 ");
	}
}

public class multi_1 extends c2 {
	void m3() {
		System.out.println("i am m3");
	}

		public static void main(String[] args) {
			multi_1 m = new multi_1();
			m.m1();
			m.m2();
			m.m3();

	}

}
