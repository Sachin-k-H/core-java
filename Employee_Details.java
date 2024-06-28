package com.sachin_encap;

public class Employee_Details {

private	static String name   = "sachin";
private	static String id     = "10226";
private	static String department = "SMS-1 JSW Steel Works";
private	static String doj    = "10-6-2019";
private  String address="vijaynagar Township";

public String getname() {
	return name;
}
public String getid() {
	return id;
}
public String getdepartment() {
	return department;
}
public String getdoj() {
	return doj;
}


public void setaddress(String address) {
	this.address=address;
}
public String getaddress() {
	return address;
}

}
