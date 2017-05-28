import java.util.Scanner;

public class JavaLessonFive {

	static double myPI = 3.14159; // Class Variable
	static int randomNumber; // Class Variable

	static Scanner userInput = new Scanner(System.in);
	static DottedLineBreaker breaker = new DottedLineBreaker(); // breaks between different concepts
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//accessModifier static returnType methodName ()
		
		System.out.println(addThem(1,2));
		
		System.out.println("Global " + myPI);
		breaker.dot();
		
		int d = 5;
		tryToChange(d);
		System.out.println("main d = " + d);
		breaker.dot();
		
		//random number guessing
		System.out.println(getRandomNum());
		
		int guessResult = 1;
		int randomGuess = 0;
		
		while (guessResult != -1)
		{
			System.out.print("Guess a number betweeen 0 and 50: ");
			
			randomGuess = userInput.nextInt();
			
			guessResult = checkGuess(randomGuess);
		}
		
		System.out.println("Yes the random number is " + randomGuess);
		breaker.dot();
		
	}
	
	public static int getRandomNum ()
	{
		randomNumber = (int) (Math.random() * 51);
		return randomNumber;
	}
	
	public static int checkGuess(int guess)
	{
		if (guess == randomNumber)
		{
			return -1;
		}
		else 
		{
			return guess;
		}
	}
	
	public static void tryToChange (int d) // new value of d
	{
		d = d + 1;
		System.out.println("tryToChange d = " + d);
	}
	
	
	public static int addThem(int a, int b)
	{
		double smallPI = 3.140; //local variable
		
		myPI = myPI + 3.0;
		
		System.out.println("Local " + smallPI);
		
		int c = a + b;
		return c; 
	}

}
