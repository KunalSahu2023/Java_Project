package ProjectShapes;

public class Rectangle extends TwoDShapes {
	double len, wid;

	Rectangle(){}
	
	Rectangle(double len, double wid){
		this.len=len;
		this.wid=wid;
	}
	@Override
	public void getArea() {
		System.out.println("The Area of Rectangle is:" +len*wid);
	}
	
	@Override
	public void getPerimeter() {
		System.out.println("The Perimeter of Rectangle is:" +2*(len+wid));
	}

}
