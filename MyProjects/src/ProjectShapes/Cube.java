package ProjectShapes;

public class Cube implements ThreeDShapes{
	double a;
	Cube(){}
	Cube(double a){
		this.a=a;
	}
	
	@Override
	public void getDetails() {
		System.out.println("The side of Cube is:" +a +" Unit");	
	}
	
	@Override 
	public void getVolume() {
		System.out.println("The Volume of Cube is: "+a*a*a+" Cu.Unit");
	}
	
	@Override 
	public void getLSA() {
		System.out.println("The LSA of Cube is: "+4*a*a+" Sq.Unit");
	}
	
	@Override 
	public void getTSA() {
		System.out.println("The TSA of Cube is: "+6*a*a+" Sq.Unit");
	}
}
