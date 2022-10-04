package constructor_1;

public class a3 {
	String name;
	double marks;
	
	a3 (String name , double marks){
		this.name=name;
		this.marks=marks;
		System.out.println(this.name + ":-"  + this.marks);
		
	}

	public static void main(String[] args) {
		a3 n = new a3("nikhu",98);
		a3 p = new a3("pratu",99);
		a3 R = new a3("avi",100);
		a3 na = new a3("nama", 99.8);
		
		
		
		
		
		

	}

}
