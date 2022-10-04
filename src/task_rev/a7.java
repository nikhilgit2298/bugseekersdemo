package task_rev;

public class a7 {  //reverse string

	public static void main(String[] args) {
		String n = "nikhil";
		String p="";    // 
		int d = n.length();
		for(int i=d-1;i>=0;i--) {
			p= p + n.charAt(i);
			
		}
		

		
		System.out.println(p);
	}

}
