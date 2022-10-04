package keywords_super;              // call constructor of parent class

class a6{            //parent class
	
	a6(int d){                   //constructor
		System.out.println("a6");
	}	
}
public class a3 extends a6 {          //child class   
	
	a3(){                  //constructor too child class
		super(10);
		System.out.println("a3");
	}
	
	public static void main(String[] args) {
		a3 n = new a3();
		
		
		

	}

}
