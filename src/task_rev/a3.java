package task_rev;

public class a3 {  //maximum value

	public static void main(String[] args) {
		int []a= {8,20,30,40,25,15};          
		int max = a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max = a[i];
				
			}
		
		}
		System.out.println(max);	

	}

}
