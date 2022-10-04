package interface_1;
interface bank{              //interface only abstract method present
	void ROI();             //method
	}
class HDFC implements bank {          //implements keyword
	public void ROI() {
		System.out.println("ROI of HDFC is 6 %");
	}}
class SBI implements bank {
		public void ROI() {
			System.out.println("ROI of SBI is 8 %");
		}}
class AXIS implements bank {
			public void ROI() {
				System.out.println("ROI of AXIS is 10 %");
			}}
public class SwissBank_1  implements bank {
	public void ROI() {
		System.out.println("ROI of SwissBank is 4 %");
	}
	public static void main(String[] args) {
		SwissBank_1 SB = new SwissBank_1();
		SBI S = new SBI();
		AXIS A = new AXIS();
		HDFC H = new HDFC();
		
		S.ROI();
		SB.ROI();
		A.ROI();
		H.ROI();
	}
}
