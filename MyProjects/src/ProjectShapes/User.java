package ProjectShapes;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Game g = new Game();
		char ch;
		
		do {
		g.selectShapes();
		System.out.println("Press Y/y to continue...");
		ch = sc.next().charAt(0);
		}
		while(ch=='y' || ch=='y');
		System.out.println("====Thank you! Game End=====");
		
	}

}
