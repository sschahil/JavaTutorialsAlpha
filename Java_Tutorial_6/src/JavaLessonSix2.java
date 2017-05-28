import java.util.*;

public class JavaLessonSix2 {
	
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("How old are you? ");
		int age = checkValidAge();
		
		if (age != 0)
		{
			System.out.println("You are " + age + " years old");
		}
	}
	
	public static int checkValidAge() {
		
		try
		{
			return userInput.nextInt();
		}
		
		catch (InputMismatchException e)
		{
			userInput.next(); // skips over last user input
			System.out.print("That isn't a whole number");
			return 0;
		}
	}
}
