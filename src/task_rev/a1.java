package task_rev;

public class a1 {

	public static void main(String[] args) {
		int a=0;     //initialize first 2 values of fibonnaci i.e. 0 and 1
		int b=1;
		int c;
		for(int i=0;i<=8;i++) {                 //series upto which you want fibonnaci output 
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
	}

}
