package a4_conditional_statements;

public class a1 {     //ladder if
	                                                              //a>b,a>c||b>c ||
	public static void main(String[] args) {
	int a=40;                 //a
	int b=40;                 //b
	int c=50;             //c                       a==b==c
	
	if(a>b) {
		System.out.println("a is greater than b");
	}
	else if(b>c) {
		System.out.println("b is greater than c");
	}
	else if(a>c) {
		System.out.println("a is greater than c");
	}
	else if(a==b && b==c && a==c) {
		System.out.println("all values are equal");
	}
	else  {
		System.out.println("c is greater than a and b");
	}
	}
}
