import java.io.*;

public class JavaTutorial33 {
	public static void main(String[] args) {
		//Create an array of type Customer
		Customer[] customers = getCustomers();
		
		//A DataOutputStream allows you to print primitive data types to a file
		
		DataOutputStream custOutput = createFile("C:/Code/Java/Java Youtube/Java_Tutorial_33/src/customers.dat");
		
		//Enhanced for loop for arrays
		//Cycles through all of the people in the customers array
		for(Customer person : customers) {
			createCustomers(person, custOutput);
		}
		
		//closes the connection to the DataOutputStream
		try {
			custOutput.close();
		} catch (IOException e) {
			System.out.println("An I/O error Occured");
			
			//Closes the program
			System.exit(0);
		}
		getFileInfo();
	}
	
	//class that defines all the fields for my customers
	
	private static class Customer {
		public String custName;
		public int custAge;
		public double custDebt;
		public boolean oweMoney;
		public char custSex;
		
		//constructor that's called when a customer is made
		
		public Customer(String custName, int custAge, double custDebt, boolean oweMoney, char custSex) {
			this.custName = custName;
			this.custAge = custAge;
			this.custDebt = custDebt;
			this.oweMoney = oweMoney;
			this.custSex = custSex;
		}
	}
	
	//Creates an array of Customer Objects
	private static Customer[] getCustomers() {
		Customer[] customers = new Customer[5];
		
		customers[0] = new Customer("John Smith", 21, 12.25, true, 'M');
		customers[1] = new Customer("Sally Smith", 30, 2.25, true, 'F');
		customers[2] = new Customer("Paul Ryan", 21, 0, false, 'M');
		customers[3] = new Customer("Mark Jacobs", 21, 3.25, true, 'M');
		customers[4] = new Customer("Steve Nash", 21, 5.25, true, 'M');
		
		return customers;
	}
	
	//Create the file and the DataOutputStream that will write to the file
	private static DataOutputStream createFile(String fileName) {
		try {
			//Creates a File object that allows you to work with files on the hard drive.
			//There is no difference between File for character for binary stream writing, or reading
			
			File listOfNames = new File(fileName);
			
			//FileOutputStream is used to write streams of data to a file
			//You define whether a new file is created versus appended to based on if you add a boolean to the FileOutputStream
			//FileOutputStream(file, true) : Appends to the file
			//FileOutputStream(file, false) : Creates a new file
			
			//BufferedOutputStream gathers all the data and then writes it all at one time (Speeds up the Program)
			//DataOutputStream is used to write primitive data to the file
			
			DataOutputStream infoToWrite = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(listOfNames)));
			return infoToWrite;
		} 
		//You hav to catch this when you call FileWriter
		catch(IOException e) {
			System.out.println("An I/O Error Occured");
			//Closes the program
			System.exit(0);
		}
	
		return null;
	}
	
	//Create a string with the customer info and write it to the file
	private static void createCustomers(Customer customer, DataOutputStream custOutput) {
		
		try {
			//Write primitive data to the file
			//Writes a String in UTF format
			custOutput.writeUTF(customer.custName);
			
			//Writes an Integer
			custOutput.writeInt(customer.custAge);
			
			//Writes a Double
			custOutput.writeDouble(customer.custDebt);
					
			//Writes a Boolean
			custOutput.writeBoolean(customer.oweMoney);
			
			//Writes a Character
			custOutput.writeChar(customer.custSex);
			
			//You also have writeByte, writeFloat, writeLong, and writeShort
		}
		
		catch(IOException e) {
			System.out.println("An I/O Error Occured");
			System.exit(0);
		}
	}
	
	//Read info from the file and write it to the screen
	private static void getFileInfo() {
		
		System.out.println("Info Written to File\n");
		
		//Open a new connection to the file
		File listOfNames = new File("C:/Code/Java/Java Youtube/Java_Tutorial_33/src/customers.dat");
		
		boolean eof = false;
		
		try {
			//A DataOutputStream object has the methods for reading the data
			//The BufferedInputStream gathers the data in block 
			//FileInputStream gets data from the file
			
			DataInputStream getInfo = new DataInputStream(new BufferedInputStream(new FileInputStream(listOfNames)));
			//using a while loop that pulls data until EOFException is thrown
			
			while(!eof) {
				//you have to read data in the exact order it was put in the file
				
				String custName = getInfo.readUTF();
				int custAge = getInfo.readInt();
				double custDebt = getInfo.readDouble();
				boolean oweMoney = getInfo.readBoolean();
				char custSex = getInfo.readChar();
				
				System.out.println(custName);
				System.out.println(custAge);
				System.out.println(custDebt);
				System.out.println(oweMoney);
				System.out.println(custSex + "\n");
			}
		}
		
		catch(EOFException e) {
			eof = true;
		}
		catch(FileNotFoundException e) {
			System.out.println("Couldn't Find the File");
			System.exit(0);
		}
		catch(IOException e) {
			System.out.println("An I/O Error Occured");
			System.exit(0);
		}
	}
}
