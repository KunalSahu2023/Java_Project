package VendingMachineProject;

import java.util.Scanner;

public class Desert implements Wine{
	
	public void detail() {
		System.out.println("Description: Very sweet, served with dessert");
	}
	public void menu() {
		Scanner sc=new Scanner(System.in);
		int smallGlass=400, mediumGlass=700;
		System.out.println("The Price of Small glass is: "+smallGlass);
		System.out.println("The Price of Medium glass is: "+mediumGlass);
		System.out.println("Which Glass do you prefer");
		System.out.println("Press 1 for small glass , Press 2 for medium glass");
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
		
		default: System.out.println("Not Available!!");
		menu();
		
		}
	}
}
