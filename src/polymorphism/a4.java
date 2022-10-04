package polymorphism;           //over riding   + number of argument

class nik{
	public void m1() {
			System.out.println("from nik");
		}
	}
public class a4 extends nik {
	public void m1() {
		System.out.println("from a4");
	}
	public static void main(String[] args) {
		a4 a = new a4();
		a.m1();
	}
}
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
// to achieve over riding
// condition 1) same method name
// condition 2) different class
// condition 3) same argument --3.1)no of argument (3.2)sequence of argument (3.3)types of argument
// condition 4) IS a relationship i.e. extends





