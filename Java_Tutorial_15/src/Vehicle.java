
public class Vehicle extends Crashable  implements Driveable {

	int numOfWheels = 2;
	double theSpeed = 0;
	
	int carStrength = 0;
	
	
	public int getWheel() {
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


	public void setCarStrength(int carStrength) {
		// TODO Auto-generated method stub
		this.carStrength = carStrength;
	}

	public int getCarStrength() {
		// TODO Auto-generated method stub
		return this.carStrength;
	}
	
}
