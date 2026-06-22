package com.javaintroduction;

public class NewTestDemo1 {

	public static void main(String[] args)throws ClassNotFoundException {
		System.out.println("main method Started");
		Class.forName("java.lang.System");
		Class.forName("java.lang.String");
		Class.forName("com.javaintroduction.Student");
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("main method ended");
				
		
		
	}

}
