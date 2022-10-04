package task_rev;

public class a4 {              //minimum value

	public static void main(String[] args) {
		int [] a = {20,40,5,-10,15,25,35};
		int min = a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]< min) {
				min = a[i];
			}
		}
		System.out.println(min);

	}

}
