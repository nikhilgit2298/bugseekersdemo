package access_modifier;

public class a1 {
	int n=2298;                         //default variable
	public String p = "nikhil";         //public variable
	private char d ='p';                //private variable
	protected boolean L=true;           //protected variable
	
	public static void main(String[] args) {
		a1 a = new a1();
		System.out.println(a.n);
		System.out.println(a.p);
		System.out.println(a.d);
		System.out.println(a.L);
	}
}
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//                                          scope will be
//default variable    =  within package              = inside and outside classes of same package
//public variable     =  within and outside package  = inside and outside classes of any package 
//private variable    =  within class                = only inside the class
//protected variable  =  within and outside package  = for outside package , create child class 