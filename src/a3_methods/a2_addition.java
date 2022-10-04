package a3_methods;

public class a2_addition {
	public void method1(double a, double b)
	{
				double c=a*b;
				double d= a+b;
		
		System.out.println("multiplication of this 2 no is= " + c);
		System.out.println("addition of this 2 no is= " + d);

	}
		
		public static void main(String[] args) {
			
			a2_addition main=new a2_addition();
			
			main.method1(100.1,20.1);
	}
		
		
		

}
