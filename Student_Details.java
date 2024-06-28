package com.sachin_encap;

public class Student_Details {
	private String student="Ranjan";
	private int rollno=25;
	private String standard="10th";
	private String ninth_result="Fail";
	
	public String getstudent() {
		return student;
	}
	public int getrollno() {
		return rollno;
	}
	public String getstandard() {
		return standard;
	}
	public String  getninth_result() {
		return ninth_result;
	}
	public void setninth_result(String ninth_result) {
		this.ninth_result=ninth_result;
	}
	
}