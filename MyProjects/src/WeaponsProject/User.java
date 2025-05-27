package WeaponsProject;

import java.util.Scanner;

public class User {
	
	public static void main(String[] args) {
		Game g = new Game();
		
		Scanner sc = new Scanner(System.in);
		char c; 
		do {
		Weapon w = g.selectWeapons();
		w.use();
		System.out.println("Press Y or y to Continue....");
		c=sc.next().charAt(0);
		}while(c=='Y'||c=='y');
		System.out.println("======Thank you====");
	}
	
	
}
