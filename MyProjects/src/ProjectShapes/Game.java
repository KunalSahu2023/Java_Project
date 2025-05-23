package ProjectShapes;

import java.util.Scanner;

public class Game{
	
	//getDetaisl
	
	public void getDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1: for 2D Shapes");
		System.out.println("Press 1: for 2D Shapes");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1: System.out.println("You have chosen 2D Shapes");
		selectTwoDShapes();
		break;
		
		case 2: System.out.println("You have chosen 3D Shapes");
		selectThreeDShapes();
		break;
		}
	}
	
	//TwoDShapes
	
	public Shapes selectTwoDShapes() { 
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 for : Circle");
		System.out.println("Press 2 for : Triangle");
		System.out.println("Press 3 for : Square");
		System.out.println("Press 4 for : Rectangle");
		int choice = sc.nextInt();
		
		
		switch(choice) {
		case 1 : 
		  System.out.println("You choose Circle");
			return new Circle();
			
		case 2 : 
		  System.out.println("You choose Triangle");
			new Triangle();
			
		case 3 : 
		  System.out.println("You choose Square");
          new Square();
			
		case 4 :
		  System.out.println("You choose Rectangle");
			new Rectangle();
			
		default :  
			System.out.println("You have Choose invalid option ");
			return null;
		 }
	}
	
	// ThreeDShapes
	
	public Shapes selectThreeDShapes() { 
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 for : Cylinder");
		System.out.println("Press 2 for : Sphere");
		System.out.println("Press 3 for : Cube");
		System.out.println("Press 4 for : Cuboid");
		int choice = sc.nextInt();
		
		
		switch(choice) {
		case 1 : 
		  System.out.println("You choose Cylinder");
			return new Cylinder();
			
		case 2 : 
		  System.out.println("You choose Sphere");
          return new Sphere();
			
		case 3 : 
		  System.out.println("You choose Cube");
			return new Cube();
			
		case 4 :
		  System.out.println("You choose Cuboid");
			return new Cuboid();
			
		default :  
			System.out.println("You have Choose invalid option ");
			return null;
		 }
	}
		
	}
