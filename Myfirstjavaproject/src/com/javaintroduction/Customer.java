package com.javaintroduction;

public class Customer {

	public static void main(String[] args) {

		System.out.println("Main Method Started");
		
		Customer c1 = new Customer();
		System.out.println(c1);
		//com.javaintroduction.Customer@2b2fa4f7 when we call a object the 
		//it gives the full address of the object
		//com.javaintroduction.Customer- full qualified class name 
		//2b2fa4f7- HexaDecimal Representation  of the hashcode
		int a=10;
		int b = 1244;
		System.out.println(a + " "+ b);//it  prints the decimal number 
		int c = 0124;//Octal number it was base of()8;
		//the octal calculates like this : 40+1*(8^2)+2*(8^1)+4*(8^0); 
		System.out.println(c);//it was the Octal Number
		//by this we knows the Octa decimal number  but how can we identify the 
		//Hexa decimal number
		//Hexa Decimal is the Base ()6;
		//Hexa decimal representation is : 
        int d = 0x123;//calculation: 0+1*16^2+2*16^1+3*16^0
		System.out.println(d);//it prints the Hexa Decimal number
        int c1Hash = 0x1dbd16b6;
        System.out.println(c1Hash);
        System.out.println(c1.hashCode());//Memory Address code of the object -724542711
		
		Customer c2 = new Customer();
		Customer c3 = new Customer();
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
	}
	

}
