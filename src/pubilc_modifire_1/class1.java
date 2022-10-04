package pubilc_modifire_1;

public class class1 {
	public String n= "nikhil";           

	public static void main(String[] args) {
		class1 c = new class1();
		System.out.println(c.n);
		
	}
}


//note for private = if we make element(here variable) as private (private String n="nikhil"); we can acces this variable 
//      only in the class (here class 1),
//      if we try to call this private variable outside class and outside package also it will show error
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

// note for default =if we make element(here variable) as default(String n="nikhil"); we can acces this variable
//                   inside package only i.e. inside class and outside class
//                    if we try to call this default variable outside outside package it will show error