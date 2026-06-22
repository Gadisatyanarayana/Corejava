package com.javaintroduction;

public class NewTestDemo5 {
	public static void exam() {
		System.out.println("Exam started");
		NewTestDemo5 ntd5 = new NewTestDemo5();
		ntd5.prepare();
	}
	void prepare() {
		System.out.println("Preparation Started");
		returntest();
	}
public static void test() {
		System.out.println("Test Qualified by grades");
	}
void returntest() {
	System.out.println("Everyone should get the above 75 marks to pass in the exam");
}

	public static void main(String[] args) {
     
		System.out.println("Main method started");
		
		test();
		exam();
		
		
		
		
		System.out.println("Main method ended");
	}

}
