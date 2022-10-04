package polymorphism;              //overloading method   +   type of argument

public class a1 {                                          
	
	public void  m1() {
		System.out.println("m1");
	}	
	public void m1(int b) {
		System.out.println("m1_2");
	}
	public static void main(String[] args) {
		a1 a = new a1();
		a.m1();
		a.m1(10);		
	}
}
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//       for overloading 3 conditions need to be satisfied
//       1)same class  2)same method name 
//       3)Argument different  --3.1)type of argument
//                             --3.2)sequence of argument
//                             --3.3)no of argument



