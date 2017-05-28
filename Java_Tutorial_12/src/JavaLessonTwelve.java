import java.util.Arrays;
import java.util.LinkedList;


public class JavaLessonTwelve {

	static DottedLineBreaker breaker = new DottedLineBreaker();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList linkedListOne = new LinkedList();
		
		LinkedList<String> names = new LinkedList<String>();
		
		names.add("Ahmed Bennani");
		names.add("Ali Syed");
		
		names.addLast("Nathan Martin");
		
		names.addFirst("Joshua Smith");
		
		names.add(0,"Noah Peters");
		
		names.set(2, "Paul Newman");
		
		names.remove(4);
		names.remove("Joshua Smith");
		
		for(String name : names) {
			
			System.out.println(name);
			
		}
		breaker.dot();
		///////////////////////////////////
		System.out.println("First Index: " + names.get(0));
		breaker.dot();
		///////////////////////////////////
		System.out.println("Last Index: " + names.getLast());
		breaker.dot();
		///////////////////////////////////
		LinkedList<String> namesCopy = new LinkedList<String>(names);
		
		System.out.println("namesCopy: " + namesCopy);
		breaker.dot();
		///////////////////////////////////
		if(names.contains("Noah Peters"))
		{
			System.out.println("Noahs Here");
			breaker.dot();
		}
		///////////////////////////////////
		if(names.containsAll(namesCopy))
		{
			System.out.println("Collections the Same");
			breaker.dot();
		}
		///////////////////////////////////
		System.out.println("Ali index at: " + names.indexOf("Ali Syed"));
		breaker.dot();
		///////////////////////////////////
		System.out.println("List Empty: " + names.isEmpty());
		breaker.dot();
		///////////////////////////////////
		System.out.println("How many: " + names.size());
		breaker.dot();
		///////////////////////////////////
		System.out.println("Look without Error: " + names.peek());
		breaker.dot();
		///////////////////////////////////
		System.out.println("Remove first element: " + namesCopy.poll());
		breaker.dot();
		///////////////////////////////////
		System.out.println("Remove last element: " + names.pollLast());
		breaker.dot();
		///////////////////////////////////
		namesCopy.push("Noah Peters");
		namesCopy.pop();
		
		for(String name : namesCopy)
		{
			System.out.println(name);
		}
		breaker.dot();
		/////////////////////////////////////
		Object[] nameArray = new Object[4];
		
		nameArray = names.toArray();
		
		System.out.println(Arrays.toString(nameArray));
		breaker.dot();
		/////////////////////////////////////
		names.clear();
	}

}
