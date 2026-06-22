package com.javaintroduction;

public class NewTestDemo3 {
     
	
	 public static void Hello() {
		 System.out.println("Hello Satyanarayana");
	 }
	@SuppressWarnings("static-access")
	public static void main(String[] args) {

	NewTestDemo3   ntd3= new 	NewTestDemo3();//it calls the non named instance methods
	        
		System.out.println("Hello World");
	   ntd3.Hello();//it was not the static way of calling
	   NewTestDemo3.Hello();//Static way of calling the method
	   Hello();
	   ntd3.Bye();
	  //NewTestDemo3 nt1 =  new NewTestDemo3(); it was also prints the non named instance methods
	}
	{
		System.out.println("without name instance method");
	}
	 void Bye() {
		 System.out.println("Bye Bye Methods in java welcome for functions");
	 }

}
