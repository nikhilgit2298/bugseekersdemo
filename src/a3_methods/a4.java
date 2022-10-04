package a3_methods;

public class a4 {
	public void m1(int a,int b) {
		
		
		int c=a+b;
		int d=a-b;
		int e=a*b;
		int f=a/b;
		int g=a%b;       // it will show you reminder
		
		System.out.println("multiplication of this 2 no is= " + e);
		System.out.println("addition of this 2 no is= " + c);
		System.out.println("subtraction of this 2 no is= " + d);
		System.out.println("dividation of this 2 no is= " + f);
		System.out.println("mod of this 2 no is= " + g);

	}
	public static void main(String[] args) {
		a4 n=new a4();
		n.m1(10, 2);
		
		

	}
}
