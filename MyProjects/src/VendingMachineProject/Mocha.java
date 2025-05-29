package VendingMachineProject;

import java.util.Scanner;

public class Mocha implements Coffee{
	
	public void detail() {
		System.out.println("Description:  chocolate + whipped cream");	
	}
	public void menu() {
		Scanner sc=new Scanner(System.in);
		int halfGlass=200, fullGlass=280;
		System.out.println("The Price of half glass is: Rs."+halfGlass);
		System.out.println("The Price of full glass is: Rs."+fullGlass);
		
		System.out.println("which glass do you want");
		System.out.println("Press 1 for Half Glass and Press 2 for Full Glass");
		int glass=sc.nextInt();
		
		switch(glass) {
		case 1: System.out.println("I want half glass");
		System.out.println("Enter the number of glass");
		int half=sc.nextInt();
		System.out.println("Your Total bill for " +half+" half glass is Rs."+half*halfGlass);
		break;
		
		case 2: System.out.println("I want full glass");
		System.out.println("Enter the number of glass");
		int full=sc.nextInt();
		System.out.println("Your Total bill for "+full+ " half glass is Rs."+full*halfGlass);
		break;
		
		default: System.out.println("Not Available!! ");
		menu();
		}
	}

}
