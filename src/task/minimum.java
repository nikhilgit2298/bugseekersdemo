package task;

public class minimum {

	public static void main(String[] args) {
		int a[]= {2555555,611,5666,4444444,55225,1555553};  //list of input 
		int min = a[0];    //random select value is minimum here first input i.e. a[0]
		for(int i=1;i<a.length;i++) {    //condition for comparison of first input with other
			
			if(a[i]<min) {     //if condition true then minimum value reassigned
				
				min = a[i];      // minimum value
			}
			}
		System.out.println("min value is " + min);    //output
	}

}
