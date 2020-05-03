import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author sellercw
 *
 */
public class AddressBook extends Contact{
	static Scanner in = new Scanner(System.in);
	static ArrayList<Contact> addressList = new ArrayList<Contact>();
	private static Contact addContact = null;

	/**
	 * constructor
	 * @param first a string variable
	 * @param last a string variable
	 * @param phone a string variable
	 * @param email a string variable
	 * @param address a string variable
	 */
	public AddressBook(String first, String last, String phone, String email, String address) {
		super.setFirstName(first);
		super.setLastName(last);
		super.setPhone(phone);
		super.setEmail(email);
		super.setAddress(address);
	}

	/**
	 * main method
	 * @param args
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
		boolean isTrue = true;
		System.out.print("Address Book Operations: \n 1) Add \n 2) Remove \n 3) Save \n 4) load \n 5) Display All \n 6) Search \n 7) Exit \n");
		while(isTrue){
			System.out.print("Select an option(number): ");
			int choice = in.nextInt();
			switch (choice){
			case 1:
				Add();
				break;
			case 2: 
				Remove();
				break;
			case 3:
				Save();
				break;
			case 4: 
				Load();
				break;
			case 5:
				displayAll();
				break;
			case 6:
				Search();
				break;
			case 7: 
				Save(); 
				isTrue = false;
				break;
			}
		}
	}

	public static void Search() {
		System.out.println("Search: ");
		String ch = in.nextLine();

		for(Contact k : addressList) {
			String tempo = k.toString();

			if(tempo.contains(ch)){
				System.out.println(tempo);
			}
		}
	}

	/**
	 * load method
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	private static void Load() throws FileNotFoundException, IOException, ClassNotFoundException{
		try {
			ObjectInputStream inp = new ObjectInputStream(new FileInputStream("addressbook.dat"));
			System.out.println("Loading file");
			ArrayList<Contact> readObject = (ArrayList<Contact>)inp.readObject();
			addressList = readObject;
			inp.close();
		}

		catch(IOException e){
			e.printStackTrace();
		}
	}

	/**
	 * displayAll method
	 */
	public static void displayAll() {
		for(Contact i : addressList) {
			System.out.println(i.toString());
		}	
	}

	/**
	 * Save method
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static void Save() throws FileNotFoundException, IOException {
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("addressbook.dat"));
			out.writeObject(addressList);
			out.close();
			System.out.println("Contacts Saved");
		}

		catch(IOException e){
			e.printStackTrace();
		}
	}

	/**
	 * Remove method
	 */
	public static void Remove() {
		System.out.println("Please enter the First Name of the Contact you wish to remove: ");
		String tempName = in.nextLine();
		Contact tempCon = null;

		for (int i=0; i<addressList.size(); i++){
			tempCon = addressList.get(i);
			if(tempName.equals(tempCon.getFirstName())){
				addressList.remove(i);
			}
		}
	}

	/**
	 * Add method
	 */
	public static void Add() {
		System.out.println("--Please enter Contact information--");
		System.out.print("First name:");
		String first = in.next();
		System.out.print("Last Name: ");
		String last = in.next();
		System.out.print("Address : ");
		String address = in.next();
		System.out.print("Email : ");
		String email = in.next();
		System.out.print("Phone : ");
		String phone = in.next();
		AddressBook addressNew = new AddressBook(first,last,address,email,phone);
		addressList.add(addressNew);
		System.out.println("Succesfully Added");
	}
}
