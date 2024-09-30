package com.bptn.course._06_switch;

import java.util.Scanner;

public class Vendimachine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 double totalprice = 0.0;
		 
		 System.out.println("1: Coke $1.25");
		 System.out.println("2: Chockolate $2.50");
		 
		 
		 System.out.println("Please enter your choice");
		 int choice = scanner.nextInt();
		 System.out.println("Please enter the amount you want to pay");
		 
		 double amount = scanner.nextDouble();
		
		 
		switch(choice) {
		
		case 1: System.out.println("You choose coke");
				totalprice += 1.25;
				break;
		case 2: System.out.println("You pick chocholate");
				totalprice += 2.50;
				break;
		default: System.out.println("YThank you for stop by!");
			

	}
		if(amount > totalprice) {
			
			double change = amount - totalprice;
			System.out.println("you have change"+ change);
		}else {
			System.out.println("you dont put  sufficent amount, Thank you");
		}
		
		scanner.close();
	}

}
	
