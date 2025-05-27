package DominosEatryProject;

import java.util.Scanner;

public class DominosShop {
	
	public FastFood selectFastFood(){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Fastfood");
		System.out.println("Press 1 for Pizza");
		System.out.println("Press 2 for Burger");
		System.out.println("Press 3 for Desert");
		 int food=sc.nextInt();
		 
		 switch(food) {
		 case 1 : 
			 return new Pizza();
		 case 2 : 
			 return new Burger();
		 case 3 : 
			 return new Desert();
		 
		 default: System.out.println("Choose Valid FastFood");
		 System.out.println("Choose from the Menu List");
		 return selectFastFood();
		 }
	}
}
