package VendingMachineProject;

import java.util.Scanner;

public class Vending {
	
	Vending(){
		System.out.println("--------Welcome to my Vending shop---------");
		System.out.println("What baverage do you want to take");
	}
	
	public void selectBaverage() {
		
		Scanner sc = new Scanner(System.in);
		 System.out.println("=================================");
		System.out.println("Choose from Menu List");
		System.out.println("Press 1 for Coffee");
		System.out.println("Press 2 for Juice");
		System.out.println("Press 3 for Wine");
		int choice=sc.nextInt();
		System.out.println("==================================");
		
		switch(choice){
			case 1: System.out.println("You have choosed Coffee Menu");
				Coffee c1= selectCoffee();
				c1.menu();
				break;
			case 2: System.out.println("You have choosed Juice Menu");
				Juice j1= selectJuice();
				j1.menu();
				break;
			case 3: System.out.println("You have choosed Wine Menu");
				Wine w1=selectWine();
				w1.menu();
				break;
				
				default: System.out.println("You have Choosed Invalid option!!");
				System.out.println("...Please choose from menu...");
				selectBaverage();
		}
	}
	
	public Coffee selectCoffee() {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("=======================================");
			System.out.println("Which coffee do you want to drink");
			System.out.println("Press 1 for Espresso");
			System.out.println("Press 2 for Americano");
			System.out.println("Press 3 for Cappucinno");
			System.out.println("Press 4 for Mocha");
			System.out.println("Press 5 for Cold Brew");
			System.out.println("Press 6 for Iced");
			int choice=sc.nextInt();
			System.out.println("=======================================");
			
			switch(choice){
				case 1: System.out.println("You choose Espresso");
					return new Espresso();
				case 2: System.out.println("You choose Americano");
					return new Americano();
				case 3: System.out.println("You choose Cappucino");
					return new Cappucinno();
				case 4: System.out.println("You choose Mocha");
					return new Mocha();
				case 5: System.out.println("You choose Cold Brew");
					return new ColdBrew();
				case 6: System.out.println("You choose Iced");
					return new Iced();
					
				default: System.out.println("You have Choosed Invalid coffee");
				return selectCoffee();
			}
		}
	
	public Juice selectJuice() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("=======================================");
		System.out.println("What Juice you prefer to drink");
		System.out.println("Press 1 for Orange");
		System.out.println("Press 2 for Apple");
		System.out.println("Press 3 for Mango");
		System.out.println("Press 4 for PineApple");
		System.out.println("Press 5 for Mixed Fruit");
		System.out.println("Press 6 for Pomogranate");
		int choice=sc.nextInt();
		System.out.println("=======================================");
		
		switch(choice){
			case 1: System.out.println("You choosed Orange");
				return new Orange();
			case 2: System.out.println("You chooseed Apple");
				return new Apple();
			case 3: System.out.println("You choosed Mango");
				return new Mango();
			case 4: System.out.println("You choosed PineApple");
				return new PineApple();
			case 5: System.out.println("You choose Mixed Fruit");
				return new MixedFruit();
			case 6: System.out.println("You choosed Pomogranate");
				return new Pomogranate();
				
				default: System.out.println("You have Choose Invalid");
				return selectJuice();
		}
	}
	
	
	public Wine selectWine() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("=======================================");
		System.out.println("Which Wine you want to taste");
		System.out.println("Press 1 for Red");
		System.out.println("Press 2 for Rose");
		System.out.println("Press 3 for Sparkling");
		System.out.println("Press 4 for Desert");
		System.out.println("Press 5 for Portified");
		System.out.println("Press 6 for White");
		int choice=sc.nextInt();
		System.out.println("=======================================");
		
		switch(choice){
			case 1: System.out.println("You choosed Red");
				return new Red();
			case 2: System.out.println("You choosed Rose");
				return new Rose();
			case 3: System.out.println("You choosed Sparkling");
				return new Sparkling();
			case 4: System.out.println("You choosed Desert");
				return new Desert();
			case 5: System.out.println("You choosed Portified");
				return new Portified();
			case 6: System.out.println("You choosed White");
				return new White();
				
				default: System.out.println("You have Choose Invalid");
				return selectWine();
		}
	}
	
}
	

