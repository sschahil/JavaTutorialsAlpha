
public class JavaLessonThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int randomNumber = (int) (Math.random() * 50);
		
		if (randomNumber < 25)
		{
			System.out.println("The random number is less than 25");
		}
		else if (randomNumber > 40)
		{
			System.out.println("The random number is greater than 40");
			System.out.println("The random number is: " + randomNumber);	
		}
		else if (randomNumber <= 18)
		{
			System.out.println("The random number is equal to 18");
		}
		else if (randomNumber >= 40)
		{
			System.out.println("The random number is not equal to 40");
		}
		else 
		{
			System.out.println("Nothing Worked");
		}
		
		if (!(false))
		{
			System.out.println("\nTurned false into true");
		}
		
		if((true) && (true))
		{
			System.out.println("Both are true");
		}
		
		if((false) || (true))
		{
			System.out.println("One or both are true");
		}
		
		if((false) ^ (true))
		{
			System.out.println("Only one is true");
		}
		
		System.out.println("The random number is: " + randomNumber);
	}

}
