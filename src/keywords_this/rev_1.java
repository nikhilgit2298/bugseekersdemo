package keywords_this;

public class rev_1 {  //for referring instance variable
	
	int n;              //instance variable
	
	void m1(int n) {
		this.n=n;            //this.instance variable = local variable
		System.out.println("m1");
	}

	public static void main(String[] args) {
		rev_1 p = new rev_1();
		p.m1(100);
		
		

	}

}
