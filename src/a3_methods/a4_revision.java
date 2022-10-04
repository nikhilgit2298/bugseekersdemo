package a3_methods;

public class a4_revision {         //p,q,r,s = local variables
	static boolean t=true;        //static variable  broad scope
    int u=3000;                   //instance variable   broad scope

			public void p1()	{     //method1
		String p="pratik";            //local variable=1
		System.out.println(p);
			}
			public void p2()	{                //method2
				String q="namdevi";           //local variable=2
				System.out.println(q);
			}
			public void p3()	{            //method3
				String r="avinashi";         //local variable=3
				System.out.println(r);
			}
			public void p4()	{             //method4
				String s="nikita";         //local variable=4
				System.out.println(s);
			}
		public static void main(String[] args) {     //main method
			a4_revision nik=new a4_revision();   //object generate (class name var=new class name)
			System.out.println(nik.t);            // calling static variable by obj-variable
			System.out.println(a4_revision.t);   // calling static variable by class name
			System.out.println(nik.u);  // calling instance variable by obj-var + by class name not ok

			nik.p1();          //to call local var --(obj.var.method)
			nik.p2();          //to call local var --(obj.var.method)
			nik.p3();          //to call local var --(obj.var.method)
			nik.p4();             //to call local var --(obj.var.method)
			}		
}
