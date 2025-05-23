package ProjectShapes;

public class Circle extends TwoDShapes {
	
	double r;

	Circle(){}
	
	Circle(double r){
		if(r>0)
		this.r=r;
		else
		System.out.println("Invalid Radius");
	}
	
	@Override
	public void getDetails() {
		System.out.println("This is a circle");
	}
	
	@Override
	public void getArea() {
		System.out.println("The Area of Circle is " + Math.PI*r*r);
	}
	
	@Override
	public void getPerimeter() {
		System.out.println("The Perimeter of Circle is " + 2*Math.PI*r);
	}

}
