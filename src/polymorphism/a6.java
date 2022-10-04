package polymorphism;                   //over riding   + type of argument
class nikhil{
	public void m1(int n) {
		System.out.println("from nikhil");
	}
}
public class a6 extends nikhil {
	public void m1(int p) {
		System.out.println("from a6");
	
	}

	public static void main(String[] args) {
		a6 a = new a6();
		a.m1(191099);
		

	}

}
