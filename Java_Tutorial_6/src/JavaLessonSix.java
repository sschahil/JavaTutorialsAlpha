
public class JavaLessonSix {

	static DottedLineBreaker breaker = new DottedLineBreaker();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		divideByZero(2);
		
	}

	public static void divideByZero(int a) {
		
		try 
		{
			System.out.println(a/0);
			
		}
		
		catch (ArithmeticException e)
		{
			System.out.println("This operation cannot be done.");
			breaker.dot();
			System.out.println(e.getMessage());
			breaker.dot();
			System.out.println(e.toString());
			breaker.dot();
			e.printStackTrace();
			breaker.dot();
		}
	}
}
