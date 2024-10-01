package com.bptn.course._10_oop_bank_example;

public class BankSystem {

	public static void main(String[] args) {
		
//		BankAccount testAccount = new BankAccount("987654", 1200.00);
//		testAccount.displayAccountInfo();
//		
//		BankAccount newTestAccount = new BankAccount("123456", 600.00);
//		newTestAccount.displayAccountInfo();
		
		SavingsAccount mySavingsAccount = new SavingsAccount("SAVINGS123", 500.00, 1.00);
		mySavingsAccount.applyInterest();
		mySavingsAccount.displayAccountInfo();
		
		ChequingAccount myChequingAccount = new ChequingAccount("1234", 500, 200);
		myChequingAccount.withdraw(300);
		myChequingAccount.displayAccountInfo();
		
	}

}
