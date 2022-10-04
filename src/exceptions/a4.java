package exceptions;

public class a4 {

	public static void main(String[] args) {
		try {
			String b="219276555";
			int num = Integer.parseInt(b);
			System.out.println(b);
			
		}
		catch(NumberFormatException ex)
	    {       
	        System.out.println("catch block executed..." + ex);	             
	    }
	     
	    finally
	    {
	        System.out.println("finally block executed");
	    }		

}
}