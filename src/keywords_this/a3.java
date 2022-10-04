package keywords_this;

public class a3 {                    //to call current class constructor
	
	a3(int p){                             //constructor 1
		System.out.println("hi");
	}
	
	a3(){                                  //constructor 2
		this(10);                            // to call constructor 1
		System.out.println("hello");            
	}
	public static void main(String[] args) {
		a3 a = new a3();
		
	}

}
