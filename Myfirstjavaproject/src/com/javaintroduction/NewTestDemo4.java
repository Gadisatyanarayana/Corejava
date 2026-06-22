package com.javaintroduction;

public class NewTestDemo4 {
	
	void display() {
		System.out.println("Displaying the user data");
		System.out.println("Displaying the user data");
	}
	
	public static void show() {
		System.out.println("Showing something");
		System.out.println("Showing something");
	}
      //public native void  hello();// we cannot give the body to the native method 
      //if we call the native method in the main method it will give the -
     //- java.lang.UnsatisfiedLinkError: 'void com.javaintroduction.NewTestDemo4.hello()'
      // it was used for the c/c++ code using in java by using native method by using the native libraries
	public static void main(String[] args) {
		
		System.out.println("Mainmethodstarted");
		NewTestDemo4 ntd4 = new NewTestDemo4();
		ntd4.display();
         NewTestDemo4.show();		
         //ntd4.hello();
         System.out.println(Thread.currentThread());// this will tell the 
         //how many threads in your current program
         System.out.println("main method ended");
	}
	

}
