package a4_conditional_statements;

public class A1_1 {              //nasted if

	public static void main(String[] args) {
		int a=30;           //local variable           
    	int	b=40;
    	int c=30;
    	if(a>=b) {
    		System.out.println("a is greater than or equal to b");
    	     
    		if(a==b) {
    			System.out.println("a is equals b");
       	        		}  
    		if(a>b) {
    			System.out.println("a is greater than b");
       	        		}   	
    	}
    	else {
    		System.out.println("a is greater than c");
    	     
    		if(a==c) {
    			System.out.println("a is equals c");
       	        		}
    	
	}

}
}
