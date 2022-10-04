package keywords_this;

public class a1 {     // for referring instance variable
	
	
	int a;                    //instance variable
	
	void m1(int a) {
		this.a=a;                    //this.instance = local
		System.out.println("m1");
		
		
	}

	public static void main(String[] args) {
		a1 a = new a1();
		a.m1(100);

	}

}
