package WeaponsProject;

import java.util.Scanner;

public class Game {

		public Weapon selectWeapons() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your Score");
			int score=sc.nextInt();
			if(score<=400) {
				System.out.println("You got Knife");
				return new Knife();
			}
			else if(score<=800) {
				System.out.println("You got Gun");
				return new Gun();
			}
			else {
				System.out.println("You got Bomb");
				return new Bomb();
			}
		}
}
