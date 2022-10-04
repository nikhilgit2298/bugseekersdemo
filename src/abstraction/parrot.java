package abstraction;                    //abstraction by class
abstract class livingthings{                           //abstract class defined
	abstract public void action();                     //abstract method (which don't have body)
	public void a1() {                                 //concrete method (which have body)                         
		System.out.println("a1");                     
	}}
class elephant extends livingthings{
	public void action() {
		System.out.println("walk");
	}}
class shark extends livingthings{                              
	public void action() {
		System.out.println("swim");
	}}
class snake extends livingthings{
	public void action() {
		System.out.println("crawl");
	}}
public class parrot extends livingthings {
	public void action() {
		System.out.println("fly");
	}
	public static void main(String[] args) {
		livingthings elephant = new elephant(); // we cannot create object of abstract class but we can give reference of abstract class 
		shark shark = new shark();  // we can get same output of elephant by elephant elephant = new elephant(); 
		snake snake = new snake();                                    
		parrot parrot = new parrot();
	
		
		elephant.action();
		shark.action();
		snake.action();
		parrot.action();
			}}
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
// in line 24 , we can also write elephant ref_variable = new elephant(); 




