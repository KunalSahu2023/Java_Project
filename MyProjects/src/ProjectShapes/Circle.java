package ProjectShapes;

public class Circle implements TwoDShapes {
	
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
		System.out.println("Radius of Circle is: " +r+" unit");
	}
	
	@Override
	public void getArea() {
		System.out.println("Area of Circle is " + Math.PI*r*r +" Sq. Unit");
	}
	
	@Override
	public void getPerimeter() {
		System.out.println("The Perimeter of Circle is " + 2*Math.PI*r +" Unit");
	}

}
