package Rangoli;

public class drawing_1 {

	public static void main(String[] args) {
		for(int i=1;i<=7;i++) {
			for(int b=6;b>=i;b--) {
				System.out.print(" ");
			}
			
			for(int c=1;c<=i;c++) {
				System.out.print(" *");
			}
			
			System.out.println("");
		}			
		
	}

}
