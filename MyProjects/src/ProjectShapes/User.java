package ProjectShapes;

import java.util.Scanner;

public class User {

	public static void main(String[] args) {
		
		Game g = new Game();
		char ch;
		do {
		Scanner sc = new Scanner(System.in);
		Shapes t1 = g.selectTwoDShapes();
		t1.getDetails();
		Shapes t2= g.selectThreeDShapes();
		t2.getDetails();
		ch = sc.next().charAt(0);
		}
		while(ch=='y' || ch=='y');
	}

}
