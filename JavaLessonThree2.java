
public class JavaLessonThree2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ternary Operator
		int valueOne = 1;
		int valueTwo = 2;
		
		int biggestValue = (valueOne > valueTwo) ? valueOne : valueTwo;
		
		System.out.println(biggestValue);
		
		//Switch Operation
		char theGrade = 'b';
		
		switch(theGrade) // checks switch statements to theGrade value
		{
		case 'a':
		case 'A':
			System.out.println("Great Job");
			break; // takes you out of switch loop
		case 'b':
		case 'B':
			System.out.println("Good Job");
			break; // takes you out of switch loop
		case 'c':
		case 'C':
			System.out.println("Ok Job");
			break; // takes you out of switch loop
		case 'd':
		case 'D':
			System.out.println("Bad Job");
			break; // takes you out of switch loop
			
		default:
			System.out.println("You Failed");
			break; // takes you out of switch loop
		}
		
	}

}
