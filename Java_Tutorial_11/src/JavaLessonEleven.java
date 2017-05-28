import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

public class JavaLessonEleven {

	static DottedLineBreaker breaker = new DottedLineBreaker();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList arrayListOne;
		
		arrayListOne = new ArrayList();
		
		ArrayList arrayListTwo = new ArrayList();
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("John Smith");
		names.add("Larry Smith");
		names.add("Bob Smith");
		
		names.add(2, "Jack Ryan");
		
		names.set(0, "John Adams");
		
		names.remove(3);
		
		for(int i = 0; i < names.size(); i++)
		{
			System.out.println(names.get(i));
		}
		breaker.dot();
		//names.removeRange(0,1)
		
		System.out.println(names);
		breaker.dot();
		for(String i: names)
		{
			System.out.println(i);
		}
		breaker.dot();
		Iterator indivItems = names.iterator();
		
		while(indivItems.hasNext())
		{
			System.out.println(indivItems.next());
		}
		breaker.dot();
		
		ArrayList namesCopy = new ArrayList();
		ArrayList nameBackup = new ArrayList();
		
		namesCopy.addAll(names);
		
		String paulYoung = "Paul Young";
		
		names.add(paulYoung);
		
		if(names.contains(paulYoung))
		{
			System.out.println("Paul is here!!");
			breaker.dot();
		}
		
		
		if(names.containsAll(namesCopy))
		{
			System.out.println("Everything in namesCopy is in names.(1)");
			breaker.dot();
		}
		if(names.containsAll(names))
		{
			System.out.println("Everything in namesCopy is in names.(2)");
			breaker.dot();
		}
		if(namesCopy.containsAll(names))
		{
			System.out.println("Everything in namesCopy is in names.(3)");
			breaker.dot();
		}
		
		names.clear();
		if(names.isEmpty())
		{
			System.out.println("ArrayList Empty");
			breaker.dot();
		}
		
		Object[] moreNames = new Object[4];
		moreNames = namesCopy.toArray();
		
		System.out.println(Arrays.toString(moreNames));
		
	}

}
