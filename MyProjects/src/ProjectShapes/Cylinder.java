package ProjectShapes;

public class Cylinder implements ThreeDShapes{
	double h, r;
	Cylinder(){}
	Cylinder(double r, double h){
		this.r=r;
		this.h=h;
	}
	
	@Override
	public void getDetails() {
		System.out.println("The Radius and height of Cylinder is:" +r +" Unit"+" and "+h+" Unit");	
	}
	
	@Override 
	public void getVolume() {
		System.out.println("The Volume of Cylinder is: "+ Math.PI*r*r*h+" Cu.Unit");
	}
	
	@Override 
	public void getLSA() {
		System.out.println("The LSA of Cylinder is: "+ 2*Math.PI*r*h+" Sq.Unit");
	}
	
	@Override 
	public void getTSA() {
		System.out.println("The TSA of Cylinder is: "+ 2*Math.PI*r*(r+h)+" Sq.Unit");
	}
}
