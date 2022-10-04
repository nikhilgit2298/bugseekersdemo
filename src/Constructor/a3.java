package Constructor;

public class a3 {
	String a;
	int b;               

	a3(String a,int b){                                  //constructor
		System.out.println(a + ":" + b);
	}
		
	public static void main(String[] args) {
		a3 x = new a3("pratik",50);
		a3 y = new a3("nik",50);
		a3 z = new a3("avinash",50); 
		
	}

}
