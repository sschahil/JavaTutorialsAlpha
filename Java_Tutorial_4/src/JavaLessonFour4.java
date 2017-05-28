
public class JavaLessonFour4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k = 10;
		
		//executes code at least once
		do
		{
			System.out.println(k);
			k++;
		}while(k < 10);
		
		int a = 0;
		while(a < 30)
		{
			System.out.print("-");
			a++;
		}
		System.out.print("\n");
		a = 0;
		
		//for loop
		for (int l = 10; l >= 1; l--) // l only exists inside the for loop
		{
			System.out.println(l);
		}
		
		while(a < 30)
		{
			System.out.print("-");
			a++;
		}
		System.out.print("\n");
		a = 0;
		
		int m,n;
		for(m = 1, n = 2; m <= 9; m += 2, n += 2)
		{
			System.out.println(m + "\n" + n);
		}
		
	}

}
