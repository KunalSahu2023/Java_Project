package ProjectShapes;

public class Triangle extends TwoDShapes{
	
	double base, hei;
	int a,b,c;
	
	Triangle(){}
	
	Triangle(double base, double hei, int a, int b, int c){
		this.base=base;
		this.hei=hei;
		this.a=a;
		this.b=b;
		this.c=c;
	}

	@Override
	public void getArea() {
		System.out.println("The Area of Triangle is:" +0.5*hei*base);
	}
	
	@Override
	public void getPerimeter() {
		System.out.println("The Perimeter of Rectangle is:" +a+b+c);
	}
}
