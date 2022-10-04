package conditional_statements;

public class a5 {         //nested if

	public static void main(String[] args) {
		int a=100;
		int b=20;
		int c=300;
		
		if(a>b) {
			System.out.println("a grater than b");
			if(a>c) {
				System.out.println("a grater than c");
			}
			else {
				System.out.println("a less than c");
			}
		}
		else {
			System.out.println("a less than b");

		}
	}

}
