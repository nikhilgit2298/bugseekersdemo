package constructor_1;

public class a4 {
	String name;
	int marks;
	
	a4(String name , int marks){
		this.name=name;
		this.marks=marks;
		
		
		System.out.println(this.name + ":" + this.marks);

	}

	public static void main(String[] args) {
		a4 n = new a4("nikhil",98);
		a4 n1= new a4("neha",99);

	}

}
