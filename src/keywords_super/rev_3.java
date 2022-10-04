package keywords_super;   // to call constructor of parent class

class r3{
	
	r3(String p){                       // constructor 1 //type argumented constructor
		System.out.println("nikhil");
	}	
}
public class rev_3 extends r3 {
	
	rev_3(){                              //constructor 2 //non argumented constructor
		super("bug seeker");              
		
		System.out.println("nikhu");
	}

	public static void main(String[] args) {
		rev_3 p = new rev_3();
		

	}

}
