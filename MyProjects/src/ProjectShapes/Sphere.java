package ProjectShapes;

public class Sphere implements ThreeDShapes{
	double r;
	Sphere(){}
	Sphere(double r){
		this.r=r;
	}
	
	
	@Override
	public void getDetails() {
		System.out.println("The Radius of Sphere is: "+r+" Unit");	
	}
	
	@Override 
	public void getVolume() {
		System.out.println("The Volume of Sphere is: "+4/3*Math.PI*r*r*r+" Cu.Unit");
	}
	
	@Override 
	public void getLSA() {
		System.out.println("The LSA of Sphere is: "+4*Math.PI*r*r+" Sq.Unit");	
	}
	
	@Override 
	public void getTSA() {
		System.out.println("The TSA of Sphere is: "+4*Math.PI*r*r+" Sq.Unit");
	}

}
