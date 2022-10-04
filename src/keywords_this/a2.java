package keywords_this;

public class a2 {                // for call method by this keyword
	
	void m1() {                      //method 1
		System.out.println("m1");
	}
	
	void m2() {                          //method 2
		
		
		this.m1();
		System.out.println("m2");
	}
	
	public static void main(String[] args) {
		
		a2 a = new a2();
		
		a.m2();
	}
}
