package abstraction;                                       // for hiding internal implementation

 abstract class fruit{                               //condition 1  //abstract or parent class
	abstract public void taste();                                   //abstract method
	 public void m1() {                                             //concrete method
		 System.out.println("m1");                                  //body for concrete method
	 }                                                   //now we need to override abstract method
 }
	 class mango extends fruit {                         //child extend parent
		 public void taste() {                           // for overriding-same method,argument
			 System.out.println("mitthoooooo");          // body given and overriding completes
		 }
	 }
     class apple extends fruit{
    	 public void taste() {
    		 System.out.println("mitthoo");
    	 }
     }
     class guava extends fruit{
    	 public void taste() {
    		 System.out.println("khattoo");
    	 }
     }
	 class strawberry extends fruit{
		 public void taste() {
			 System.out.println("khatoooooo");
		 }
	 }
 
 
public class by_class extends fruit {
	public void taste() {
		System.out.println("bechavvvv");
	}
	public static void main(String[] args) {
		by_class by_class=new by_class();
		by_class.taste();
		fruit apple = new apple();
		apple.taste();
		fruit mango = new mango();
		mango.taste();
	}}
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
// if in any class abstract method is present then it is necessary to declare class as abstract class
// vice versa may be or may not be
// method of child class must be stronger or equals to parent method
// example if parent method is default , then child method must be default or greater but can't be private
// public > protected > default > private










