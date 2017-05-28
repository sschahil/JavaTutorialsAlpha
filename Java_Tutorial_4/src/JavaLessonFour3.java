import java.util.Scanner;

public class JavaLessonFour3 {

	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String contYorN = "Y";
		
		int h = 1;
		
		while (contYorN.equalsIgnoreCase("y"))
		{
			System.out.println(h);
			System.out.print("Continue y or n? ");
			contYorN = userInput.nextLine();
			
			h++;
		}
		
	}

}
