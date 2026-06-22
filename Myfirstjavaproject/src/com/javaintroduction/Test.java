package com.javaintroduction;


class A{
	B b;
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called b to a");
	}
}

class B{
	A a;
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called a to b");
	}
}



public class Test {
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called");
	}
	
	void hello() {
	   Test h1 = new Test();
	   System.out.println("outmethod" + h1);
	   System.out.println("Hello method called");
	}
	
	void welcome() {
		System.out.println("WELCOME METHOD CALLED");
	}
	
	
	

	public static void main(String[] args) {
   
		
	//Garbage collection - 5 variants{5th case was the theoretical which was the Island of isolation}
	//we have the 4 cases of  eligibility of the GC
		
		
		Test t1 = new Test();
		Test  t2 = new Test();
		Test  t3 = new Test();
		Test  t4 = new Test();
		//1. Nullify- Nullify means after the object usage was over you should need to the 
		//do object to null                                                                                                                                                                                           
		
		//t3 = null;//it removes the address of the t1 and assign to the next object refrence
		t1= null;
		
		//2 Reassigning  the Reference
		t3=t2;
		//3 Out of scope or Object inside a method
		
		t4.hello();
		
		
		//4 Anonymous Object 
		
		new Test().welcome();
		
		//5 Island of isolation
		
		A  obj1 = new A();
		B obj2 = new B();
		
		obj1.b=obj2;
		obj2.a=obj1;
		
		obj1=null;
		obj2=null;
		
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		
		//Runs the Garbage collector in the virtual machine
		System.gc();	
	}

}
