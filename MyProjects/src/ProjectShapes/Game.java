package ProjectShapes;

import java.util.Scanner;

public class Game{
	
	Game(){
		System.out.println("=======Game Has Started=======");
	}
	
	//getDetails
	
	public void selectShapes() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1: for 2D Shapes");
		System.out.println("Press 1: for 3D Shapes");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1: 
			System.out.println("You have selected 2D Shape");
			TwoDShapes t1=selectTwoDShapes();
			t1.getDetails();
			t1.getArea();
			t1.getPerimeter();
			break;
		
		case 2: 
			System.out.println("You have selected 3D Shape");
			ThreeDShapes t2=selectThreeDShapes();
			t2.getDetails();
			t2.getVolume();
			t2.getLSA();
			t2.getTSA();
			break;
			
			default : 
				System.out.println("Invalid choice Entered!!");
			System.out.println("Select from valid Options...");
			selectShapes();
		}
	}
	
	//TwoDShapes
	
	public TwoDShapes selectTwoDShapes() { 
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 for : Circle");
		System.out.println("Press 2 for : Triangle");
		System.out.println("Press 3 for : Square");
		System.out.println("Press 4 for : Rectangle");
		int choice = sc.nextInt();
		
		
		switch(choice) {
		case 1 : 
			System.out.println("You have Selected Circle");
			System.out.println("Enter the radius: ");
			double r=sc.nextDouble();
			Circle c1=new Circle(r);
			return c1;
			
		case 2 : 
			System.out.println("You have Selected Triangle");
			System.out.println("Enter the base: ");
			double base =sc.nextDouble();
			System.out.println("Enter the Height is: ");
			double hei =sc.nextDouble();
			System.out.println("Enter a: ");
			int a=sc.nextInt();
			System.out.println("Enter b: ");
			int b=sc.nextInt();
			System.out.println("Enter c: ");
			int c=sc.nextInt();
			Triangle t1=new Triangle(base,hei,a,b,c);
			return t1;
			
		case 3 : 
			System.out.println("You have Selected Square");
			System.out.println("Enter the side: ");
			double side=sc.nextDouble();
			Square s1=new Square(side);
			return s1;
			
		case 4 :
			System.out.println("You have Selected Rectangle");
			System.out.println("Enter the height: ");
			double len=sc.nextDouble();
			System.out.println("Enter the width: ");
			double wid=sc.nextDouble();
			Rectangle r1=new Rectangle(len,wid);
			return r1;
			
		default :  
			System.out.println("Invalid choice Entered!!");
			return selectTwoDShapes();
		 }
	}
	
	// ThreeDShapes
	
	public ThreeDShapes selectThreeDShapes() { 
		Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 for : Cylinder");
		System.out.println("Press 2 for : Sphere");
		System.out.println("Press 3 for : Cube");
		System.out.println("Press 4 for : Cuboid");
		int choice = sc.nextInt();
		
		
		switch(choice) {
		case 1 : 
			System.out.println("You have Selected Cylinder");
			System.out.println("Enter the radius: ");
			double r=sc.nextDouble();
			System.out.println("Enter the height: ");
			double h=sc.nextDouble();
			return new Cylinder(r,h);
			
		case 2 : 
			System.out.println("You have Selected Sphere");
			System.out.println("Enter the radius: ");
			double radi=sc.nextDouble();
			return new Sphere(radi);
			
		case 3 : 
			System.out.println("You have Selected Cube");
			System.out.println("Enter a: ");
			double a=sc.nextDouble();
			return new Cube(a);
			
		case 4 :
			System.out.println("You have Selected Cuboid");
			System.out.println("Enter the Length: ");
			double len=sc.nextDouble();
			System.out.println("Enter the height: ");
			double bre=sc.nextDouble();
			System.out.println("Enter the Width: ");
			double hei=sc.nextDouble();
			return new Cuboid(len,bre,hei);
			
		default :  
			System.out.println("Invalid choice Entered!!");
			return selectThreeDShapes();	
		 }
	}
		
	}
