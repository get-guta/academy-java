package com.bptn.course._06_switch;
import java.util.Scanner;

public class DataPlanSelector {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		 double Price = 0.0;
		 
		 System.out.println("Please enter your choice");
		
		int choice = scanner.nextInt();
		
	
		switch(choice) {
		
		case 1: System.out.println("You selected 1GB!");
				Price = 10;
				break;
		case 2: System.out.println("You selected 5GB!");
				Price = 30;
				break;
		case 3: System.out.println("You selected 10GB!");
				Price= 50;
				break;
		case 4: System.out.println("You selected unlimited!");
				Price = 70;
				break;
		default: System.out.println("You selected unavailable plan");
		        break;
		
		
        }
		if (Price != 0) {
            System.out.println("The price of your selected plan is: $" + Price);

	}
		
		scanner.close();
		
	}

}
