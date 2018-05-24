package com.custom_exception.mocktest.melanrashitha;
import java.util.Scanner;

public class BankDemo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Account myAcc = new Account(10000, "4465452");

		try {
			while (myAcc.balance != 0) {

				System.out.println("\n Enter Amount to Withdrawn \n");
				myAcc.withdraw(scan.nextDouble());
			}

		} catch (InsufficientBalanceException e) {
			
			System.out.println("Do You wish to deposit money");
			//String decision = scan.next();
			if(scan.next() == "yes") {
				System.out.println("Enter Deposit Value");
				myAcc.deposit(scan.nextDouble());
			}else {
				e.printStackTrace();
			}
		}finally {
			System.out.println("Do You wish to deposit money");
			String decision = scan.nextLine();
			if(decision.equals("yes")) {
				System.out.println("Enter Deposit Value");
				myAcc.deposit(scan.nextDouble());
			}else {
				
			}
			
		}

	}

}