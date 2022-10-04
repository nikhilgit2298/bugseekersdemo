package task_rev;

public class a6 { //swap numbers without 3rd variable

	public static void main(String[] args) {
		int a=100;
		int b=220;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("new value of a=" + a);
		System.out.println("new value of b=" + b);

	}

}
