
public class JavaLessonThree {
	
	static DottedLineBreaker breaker = new DottedLineBreaker();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int randomNumber = (int) (Math.random() * 50);
		
		if (randomNumber < 25) {
			System.out.println("The random number is less than 25");
		}
		else if (randomNumber > 40) {
			System.out.println("THe random number is greater than 40");
		}
		else if (randomNumber == 18) {
			System.out.println("The random number is equal to 18");
		}
		else if (randomNumber != 40) {
			System.out.println("The random number is not equal to 40");
		}
		else {
			System.out.println("Nothing Worked");
		}
		
		System.out.println("The random number is " + randomNumber);
		breaker.dot();
		
		if(!(false)) {
			System.out.println("I turned false into true");
			breaker.dot();
		}
		
		if((true) && (true)) {
			System.out.println("Both need to be true");
			breaker.dot();
		}
		
		if((false) || (true)) {
			System.out.println("One value is true");
			breaker.dot();
		}
		
		if((false) ^ (true)) {
			System.out.println("One value is true and one is false");
			breaker.dot();
		}
		
		
		int valueOne = 1;
		int valueTwo = 2;
		
		int biggestValue = (valueOne > valueTwo) ? valueOne:valueTwo;
		System.out.println(biggestValue);
		breaker.dot();
		
		char theGrade = 'c';
		
		switch (theGrade)
		{
		case 'a':
		case 'A':
			System.out.println("Great Job");
			break;
		case 'b':
		case 'B':
			System.out.println("Good Job");
			break;
		case 'c':
		case 'C':
			System.out.println("Ok Job");
			break;
		case 'd':
		case 'D':
			System.out.println("Bad Job");
			break;
			
		default:
			System.out.println("Fail");
			break;
		}
		breaker.dot();
	}

}
