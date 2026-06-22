package com.javaintroduction;

public class NewTestDemo6 {
    
	
	static String cName ;
	static int cRollno;
	public static void main(String[] args) {
       //we can create the n no of objects to the class and also for the static variables assign to the  different data of the each individual object
		NewTestDemo6  cricketer = new NewTestDemo6();
		cricketer.cName = "Dhoni";
		cricketer.cRollno=1;
		System.out.println(cName +"  : 0"+cRollno);
		
		NewTestDemo6 cricket = new NewTestDemo6();
		cricket.cName ="Virat";
		cricket.cRollno= 18;
		System.out.println(cName +"  : " + cRollno);
		
		NewTestDemo6 crick = new  NewTestDemo6();
		crick.cName ="satyanarayana";
		crick.cRollno = 19;
	    System.out.println(cName + " : " + cRollno);
	    int a1 = 000153;
	    System.out.println(a1);
	}

}
