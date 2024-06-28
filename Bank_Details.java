package com.sachin_encap;

public class Bank_Details {
	private String bank_name = "AXIS BANK";
	private String account_holdername = "XYZ";
	private String account_number = "12003456789";
	private String ifsc_code = "AXIS0045";
	private String branch = "Trongallu";

	public String getbank_name() {
		return bank_name;
	}
	public String getaccount_holdername() {
		return account_holdername;
	}
	public String getaccount_number() {
		return account_number;
	}

	public void setaccount_number(String account_number) {
		this.account_number = account_number;
	}

	public String getifsc_code() {
		return ifsc_code;
	}

	public void setifsc_code(String ifsc_code) {
		this.ifsc_code = ifsc_code;
	}

	public String getbranch() {
		return branch;
	}

	public void setbranch(String branch) {
		this.branch = branch;
	}
}
