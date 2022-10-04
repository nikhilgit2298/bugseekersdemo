package String;
public class declaration {
	public static void main(String[] args) {
		String n="nikhil";
		System.out.println(n);        //declaration by literal
		
		String p = new String("nikhil");      //declaration by object
		System.out.println(p);
	}}
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
/*  string - >collection of character  , >non primitive data type   , >array of character   , >sequence of character
             >default value is null  , > string is a class which have already declared and predefined methods
     
   >>> object is a parent class of all classes
   
   >>> public final class string extends object implement charsequence , serilizable , comparible {
      == means string is final type of class which extends to parent class i.e. object and implements different 
                types of interfaces like charsequence , serilizable , comparible .
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
>>declaration of string has 2 types
   1)String literals  = store in String Constant Pool (SCP) , SCP is inside heap memory

   2)by object  = store in heap memory --pointed by reference variable
                = store in SCP         --pointed by JVM(JAVA VIRTUAL MACHINE)  










*/


