package exceptions;

public class a1 {

	public static void main(String[] args) {
		try { int a=10;
		  int b=5;
		  int c;
		  c=a/b;
		  System.out.println(c);			
	}
	catch(Exception e) {
		System.out.println(e);
	}
	finally {
		System.out.println("bug seekers");
	}

	}

}
