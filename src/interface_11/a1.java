package interface_11;              // abstraction by interface

interface livingthing {                          // like class  class_name  >> interface interface_name
	abstract void action();                    // abstract method, concrete method can be added and if we add 
	                                           //concrete method depend on qty , we can achieve 0-100% abstraction   
}
class elephant implements livingthing{        // like extends  , implements
	public void action() {
		System.out.println("can walk");
	}}
class shark implements livingthing{
	public void action() {
		System.out.println("can swim");
	}}
class snake implements livingthing{
	public void action() {
		System.out.println("can crawl");
	}}
public class a1 implements livingthing {
	public void action() {
		System.out.println("can fly");
	}
	public static void main(String[] args) {
		livingthing elephant = new elephant();
		livingthing shark = new shark();
		livingthing snake = new snake();
		livingthing a1 = new a1();
		elephant.action();
		shark.action();
		snake.action();
		a1.action();
		}}
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//if one class and one interface then ----->implements
// and if both class and both interface then ------>extends








