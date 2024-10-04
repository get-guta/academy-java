package com.bptn.course._14_exception_handling;

class InsufficientBalanceException extends Exception {
	 public InsufficientBalanceException(String message) {
	  super(message);
	 }
	}

public class CustomException {


	 private double accountBalance;


	 public CustomException(double accountBalance) {
	  this.accountBalance = accountBalance;
	 }


	 public void withdraw(double amountToWithdraw) throws InsufficientBalanceException {
	  if (accountBalance >= amountToWithdraw) {
	   this.accountBalance -= amountToWithdraw;
	   System.out.println("Withdrawal Successful!");
	  } else {
	   throw new InsufficientBalanceException("Insufficient funds!");
	  }
	 }

	 
	 public static void main(String[] args) {
		  CustomException myDemo = new CustomException(1000.00);
		  try {
		   myDemo.withdraw(1500);
		  } catch (InsufficientBalanceException e) {
		   System.out.println(e.getMessage());
		  }
		 }


		}