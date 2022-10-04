package Inheritance;
class c22 {                                                //parent class
	void m1() {
		System.out.println("i am m1");
	}
}
class hierachy_2 extends c22 {                  //child 1
	void m2() {
		System.out.println("i am m2");
	}
}

public class hierachy_1 extends c22 {              //child 2
	void m3() {
		System.out.println("i am m3");
	}

	public static void main(String[] args) {
		hierachy_2 h1 = new hierachy_2();
		hierachy_1 h2 = new hierachy_1();
		h1.m1();
		h1.m2();
		h2.m1();
		h2.m3();

		
		

	}

}
