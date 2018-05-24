package com.custom_exception.mocktest.melanrashitha;
public class InsufficientBalanceException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InsufficientBalanceException(double amount) {
		System.out.println("Sorry Your Account Balance is  : " + amount);
	}

	@Override
	public void printStackTrace() {

		super.printStackTrace();
	}

}
