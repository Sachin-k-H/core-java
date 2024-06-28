package com.sachin_encap;

public class Change_Bank_Branch {
public static void main(String[] args) {
	Bank_Details bd= new Bank_Details();
	System.out.println("BANK NAME         : "+bd.getbank_name());
	System.out.println("ACCOUNT_HOLDERNAME: "+bd.getaccount_holdername());
	bd.setbranch("Belgaum_Branch");
	bd.setaccount_number("10003456000");
	bd.setifsc_code("AXIS0005");
	System.out.println("NEW ACCOUNT NUMBER: "+bd.getaccount_number());
	System.out.println("NEW IFSC_CODE     : "+bd.getifsc_code());
	System.out.println("BRANCH            : "+bd.getbranch());
	System.out.println("            ***             ");
	System.out.println("BRANCH CHANGE SUCCESSFUL");
}
}
