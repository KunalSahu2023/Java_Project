package ProjectShapes;

public class Rectangle implements TwoDShapes {
	double len, wid;

	Rectangle(){}
	
	Rectangle(double len, double wid){
		this.len=len;
		this.wid=wid;
	}
	
	@Override
	public void getDetails() {
		System.out.println("Length of Rectangle is: "+len+" unit");
		System.out.println("Width of Rectangle is: "+wid+" unit");
	}
	
	@Override
	public void getArea() {
		System.out.println("The Area of Rectangle is:" +len*wid+" Sq. Unit");
	}
	
	@Override
	public void getPerimeter() {
		System.out.println("The Perimeter of Rectangle is:" +2*(len+wid)+" Unit");
	}

}
