package VendingMachineProject;

import java.util.Scanner;

public class Vending {
	
	Vending(){
		System.out.println("Vending Machine is ready to produce Baverage......");
	}
	
	public Baverage selectBaverage() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Choice");
		System.out.println("Press 1 for Coffee");
		System.out.println("Press 2 for Juice");
		System.out.println("Press 3 for Wine");
		int choice=sc.nextInt();
		
		switch(choice){
			case 1: 
				return new Coffee();
			case 2: 
				return new Juice();
			case 3: 
				return new Wine();
				
				default: System.out.println("You have Choose Invalid");
				return selectBaverage();
		}
	}
}
