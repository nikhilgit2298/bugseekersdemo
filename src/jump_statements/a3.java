package jump_statements;

public class a3 { //return = return to main method once its condition becomes true

	public static void main(String[] args) {
		boolean n=true;
		System.out.println("hello");		
		if(n) {
			return;			
		}		
		System.out.println("hi");
	}
}
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
// if in this program boolean n= false, then if block won't be executed and so return command also not executed
// so program will execute line 7 and line 11        = output will be "hello" and "hi".

//              and if           //

// if in this program boolean n= true, then if block will be executed and so return command will execute
//so program will execute line 7 only and will be jump to main method    = output will be "hello" only  






