package task;

public class Swap {   //swapping number with 3rd variable;

	public static void main(String[] args) {
		int a= 50;
		int b= 20;
		int t;
		
		t=a;       // sequence is important here   
		a=b;      //  row 10,11,12 here ;
		b=t;     //   we cannot interchange position 
		
		System.out.println("a" + a);
		System.out.println("b" + b);
	}
}
