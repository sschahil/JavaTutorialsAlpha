import java.util.Scanner;

public class JavaLessonTwo {
	
	static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.out.print("Your favorite number: ");
			
		if(userInput.hasNextInt())
		{
				
			int numberEntered = userInput.nextInt();
				
			System.out.println("You Entered" + " " + numberEntered);
			
			int numEnteredTimes2 = numberEntered + numberEntered;
			System.out.println(numberEntered + " + " + numberEntered + " = " + numEnteredTimes2);
			
			int numEnteredMinus2 = numberEntered -  2;
			System.out.println(numberEntered + " - 2 " + " = " + numEnteredMinus2);
			
			int numEnteredTimesSelf = numberEntered * numberEntered;
			System.out.println(numberEntered + " * " + numberEntered + " = " + numEnteredTimesSelf);
			
			int numEnteredDivide2 = numberEntered / 2;
			System.out.println(numberEntered + " / 2 " + " = " + numEnteredDivide2);
			
			int numEnteredRemainder = numberEntered % 2;
			System.out.println(numberEntered + " % 2 " + " = " + numEnteredRemainder);
			
			numberEntered += 2;
			numberEntered -= 2;
			
			numberEntered--;
			numberEntered++;
			
			int numberABS = Math.abs(numberEntered);
			int whichIsBigger7 = Math.max(5, 7); // 7
			int whichIsBigger5 = Math.min(5, 7); // 5
			
			double numSQRT = Math.sqrt(25);
			
			int numCeiling = (int) Math.ceil(5.23); // 6
			
			int numFloor = (int) Math.floor(5.23); // 5
			
			int numRound = (int) Math.round(5.63); // 6
			
			int randomNumber = (int) (Math.random() * 11);
			
			System.out.println("Random Number: " + randomNumber);
			System.out.println("Absolute Number: " + numberABS);
			System.out.println("Maximum Number: " + whichIsBigger7);
			System.out.println("Minimum Number: " + whichIsBigger5);
			System.out.println("Square Root Number: " + numSQRT);
			System.out.println("Ceiling Number: " + numCeiling);
			System.out.println("Floor Number: " + numFloor);
			System.out.println("Round Number: " + numRound);
			
		}
		else 
		{
			System.out.println("Enter an integer next time");
		}
	}

}
