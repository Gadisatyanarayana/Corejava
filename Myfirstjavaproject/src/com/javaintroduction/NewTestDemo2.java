package com.javaintroduction;



public class NewTestDemo2 {
  
	//static 	NewTestDemo2 ntd2 = new NewTestDemo2(); - first it was executed...
	static String name ="SatyaNarayana";
	static int age  = 21;
	static {
		System.out.println("Static Block 1 Called");
	
	}
	
	
	public static void main(String[] args) {
       
		NewTestDemo2 ntd2 = new NewTestDemo2();
		System.out.println("Main Method Started");
		System.out.println(name + " : " + age);
	
	 System.out.println("Main Method Ended ");
	}
	static{
		System.out.println("Static block 3 called");
	}
	
	
	{
		
		System.out.println("Instance Method Started");
		//NewTestDemo2 ntd2 = new NewTestDemo2(); - this will prints the n times
	}
    static {
    	System.out.println("Static Block 2 Called");
    }
    {
	System.out.println("Instance Method Ended");
	}
}
