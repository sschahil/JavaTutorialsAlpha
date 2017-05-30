import java.util.regex.*;

public class JavaLessonNineteen {

	static DottedLineBreaker breaker = new DottedLineBreaker();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String longString = " Derek Banas CA AK 12345 PA (412)555-1212 johnsmith@hotmail.com 412-555-1234 412 555-1234";
		String strangeString = " 1Z aaa **** *** {{{ {{ { ";
		
		//Word that is 2 to 20 characters in length
		
		//[A-Za-z]{2,20}  \\w{2,20}
		
		regexChecker("\\s[A-Za-z]{2,20}\\s", longString);
		breaker.dot();
		
		regexChecker("\\s\\d{5}\\s", longString);
		breaker.dot();
		
		regexChecker("A[KLRZ]|C[AOT]", longString);
		breaker.dot();
		
		regexChecker("(\\{{1,})", strangeString);
		breaker.dot();
		
		regexChecker("(\\{+)", strangeString);
		breaker.dot();
		
		regexChecker(".{3}", strangeString);
		breaker.dot();
		
		regexChecker("(\\w*)", strangeString);
		breaker.dot();
		
		//email
		regexChecker("[A-Za-z0-9.%-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}", longString);
		breaker.dot();
		
		//phone number
		regexChecker("([0-9]( |-)?)?(\\(?[0-9]{3}\\)?|[0-9]{3})( |-)?([0-9]{3}( |-)?[0-9]{4}|[a-zA-Z0-9]{7})", longString);
		breaker.dot();
		
		regexReplace(longString);
		breaker.dot();
	}	
	
	public static void regexChecker(String theRegex, String str2Check) {
		
		Pattern checkRegex = Pattern.compile(theRegex);
		
		Matcher regexMatcher = checkRegex.matcher(str2Check);
		
		while(regexMatcher.find())
		{
			if(regexMatcher.group().length() != 0) 
			{
				System.out.println(regexMatcher.group().trim());
			}
			
			System.out.println("Start index: " + regexMatcher.start());
			System.out.println("End index: " + regexMatcher.end());
		}
		
	}
	
	public static void regexReplace(String str2Replace) {
		
		Pattern replace = Pattern.compile("\\s+");
		
		Matcher regexMatcher = replace.matcher(str2Replace.trim());
		
		System.out.println(regexMatcher.replaceAll(", "));
		
	}

}
