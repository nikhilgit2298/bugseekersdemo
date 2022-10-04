package looping_statement_revision;

import java.util.Scanner;

public class takevaluefromuser {              //scanner for integer input , import from java.util

	public static void main(String[] args) {
		System.out.println("enter first integer");
		Scanner s = new Scanner(System.in);   //here argument System.in is predefined by system so written as it is
		int t = s.nextInt();                                  //1st integer
		System.out.println("enter second integer");
		int u = s.nextInt();                                  //2nd integer
		
		int v;                                                //3rd integer defined 
		v=t+u;                                                //addition of 2 integer
		System.out.println("answer is " + v);

		

		
		

	}

}
