
public class Vehicle extends Crashable  implements Driveable, Cloneable{

	int numOfWheels = 2;
	double theSpeed = 0;
	
	int carStrength = 0;
	
	
	public int getWheels() {
		// TODO Auto-generated method stub
		return this.numOfWheels;
	}

	
	public void setWheels(int numWheels) {
		// TODO Auto-generated method stub
		this.numOfWheels = numWheels;
	}

	
	public double getSpeed() {
		// TODO Auto-generated method stub
		return this.theSpeed;
	}

	
	public void setSpeed(double speed) {
		// TODO Auto-generated method stub
		this.theSpeed = speed;
	}

	public Vehicle(int wheels, double speed){
		this.numOfWheels = wheels;
		this.theSpeed = speed;
	}
	
	public Vehicle() {}

	public void setCarStrength(int carStrength) {
		// TODO Auto-generated method stub
		this.carStrength = carStrength;
	}

	public int getCarStrength() {
		// TODO Auto-generated method stub
		return this.carStrength;
	}
	
	public String toString() {
		return "Num of Wheels: " + this.numOfWheels;
	}
	
	public Object clone() {
		Vehicle car;
		
		try
		{
			car = (Vehicle) super.clone();
		}
		
		catch(CloneNotSupportedException e)
		{
			return null;
		}
		
		return car;
	}
}
