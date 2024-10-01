package com.bptn.course._10_oop_bank_example;

class BankAccount {
	
	// Data Members / Properties / Attribute 
	private String accountNumber;
	private double balance;
	
	// Constructor
	public BankAccount(String accountNumber, double initialBalance) {
		this.accountNumber = accountNumber;
		this.balance = initialBalance;
	}
	
	// Instance Method, Class Method, Behavior
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
		}
	}
	
	public void withdraw(double amount) {
		if(amount>0 && amount<=balance) {
			balance -= amount;
		}
	}
	
	//	Getters and Setters
	public double getBalance() {
		return balance;
	}
	
	public void displayAccountInfo() {
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Current Balance: "+balance);
	}

}