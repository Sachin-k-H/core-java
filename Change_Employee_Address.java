package com.sachin_encap;

public class Change_Employee_Address {

	public static void main(String[] args) {

		Employee_Details ed = new Employee_Details();

		System.out.println("EMPLOYEE NAME   : " + ed.getname());
		System.out.println("ID              : " + ed.getid());
		System.out.println("DEPARTMENT      : " + ed.getdepartment());
		System.out.println("DOJ             : " + ed.getdoj());
		System.out.println("             ");
		System.out.print("PREVIOUS ADDRESS:" + ed.getaddress());
		System.out.println("   Changed to ");
		ed.setaddress("Plotno-200 Ramteerthnagar Belgaum");
		System.out.println("NEW ADDRESS     : " + ed.getaddress());
	}

}
