package com.custom_exception.mocktest.melanrashitha;
public class Account {

	public double balance;
	public String accountNo;

	public Account(double balance, String accountNo) {
		this.balance = balance;
		this.accountNo = accountNo;
		System.out.println("Depositting  " + balance + "  Rupees");

	}

	public void deposit(double depositValue) {
		this.balance += depositValue;
	}

	public void withdraw(double withdrawValue) throws InsufficientBalanceException {
		if (withdrawValue > this.balance) {
			throw new InsufficientBalanceException(this.balance);
			
		} else {
			this.balance -= withdrawValue;
			System.out.println("Existing Amount = " + this.balance + " Please Enter Amount to Withdrawn");
		}
	}

}
