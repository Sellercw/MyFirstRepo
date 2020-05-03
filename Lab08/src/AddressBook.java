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

/**
 * 
 * @author sellercw
 *
 */
public class AddressBook extends JFrame implements ActionListener{
	JLabel nameLabel, addressLabel, phoneLabel, emailLabel;
	JTextField nameTF, addressTF, phoneTF, emailTF;
	JButton addButton, saveButton;
	JTextArea contactTA;
	/**
	 * Constructor that sets up our pannel to create contacts
	 */
	public AddressBook() {
		nameLabel = new JLabel("Name      ");
		addressLabel = new JLabel("Address ");
		phoneLabel = new JLabel("Phone     ");
		emailLabel = new JLabel("Email      ");
		
		nameTF = new JTextField(50);
		addressTF = new JTextField(50);
		phoneTF = new JTextField(50);
		emailTF = new JTextField(50);
		
		addButton = new JButton("Add contact");
		addButton.addActionListener(this);
		saveButton = new JButton("Save to file");
		saveButton.addActionListener(this);
		
		contactTA = new JTextArea(20,50);
		
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
		panel.add(saveButton);
		panel.add(contactTA);
	
		this.add(panel);
		readContactFromFile();
		
	}
	/**
	 * main method for creating an address book
	 * @param args
	 */
	public static void main(String[] args) {
		AddressBook x = new AddressBook();
		x.setTitle("Address Book");
		x.setDefaultCloseOperation(EXIT_ON_CLOSE);
		x.setSize(670,540);
		x.setVisible(true);
	}
	@Override
	/**
	 * Action preformer for both buttons add contact and save to file. 
	 */
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//code for the add contact button, adds the contact to the Text area and clears text boxes
		if(e.getActionCommand().equals("Add contact")) {
			contactTA.append(nameTF.getText() + ", " + addressTF.getText() + ", " + phoneTF.getText() + ", " + emailTF.getText() + "\n");
			nameTF.setText("");
			addressTF.setText("");
			phoneTF.setText("");
			emailTF.setText("");
		}
		//code for the save to file button that calls the write contact method that writes the contacts to a file
		else if(e.getActionCommand().equals("Save to file")) {
			//contactTA.setText("Save to file has been clicked");
			try {
				writeContactToFile();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		
	}
	/**
	 * Writes all the contacts found in the text area to a file.
	 * @throws FileNotFoundException if contacts is not found and exception is thrown
	 */
	public void writeContactToFile() throws FileNotFoundException {
		File out = new File("contacts.txt");
		PrintWriter pw = new PrintWriter(out);
		String str = this.contactTA.getText();
		pw.println(str);
		pw.close();
	}
	/**
	 * reads the contacts from a file and outputs them to the text area. 
	 */
	public void readContactFromFile() {
		File read = new File("contacts.txt");
		try {
			Scanner in = new Scanner(read);
			while(in.hasNextLine()) 
				this.contactTA.append(in.nextLine() + "\n");
			in.close();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
