import java.io.*;

public class JavaLessonSix4 {
		
	public static void main(String[] args) {
		
		try
		{
			getAFile("./somestuff.txt");
		}
		
		catch(IOException e)
		{
			System.out.println("An IO Error Occured.");
		}
	}
	
	public static void getAFile(String fileName) throws IOException, FileNotFoundException {
		
		FileInputStream file = new FileInputStream(fileName);
		
	}
	
}
