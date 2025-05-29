package VendingMachineProject;

import java.util.Scanner;

public class User {
	public static void main(String[] args) {
		
		Vending v = new Vending();
		Scanner sc = new Scanner(System.in);
		char c; 
		do {
		v.selectBaverage();
		System.out.println("Do you want to taste another drink....");
		System.out.println("yes or no?");
		c=sc.next().charAt(0);
		}while(c=='Y'||c=='y');
		System.out.println("======Thank you for Visiting!!====");
	
}

}