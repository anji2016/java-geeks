package com.java.basics.interfaces;

public class HDFCBank implements Bank {

	@Override
	public long checkBalance() {
		return 0;
	}

	@Override
	public long savingsAccount() {
		return 0;
	}

	@Override
	public long salaryAccount() {
		return 0;
	}
	
	public String hdfcBankDetails() {
		return "details";
	}

}
