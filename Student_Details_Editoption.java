package com.sachin_encap;

public class Student_Details_Editoption {

	public static void main(String[] args) {
		Student_Details en = new Student_Details();
		System.out.println("STUDENT NAME: "+en.getstudent());
		System.out.println("ROLL NO     : "+en.getrollno());
		System.out.println("STANDARD    : "+en.getstandard());
		en.setninth_result("Pass");
		System.out.println("NINTH_RESULT: "+en.getninth_result());
	}

}
