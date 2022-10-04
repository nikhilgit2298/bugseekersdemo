package Inheritance;
class sonu {                   // rtype nahi
	void nik() {
		System.out.println("kon hai ye bandi?");
	}
}
class nikhu extends sonu{
	void pratiksha() {
		System.out.println("pratiksha ");
	}
}

public class multi extends nikhu {
	void m3() {
		System.out.println("who is sonu?");
	}

	public static void main(String[] args) {
		multi n = new multi();        //by creating object for child ,able to call parent and his parent too
		n.m3();
		n.pratiksha();       //parent  father
		n.nik();               //parent parent grand father
			
	}

}
