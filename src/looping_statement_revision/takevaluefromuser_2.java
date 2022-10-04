package looping_statement_revision;

import java.util.Scanner;                    

public class takevaluefromuser_2 {                  //use of string

	public static void main(String[] args) {
		System.out.println("enter first name");
		Scanner a= new Scanner(System.in);
		String nikhil = a.next().toString();
		System.out.println("nikhil");
		String d = a.next().toString();
		System.out.println(" dongarwal");
		String l=nikhil.concat(d);
		System.out.println( l);
		
		

	}

}
