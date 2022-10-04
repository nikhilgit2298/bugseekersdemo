package abstraction;    //by abstract class methodology

abstract class bank{                      //abstract class
	abstract public void ROI();           //abstract method
	public void m1() {                    //concrete method + body
		System.out.println("m1");
	}}
class SBI extends bank{
	public void ROI() {
		System.out.println("sbi roi is 10%");
	}}	
class Saraswat extends bank{
	public void ROI() {
		System.out.println("saraswat roi is 9%");
	}	}
class HDFC extends bank{
	public void ROI() {
		System.out.println("HDFC roi is 8.5%");
	}}	
class ICICI extends bank{
	public void ROI() {
		System.out.println("ICICI roi is 11%");
	}}	
public class SwissBank extends bank {
	public void ROI() {	
		System.out.println("SwissBank roi is 1%");
			}	
		public static void main(String[] args) {   //can't create object of abstract class
		
		SwissBank  SwissBank = new SwissBank();  //child class variable = new child class();
		ICICI ICICI = new ICICI();
		HDFC HDFC = new HDFC();
		Saraswat Saraswat = new Saraswat();
		SBI sbi = new SBI();
		
		sbi.ROI();                //reference variable.method name
		Saraswat.ROI();
		HDFC.ROI();
		SwissBank.ROI();
		ICICI.ROI();
		}
}
