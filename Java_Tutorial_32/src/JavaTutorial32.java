import java.io.*;

public class JavaTutorial32 {
	
	public static void main(String[] args) {
		//create an array of type Customer
		Customer[] customers = getCustomers();
		
		//PrintWriter is used to write characters to a file in this situation
		
		PrintWriter custOutput = createFile("C:/Code/Java/Java Youtube/Java_Tutorial_32/src/customers.txt");
		
		//enhanced for loop for arrays
		//cycles through all of the people in the customers array
		
		for(Customer person : customers) {
			createCustomers(person, custOutput);
		}
		
		//closes the connection to the PrintWriter
		custOutput.close();
		getFileInfo();
	}
	
	//class that defines all the fields for my customers
	private static class Customer {
		public String firstName, lastName;
		public int custAge;
		
		//constructor that's called when a customer is made
		
		public Customer(String firstName, String lastName, int custAge) {
			this.firstName = firstName;
			this.lastName = lastName;;
			this.custAge = custAge;
		}
	}
	
	//creates an array of customer objects 
	private static Customer[] getCustomers() {
		Customer[] customers = new Customer[5];
		
		customers[0] = new Customer("John", "Smith", 21);
		customers[1] = new Customer("Sally", "Smith", 30);
		customers[2] = new Customer("Paul", "Ryan", 21);
		customers[3] = new Customer("Mark", "Jacobs", 21);
		customers[4] = new Customer("Steve", "Nash", 21);
		
		return customers;
	}
	
	//create the file and the PrintWriter that will write to the file
	private static PrintWriter createFile(String fileName) {
		try {
			//creates a File object that allows you to work with files on the hard drive 
			File listOfNames = new File(fileName);
			
			//FileWriter is used to write streams of character to a file
			//BufferedWRiter gathers a bunch of characters and then writes
			//them all at one time (Speeds up the program)
			//PrintWriter is used to write characters to the console, file
			
			PrintWriter infoToWrite = new PrintWriter(new BufferedWriter(new FileWriter(listOfNames)));
			return infoToWrite;
		}
		
		//you have to catch this when you call FileWriter
		catch(IOException e) {
			System.out.println("An I/O Error Occured");
			
			//Closes the program
			System.exit(0);
		}
		return null;
	}
	
	//Create a string with the customer info and write it to the file
	private static void createCustomers(Customer customer, PrintWriter custOutput) {
		//Create the String that contains the customer info
		String custInfo = customer.firstName + " " + customer.lastName + " ";
		custInfo += Integer.toString(customer.custAge);
		
		//Writes the string to the file
		custOutput.println(custInfo);
	}
	
	//read info from the file and write it to the screen
	private static void getFileInfo() {
		System.out.println("Info Written to File\n");
		
		//Open a new connection to the file
		File listOfNames = new File("C:/Code/Java/Java Youtube/Java_Tutorial_32/src/customers.txt");
		
		try {
			//FileReader reads character files
			//BufferedReader reads as many characters as possible 
			@SuppressWarnings("resource")
			BufferedReader getInfo = new BufferedReader(new FileReader(listOfNames));
			
			//Reads a whole line from the file and saves it in a String
			String custInfo = getInfo.readLine();
			
			//readline returns null when the end of the file is reached
			while(custInfo != null) {
				//System.out.println(custInfo)
				//break lines into pieces
				String[] indivCustData = custInfo.split(" ");
				
				//Convert the String into an integer with parseInt
				int custAge = Integer.parseInt(indivCustData[2]);
				System.out.print("Customer " + indivCustData[0] + " is " + custAge + "\n");
				
				custInfo = getInfo.readLine();
			}
		}
		//can be thrown by FileReader
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
