package ProjectShapes;

public class Cuboid implements ThreeDShapes{
	double len,bre,hei;
	Cuboid() {}
	Cuboid(double len, double bre, double hei ){
		this.len=len;
		this.bre=bre;
		this.hei=hei;
	}
	
	@Override
	public void getDetails() {
		System.out.println("The length,breadth and height of Cuboid is: "+len+"Unit" +" , "+bre+" Unit "+hei+" Unit");	
	}
	
	@Override 
	public void getVolume() {
		System.out.println("The Volume of Cuboid is: "+len*bre*hei+" Cu.Unit");
	}
	
	@Override 
	public void getLSA() {
		System.out.println("The LSA of Cuboid is: "+2*hei*(len+bre));
	}
	
	@Override 
	public void getTSA() {
		System.out.println("The TSA of Cuboid is: "+2*(len*bre+bre*hei+hei*len));
	}
	
}
