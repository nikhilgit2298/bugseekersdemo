package task;

public class Swap_1 {

	public static void main(String[] args) {
		
		int a=   10;
		int b=   20;
		
		a=a+b;  // after calculations now  a=30 , and previous value of b=20
		b=a-b;  // after calculations now b=10 ,  and previous value of a=30
		a=a-b;  // after calculations now a=20 ,  and previous value of b=10		
		
		System.out.println("a" + a);
		System.out.println("b" + b);

	}
}
