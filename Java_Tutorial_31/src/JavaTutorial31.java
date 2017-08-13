import java.io.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class JavaTutorial31 extends JFrame{
	static String filePath, parentDirectory;
	static File randomDir, randomFile, randomFile2;
	
	public static void main(String[] args) {
		//Creates a file object in memory
		randomDir = new File("C:/Code/Java/Java Youtube/Java_Tutorial_31");
		
		//Make a directory
		randomDir.mkdir();
		
		//Make a file named random.txt
		
		randomFile = new File("random.txt");
		
		//Make a file and define where to save it in the file system
		
		randomFile2 = new File("C:/Code/Java/Java Youtube/Java_Tutorial_31/random2.txt");
		
		//createNewFile and getCanonicalPath have to be called in a try block to catch IOException
		
		try{
			//createNewFile creates the file in the file system
			randomFile.createNewFile();
			randomFile2.createNewFile();
			
			//returns the path for the file
			
			filePath = randomFile.getCanonicalPath();
		} catch (IOException e) {
			//You have to catch the IOException
			e.printStackTrace();
		}
		
		//check to see if the file exists in the current directory
		if(randomFile.exists()) {
			System.out.println("File Exists");
			System.out.println("File is readable: " + randomFile.canRead());
			System.out.println("File is writeable: " + randomFile.canWrite());
			System.out.println("File location: " + filePath);
			System.out.println("File name: " + randomFile.getName());
			
			//Since the file was created without defining a path this returns null
			System.out.println("Parent directory: " + randomFile.getParent());
			
			//This returns the parent because it was defined
			parentDirectory = randomFile2.getParent();
			System.out.println("File Two Parent Directory: " + parentDirectory);
			System.out.println("Is this a directory: " + randomDir.isDirectory());
			
			//List provides a string array containing all the files
			String[] filesInDir = randomDir.list();
			System.out.println("Files in Java_Tutorial_31 Directory\n");
			
			//Use the enhanced for loop to cycle through the files
			
			for(String fileName : filesInDir) {
				System.out.println(fileName + "\n");
			}
			
			System.out.println("Is this a file: " + randomFile.isFile());
			System.out.println("Is this hidden: " + randomFile.isHidden());
			
			//Milliseconds since Jan 1, 1970 when modified
			System.out.println("Last Modified: " + randomFile.lastModified());
			
			//Return size of file
			System.out.println("Size of file: " + randomFile.length());
			
			//Changes the name of the file
			randomFile2.renameTo(new File("C:/Code/Java/\"Java Youtube\"/Java_Tutorial_31/Random/random3.txt"));
			
			//output the full path for the file unless the path wasn't defined when the File was created
			System.out.println("New Name: " + randomFile2.toString());
			
			new JavaTutorial31();
		} else {
			System.out.println("File Doesn't Exist");
		}
		
		//You call delete to delete a file
		
		if(randomFile.delete()) {
			System.out.println("File Deleted");
		}
		
		//I could get an array of File objects from the directory
		
		File[] filesInDir = randomDir.listFiles();
		
		for(File fileName : filesInDir) {
			fileName.delete();
		}
		
		//You can only delete a directory if it is empty
		
		if(randomDir.delete()) {
			System.out.println("Directory Deleted");
		}
	}
	
	public JavaTutorial31() {
		//Creates a file chooser at the location specified 
		JFileChooser fileChooser = new JFileChooser(randomDir);
		
		//Opens the file chooser
		fileChooser.showOpenDialog(this);
	}
}
