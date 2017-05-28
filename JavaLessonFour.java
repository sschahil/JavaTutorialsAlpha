
public class JavaLessonFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 1;
		
		while (i <= 20)
		{
			if(i == 3)
			{
				i += 2;
				continue;
			}
			
			System.out.println(i);
			i++;
			
			//print odd numbers
			if((i%2) == 0)
			{
				i++;
			}
			
			if (i > 10)
			{
				break;
			}
		}
		
	}

}
