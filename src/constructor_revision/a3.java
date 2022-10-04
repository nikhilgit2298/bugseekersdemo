package constructor_revision;

public class a3 {
	String name;
	int marks;
	
	a3(String name , int marks){
		this.name=name;
		this.marks=marks;
		
		System.out.println(this.name + ":-" + this.marks);		
	}

	public static void main(String[] args) {
		a3 a1 = new a3("nikhil",98);
		a3 a2 = new a3("pratiksha",99);

	}

}
