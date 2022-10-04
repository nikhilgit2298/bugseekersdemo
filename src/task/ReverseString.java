package task;

public class ReverseString {

	public static void main(String[] args) {
		String n="nikhil";
		int p = n.length();    // to find total characters in string             
		String r="";
		
		for(int i=p-1 ; i>=0 ; i-- ) {
			
			r = r + n.charAt(i);        
		}
			System.out.println(r);
	}
}
