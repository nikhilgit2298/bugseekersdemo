package task;

public class palindrome {

	public static void main(String[] args) {
		int a=121;
		int b=a;
		int rem;
		int rev=0;
		
		while(b!=0) {
		rem = b/10;       
		rev=rev*10+rem;   
		b=b/10;           
		}
		if(a==rev) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
		
		
		
		
		
		
		
	}
	
	
	

}
