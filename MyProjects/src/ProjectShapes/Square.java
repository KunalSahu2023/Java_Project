package ProjectShapes;

public class Square implements TwoDShapes {
	double side;
	
	Square(){}
	
	Square(double side){
		this.side=side;
	}
	
	@Override
	public void getDetails() {
		System.out.println("The Side of Square is:" +side);
	}
	
	@Override
	public void getArea() {
		System.out.println("The Area of Square is:" +side*side);
	}
	
	@Override
	public void getPerimeter() {
		System.out.println("The Perimeter of Square is:" +4*side);
	}

}