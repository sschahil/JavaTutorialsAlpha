import java.io.*;

public class JavaLessonSix3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getAFile("./somestuff.txt");
		
	}
	
	public static void getAFile(String fileName) {
		
		try
		{
			FileInputStream file = new FileInputStream(fileName);
		}
		
		catch (FileNotFoundException e)
		{
			System.out.println("Sorry can't find file.");
		}
		
		catch (IOException e)
		{
			System.out.println("Unknown IO Error");
		}
		
		// catch(ClassNotFoundException | IOException e) {} 
		
		catch (Exception e)
		{
			System.out.println("Some error occured");
		}
		
		finally {
			
			System.out.println("Finally");
		}
	}
}
