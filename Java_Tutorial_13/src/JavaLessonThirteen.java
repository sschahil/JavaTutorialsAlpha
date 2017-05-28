import java.util.Arrays;


public class JavaLessonThirteen {
	
	static DottedLineBreaker breaker = new DottedLineBreaker();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String randomString = "I'm just a randomstring";
		
		String gotToQuote = "He said, \"I'm here\"";
		
		int numTwo = 2;
		
		System.out.println(randomString + " " + gotToQuote + " " + numTwo);
		breaker.dot();
		
		
		String uppercaseStr = "BIG";
		String lowercaseStr = "big";
		
		if(uppercaseStr.equals(lowercaseStr))
		{
			System.out.println("They are equal.(1)");
			breaker.dot();
		}
		if(uppercaseStr.equalsIgnoreCase(lowercaseStr))
		{
			System.out.println("They are equal.(2)");
			breaker.dot();
		}
		
		String letters = "abcde";
		String moreLetters = "fghijk";
		
		System.out.println("2nd char: " + letters.charAt(1));
		breaker.dot();
		
		System.out.println(letters.compareTo(moreLetters));
		breaker.dot();
		
		System.out.println(letters.contains("abc"));
		breaker.dot();
		
		System.out.println(letters.endsWith("de"));
		breaker.dot();
		
		System.out.println(letters.indexOf("cd"));
		breaker.dot();
		
		System.out.println("Length: " + letters.length());
		breaker.dot();
		
		System.out.println(letters.replace("abc", "xy"));
		breaker.dot();
		
		String[] letterArray = letters.split("");
		
		System.out.println(Arrays.toString(letterArray));
		breaker.dot();
		
		char[] charArray = letters.toCharArray();
		
		System.out.println(Arrays.toString(charArray));
		breaker.dot();
		
		System.out.println(letters.substring(1, 4));
		breaker.dot();
		
		System.out.println(letters.toLowerCase());
		breaker.dot();
		
		String randString = "       abkljsdk    ";
		System.out.println(randString.trim());
		breaker.dot();
		
		StringBuilder randSB = new StringBuilder("A random value");
		
		System.out.println(randSB.append(" again"));
		breaker.dot();
		
		System.out.println(randSB);
		breaker.dot();
		
		System.out.println(randSB.capacity());
		breaker.dot();
		
		randSB.ensureCapacity(60);
		
		System.out.println(randSB.capacity());
		breaker.dot();
		
		System.out.println(randSB.length());
		breaker.dot();
		
		randSB.trimToSize();
		
		System.out.println(randSB.capacity());
		breaker.dot();
		
		System.out.println(randSB.insert(1, "nother"));
		breaker.dot();
		
		//String oldSB = randSB.toString();
		
		
	}

}
