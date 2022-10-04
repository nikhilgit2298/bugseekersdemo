package keywords_this;

public class rev_3 {       // to call constructor
	
	rev_3(String p){                            //constructor 1
		System.out.println("nik");
	}
	rev_3(){                     //constructor 2
		this("bug seeker");
		System.out.println("nikhil");		
	}
	
	public static void main(String[] args) {
		rev_3  a = new rev_3();                  // by calling only constructor 2 we can call both constructors
		

	}

}
