package com.javaintroduction;

public class Employee {
     int eid;
      String eName;
      static String employeename;
      String orgname = "satya";
	public static void main(String[] args) {
		//CE:The local variable a may not have been initialized
		//int a ;
		//System.out.println(a);
		
		
		Employee e = new Employee();
		employeename= "Swaroop";
        e.eid= 10;
        e.orgname = "SatyaNarayana";
        System.out.println(Employee.employeename);
        e.eName = "Satyanarayana";
		System.out.println(e.eName+ " :" + "" + e.eid);
		System.out.println(e.orgname);
	}

}
