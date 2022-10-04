package keywords_super;           // reference to instance variable of parent class

class  r1{
	int n;
}

public class rev_1 extends r1{ 
	
	void m1(int n) {
		super.n=n;           //variable of parent class in relation with child class 
		System.out.println("nikhil");
	}
	

	public static void main(String[] args) {
		rev_1 p = new rev_1();
		p.m1(2298);            //calling m1 from child class and give integer mention in parent class
		System.out.println(p.n);
		
		
	}

}
