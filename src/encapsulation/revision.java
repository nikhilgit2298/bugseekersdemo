package encapsulation;       //encapsulation means wrapping variables and methods into single unit (class)

public class revision {
	private int rollno;      //data hiding by making variable private   here rollno is instance variable
	
	public void setrollno(int rollno) {//setter method(to manipulate data) with variable defined integer/string/other 
		this.rollno=rollno;		
	}
	
	public int getrollno(){       //getter method with return type integer   (return method to call data)
		return rollno;	          //return method  			
	}

	public static void main(String[] args) {
		revision a1 = new revision();
		a1.setrollno(101);                      //example = setting roll no for candidate with roll no a1=101
		System.out.println(a1.getrollno());     //get method to view data of candidate a1
		
		
		revision a2 = new revision();         
		a2.setrollno(102);                      //example = setting roll no for candidate with roll no a2=102
		System.out.println(a2.getrollno());     //get method to view data of candidate a2
	}

}
