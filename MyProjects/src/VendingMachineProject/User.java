package VendingMachineProject;

import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		
		Vending v = new Vending();
		Scanner sc = new Scanner(System.in);
		char c; 
		do {
		Baverage b = v.selectBaverage();
		b.drink();
		System.out.println("Press Y or y to Continue....");
		c=sc.next().charAt(0);
		}while(c=='Y'||c=='y');
		System.out.println("======Thank you for order!!====");
	
}

}