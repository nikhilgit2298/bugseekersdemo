package encapsulation;

public class a1 {
	private int rollno;         //data hiding   
	
	public void setrollno(int rollno) { //setter method to modify data
		this.rollno=rollno;             //local variable chi value instance variable la dili aapan
	}
	
	public int getrollno(){    //getter method here public void method (here void is integer so public int main()
	 	return rollno;                        //getter method to view data
	}
	
	public static void main(String[] args) {
		a1 a = new a1();
		a1 a2= new a1();
		a.setrollno(191099);                    //for modify the data
		System.out.println(a.getrollno());     //for viewing the data
		a2.setrollno(2298);
		System.out.println(a2.getrollno());
			

	}

}
