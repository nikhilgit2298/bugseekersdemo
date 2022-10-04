package Inheritance;
class m1{
	void a() {
		System.out.println("parent");
	}
}
class m2 extends m1{
	void b() {
		System.out.println("child_1");
	}
}
public class hierachy extends m1{
	void c() {
					System.out.println("child_2");			
		}
	
 public static void main(String[] args) {
	 m2 x=new m2();
	 hierachy y = new hierachy();
	 x.b();
	 x.a();
	 y.c();
	 y.a();
	 
		

	}

}
