package Rangoli;
public class Drawing_4 {
	public static void main(String[] args) {
		for(int i=1;i<=7;i++) {
			for(int b=7;b>=i;b--) {
				System.out.print(" ");
			}
			for(int c=1;c<=i;c++) {
				System.out.print(" *");
			}
			System.out.println("");
		}
		for(int j=4;j<=9;j++) {
			for(int b=3;b<=j;b++) {
				System.out.print(" ");
			}
			for(int c=9;c>=j;c--) {
				System.out.print(" *");						
			}
			System.out.println("");
		}											
	}
}
