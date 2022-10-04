package keywords_this;

public class rev_2 {         //to call method
	
	void m1(){                    //method 1
		System.out.println("m1");
	}
	void m2() {                        //method 2
		this.m1();                     //reference to method 1
		System.out.println("m2");
	}

	public static void main(String[] args) {
		rev_2 n =new rev_2();
		n.m2(); // by calling method2,we get output of method1 & method2 as reference of method1 present in method2
		

	}

}
