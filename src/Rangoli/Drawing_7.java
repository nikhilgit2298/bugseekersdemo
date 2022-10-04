package Rangoli;

public class Drawing_7 {

	public static void main(String[] args) {
		for(int i=1;i<=7;i++) {
			for(int b=6;b>=i;b--) {
				System.out.print(" ");       //space
			}
			for(int c=1;c<=1;c++) {
				System.out.print(" *");                   //star
			}
			for(int d=6;d>=i;d--) {
				System.out.print(" ");       //space
			}
			for(int e=1;e<=1;e++) {
				System.out.print(" *");                   //star
			}
			System.out.println("");
		}	
	}
}
