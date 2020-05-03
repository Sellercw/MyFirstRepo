import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * 
 * @author sellercw
 *
 */
public class Project02Driver {
	
	/**
	 * reads a text file and makes an array of accounts
	 * @param fileName A string variable of the file name
	 * @return returns an array of account objects
	 * @throws FileNotFoundException throws an exception if no file exists
	 */
	public static Account[] readAccountsFromFile(String fileName) throws FileNotFoundException {
		Scanner in = new Scanner(new File(fileName));
		Account[] finalData = new Account[10];
		int i =0;
		while (in.hasNextLine()) {
			String next = in.nextLine();
			String[] data = next.split(",");	
			String name = data[2];
			String[] address = data[3].split(" ");
			int streetNumber = Integer.parseInt(address[1]);
			String streetName = address[1];
			String city = data[4];
			String state = data[5];
			String zipCode = data[6];
			String ssn = data[7];
			Double balance = Double.parseDouble(data[8]);
			Address a1= new Address(streetNumber, streetName, city, state, zipCode);
			Customer c1 = new Customer(name, a1, ssn);
		    Account ac1 = new Account(c1, balance);	
			finalData[i]= ac1;
			i++;
		}
		
		return finalData;
	}
	/**
	 * writes the accounts to a file 
	 * @param accounts an array of all the accounts made
	 * @param fileName a string variable of the file name
	 * @return returns true if the file was able to be written, false if not 
	 * @throws FileNotFoundException throws an exception if there is an error
	 */
	public static boolean writeAccountsToFile(Account[] accounts, String fileName) throws FileNotFoundException{
		File out = new File(fileName);
		PrintWriter write = new PrintWriter(out);
		if(out.exists()) {
			for (Account a : accounts) 
	            write.println(a);
			write.close();
			return true;
		}
		return false;
		
	}
	/**
	 * main method for testing other methods and objects
	 * @param args String array
	 * @throws FileNotFoundException throws an error if file is not found
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Address a1 = new Address(5095,"tricia rae ln", "stow", "ohio", "44224");
		Customer c1 = new Customer("Colin", a1, "123-45-6789");
		Account ac1 = new Account(c1, 120000.00);
		Account[] accounts = readAccountsFromFile("accounts.txt");
		if(writeAccountsToFile(accounts, "output.txt")) 
			System.out.println("The file was written");
		else
			System.out.println("The file was not written");
	}

}
