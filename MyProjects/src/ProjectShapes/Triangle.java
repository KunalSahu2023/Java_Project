package ProjectShapes;

public class Triangle implements TwoDShapes{
	
	double base, hei;
	int a,b,c;
	
	Triangle(){}
	
	Triangle(double base, double hei,int a, int b, int c){
		this.base=base;
		this.hei=hei;
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	@Override
	
	public void getDetails() {
		System.out.println("The Base, height, a,b,c is: " + base + hei + a + b + c);
	}

	@Override
	public void getArea() {
		System.out.println("The Area of Triangle is:" +0.5*hei*base+" Sq.Unit");
	}
	
	@Override
	public void getPerimeter() {
		System.out.println("The Perimeter of Rectangle is:" +a+b+c+" Uuit");
	}
}
