package VendingMachineProject;

import java.util.Scanner;

public class PineApple implements Juice{
	
	public void detail() {
		System.out.println("Description: 	Tangy and refreshing");
	}
	public void menu() {
		Scanner sc=new Scanner(System.in);
		int smallGlass=35, mediumGlass=50, largeGlass=65 ;
		System.out.println("The Price of Small glass is: "+smallGlass);
		System.out.println("The Price of Medium glass is: "+mediumGlass);
		System.out.println("The Price of largemall glass is: "+largeGlass);
		System.out.println("Which Glass do you prefer");
		System.out.println("Press 1 for small glass , Press 2 for medium glass and Press 3 for large glass");
		int glass=sc.nextInt();
		switch(glass) {
		case 1: System.out.println("I want small glass");
		System.out.println("how many glass");
		int small=sc.nextInt();
		System.out.println("Your Total bill for "+small+" small glass is Rs."+small*smallGlass);
		break;
		
		case 2: System.out.println("I want medium glass");
		System.out.println("how many glass");
		int medium=sc.nextInt();
		System.out.println("Your Total bill for "+medium+" medium glass is Rs."+medium*mediumGlass);
		break;
		
		case 3: System.out.println("I want small glass");
		System.out.println("how many glass");
		int large=sc.nextInt();
		System.out.println("Your Total bill for "+large+" small glass is Rs."+large*largeGlass);
		break;
		
		default: System.out.println("Not Available!!");
		menu();
		
		}
	}
}