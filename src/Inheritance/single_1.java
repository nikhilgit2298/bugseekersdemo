package Inheritance;                           //single inheritance

class prt_1{                                 //parent class
	void m1() {
		System.out.println("i am m1");
	}
}

public class single_1 extends prt_1 {                         //child class 
	void m2() {
		System.out.println("i am m2");
	}

	public static void main(String[] args) {
		single_1 n = new single_1();                         //object creation of child class
		n.m1();                                       //can call method of parent class using variable of child class
		n.m2();
		

	}

}
