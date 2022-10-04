package conditional_statements;

public class a4 {        //ladder if

	public static void main(String[] args) {
		int a=100;
		int b=100;
		int c=100;
		
		if(a>b) {
			System.out.println("a greater than b");
		}
		else if(b>c) {
			System.out.println("b greater than c");
		}
		else if(a>c) {
			System.out.println("a greater than c");
		}
		else if(a==b && b==c && a==c) {
			System.out.println("a , b, c are equal");
		}
		else {
			System.out.println("c greater than a and b");

		}
		

	}

}
