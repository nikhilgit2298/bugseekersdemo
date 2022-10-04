package task;

public class maximum {

	public static void main(String[] args) {
		int []a= {4,3,2,1,5,55,60}; // make a list of input in array format
		int max = a[0]; //choose random value from list as maximum and then give condition here index no 0=="4"
		for(int i=1;i<a.length;i++) {  //compare first value i.e a[0] with other inputs
			if(a[i]>max) {                 //if other input max than a[0] then if loop executes
				max = a[i];            // maximum value will assign to specific a[i]
			}	
			
		}
		
		System.out.println("max value is " + max);  // by comparing max will be print
	
	}

}
