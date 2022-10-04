package a2_variables;

public class a1 {
	static int a=10;   //static variable
	 int c=30;         //instance variable
	boolean p= true;
	String n="nikhil";
	
	public void m1() {
		int b=20;                //local variable
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		a1 xyz=new a1();  
		
		System.out.println(xyz.n);  //outside method,inside class
		xyz.m1();   //method m1 called here
		/*System.out.println();
		System.out.println();  */
		
	}

}
