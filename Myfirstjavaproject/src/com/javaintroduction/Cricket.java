package com.javaintroduction;

public class Cricket {
    // Static variable Declaration
	  static int  cricketerno;
	  static String cricketername;
	  
	  int jerseyno=30;
	  String name="surya";
	  
	  
	public static void main(String[] args) {
       //Initialization
		cricketerno = 19;
		cricketername ="satya";
		
		//Creating  The Object
		Cricket c1= new Cricket();
		//Cannot make a static reference to the non-static field jerseyno
		System.out.println(c1.jerseyno);
		//Cannot make a static reference to the non-static field name
		System.out.println(c1.name);
		//Accessing
	System.out.println("welcome to indian cricket team");
	System.out.println(cricketername + " " + ":" + " " + cricketerno);
		
	}

}
