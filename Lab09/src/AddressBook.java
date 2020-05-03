import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AddressBook extends JFrame implements ActionListener{

	JLabel nameLabel, addressLabel, phoneLabel, emailLabel;
	JTextField nameTF, addressTF, phoneTF, emailTF;
	JButton addButton, saveButton;
	JTextArea contactsTA;

	public AddressBook() {
		super("Address Book Application");
		nameLabel = new JLabel("Name:     ");
		addressLabel = new JLabel("Address:");
		phoneLabel = new JLabel("Phone:    ");
		emailLabel = new JLabel("Email:     ");
		nameTF = new JTextField(50);
		addressTF = new JTextField(50);
		phoneTF = new JTextField(50);
		emailTF = new JTextField(50);
		addButton = new JButton("Add Contact");
		saveButton = new JButton("Save to File");

		JPanel panel = new JPanel();

		panel.add(nameLabel);
		panel.add(nameTF);
		panel.add(addressLabel);
		panel.add(addressTF);
		panel.add(phoneLabel);
		panel.add(phoneTF);
		panel.add(emailLabel);
		panel.add(emailTF);

		panel.add(addButton);
		addButton.addActionListener(this);

		panel.add(saveButton);
		saveButton.addActionListener(this);

		contactsTA = new JTextArea(20, 50);
		panel.add(contactsTA);
		this.add(panel);

		readContactsFromFile();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddressBook ab =  new AddressBook();
		ab.setSize(670, 550);
		ab.setDefaultCloseOperation(EXIT_ON_CLOSE);
		ab.setVisible(true);
	}

	public void readContactsFromFile(){
		// Declare a Scanner object to read from the file
		Scanner file = null;

		// Initialize the Scanner object using "numbers.txt" file
		// It will throw an FileNotFoundException if the file does not exist
		// We have to use a try-catch block to prevent unexpected exit from the program
		try {
			file = new Scanner(new File("contacts.txt"));
		} catch (FileNotFoundException e) {
			// Print the stack trace if there is a FileNotFound exception
			e.printStackTrace();
			// Unable to locate the file. We don't want to perform rest of the operations
			return;
		}

		// Loop until we read all the integers from the file
		// hasNextInt() method will return true if there is any integer left to read
		String str = "";
		while(file.hasNextLine()) {
			str += file.nextLine();
			if(file.hasNextLine())
				str += "\n";
		}
		file.close();
		contactsTA.setText(str);
	}

	public void writeContactsToFile() {
		// Declare an object PrintWriter object. It points to null
		PrintWriter pw = null;

		// Initialzie the PrintWriter object using a file named "contacts.txt"
		// It will create a file named "contacts.txt" if the file does not exist in the project folder
		// We have to use a try-catch block as the following statement can fail to create a file and crash our program
		try {
			pw = new PrintWriter(new File("contacts.txt"));
			pw.println(contactsTA.getText());
		} catch (FileNotFoundException e) {
			// Print the stack trace if there is a FileNotFound exception
			e.printStackTrace();
			// Unable to create file. We don't want to perform rest of the operations
			return;
		}

		pw.close();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getActionCommand().equals("Add Contact")) {
			contactsTA.append(nameTF.getText() + ", " + addressTF.getText() + ", " + phoneTF.getText() + ", " + emailTF.getText() + "\n");
			// reset textfields
			nameTF.setText("");
			addressTF.setText("");
			phoneTF.setText("");
			emailTF.setText("");
		}
		else if(arg0.getActionCommand().equals("Save to File")) {
			writeContactsToFile();
		}
	}



}
