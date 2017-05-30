
public class JavaLessonSixteen {

	static DottedLineBreaker breaker = new DottedLineBreaker();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object superCar = new Vehicle();
		
		System.out.println(((Vehicle)superCar).getSpeed());
		breaker.dot();
		Vehicle superTruck = new Vehicle();
		
		System.out.println(superCar.equals(superTruck));
		System.out.println(superCar.hashCode());
		breaker.dot();
		
		System.out.println(superCar.getClass());
		System.out.println(superCar.getClass().getName());
		breaker.dot();
		
		if(superCar.getClass() == superTruck.getClass()) {
			System.out.println("The Same");
			breaker.dot();
		}
		
		System.out.println(superCar.getClass().getSuperclass());
		breaker.dot();
		
		System.out.println(superCar.toString());
		breaker.dot();
		
		int randNum = 100;
		System.out.println(Integer.toString(randNum));
		breaker.dot();
		
		superTruck.setWheels(6);
		
		Vehicle superTruck2 = (Vehicle)superTruck.clone();
		
		System.out.println(superTruck.getWheels());
		System.out.println(superTruck2.getWheels());
		breaker.dot();
		
		System.out.println(superTruck.hashCode());
		System.out.println(superTruck2.hashCode());
		breaker.dot();
	}

}
