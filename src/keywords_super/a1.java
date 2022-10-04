package keywords_super;
                                 //reference to instance variable of parent class

class a4{                             //parent class
	int p ;
}

public class a1 extends a4{                        //child class a1
	void m1(int p) {
		super.p=p;             //variable of parent class in relation with child class
		System.out.println("hello");
	}

	public static void main(String[] args) {
		a1 n = new a1();
		n.m1(200);
		System.out.println(n.p);

	}

}
