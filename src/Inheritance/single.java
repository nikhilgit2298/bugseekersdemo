package Inheritance;

class pratiksha{           //parent class
	void instaboy() {
		System.out.println("kon hai ye banda?");
	}
	}

public class single extends pratiksha{      //child name single
	void like() {
		System.out.println("kya wo bhi like karta hai kya?");
	}
	
	public static void main(String[] args) {  
		single BF=new single();      //object creation of child class + BF is variable
		BF.instaboy();
		BF.like();
		
		

	}   //mi child class cha object banvun parent class chya method la bolavu shakto	 	

}
