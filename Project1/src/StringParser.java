import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 * 	StringParser takes an input file, parse all the words and write them to different files. 
 *   @author sellercw
 *
 */
public class StringParser {
	
	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);		
		System.out.print("Enter input filename: ");
		String file = input.next();
		File infile = new File(file);
		//checks to see if entered file exists
		if(infile.exists()) {
			System.out.print("Found.");
		}
		else {
			System.out.println("File does not exist. Goodbye.");
			System.exit(0);
		}
		System.out.println(" What do you want to output? \n 1. Raw word list \n 2. Palindromes \n 3. $100 words");
		System.out.print("Choose: ");
		int choice = input.nextInt();
		switch(choice) {
		case 1 : 
			System.out.print("Enter output filename: ");
			String name1 = input.next();
			File out1 = new File(name1);
			rawOutput(infile, out1);
			break;
		case 2: 
			System.out.print("Enter output filename: ");
			 String name2 = input.next();
			 File out2 = new File(name2); 
			 palindromeOutput(infile, out2);
			 break;
		case 3: 
			System.out.print("Enter output filename: ");
			String name3 = input.next();
			File out3 = new File(name3);
			hundredDollarWordOutput(infile, out3);
			break;
		default :
			System.out.println("Please enter a value between 1-3.");
		}
		input.close();
	}
	/**
	 * RawOutput makes a new file of each word on a separate line, including punctuation.
	 * @param in Input file that is read and split into separate lines. 
	 * @param out The created file made 
	 */
	 public static void rawOutput(File in, File out) {
		 try {
			 PrintWriter output = new PrintWriter(out);
			 Scanner in1 = new Scanner(in);
			 //writes parsed words to a new file.
			 while(in1.hasNext()) {
				 String next = in1.next();
				 output.println(next);
			 }
			 in1.close();
			 output.close();
			 System.out.println("Finished printing raw word list.");
		 }
		 catch (FileNotFoundException e) {
			 e.printStackTrace();
			 System.out.println("Problem in creating the file");
		 }
	 }
	 /**
	  * Checks if words in a file are palindromes and outputs them into a new file. 
	  * @param in File read and checked for possible palindromes. 
	  * @param out output file created consisting of a list of palindrome words found. 
	  */
	 public static void palindromeOutput(File in,File out) {
		 try {
			 PrintWriter output = new PrintWriter(out);
			 Scanner in1 = new Scanner(in);
			 ArrayList<String> line = new ArrayList<String>();
			 //cleans the words in the files and add them to an ArrayList
			 while(in1.hasNext()) {
				 String next = in1.next();
				 next = cleanup(next);
				 if(isPalindrome(next)) {
					 line.add(next);
				 }	 
			 }
			 //sorts and removes duplicates and adds final list to the file.
			 ArrayList<String>newline = new ArrayList<String>();
			 Collections.sort(line);
			 for(String temp : line)
			 {
				 if(!newline.contains(temp)) {
					 newline.add(temp);
					 output.println(temp);
				 }
			 }
			 in1.close();
			 output.close();
			 System.out.println("Finished printing palindromes.");
		 }
		 catch (FileNotFoundException e) {
			 e.printStackTrace();
			 System.out.println("Problem in creating the file");
		 }
	 }
	 /**
	  * Checks file for $100 words and writes to a new file in alphabetical order and without repeats. 
	  * @param in File read and checked for possible $100 words.
	  * @param out output file created consisting of all $100 words found from the in file. 
	  */
	 public static void hundredDollarWordOutput(File in, File out) {
		 try {
			 PrintWriter output = new PrintWriter(out);
			 Scanner in1 = new Scanner(in);
			 ArrayList<String> line = new ArrayList<String>();
			 //cleans up words from the file and adds them to an ArrayList.
			 while(in1.hasNext()) {
				 String next = in1.next();
				 next = cleanup(next);
				 if(wordValue(next) == 100) {
					 line.add(next);
				 }
			 }
			 //Sort list and add to file
			 ArrayList<String>newline = new ArrayList<String>();
			 Collections.sort(line);
			 for(String temp : line)
			 {
				 if(!newline.contains(temp)) {
					 newline.add(temp);
					 output.println(temp);
				 }
			 }
			 in1.close();
			 output.close();
			 System.out.println("Finished printing $100 words.");
		 }
		 catch (FileNotFoundException e) {
			 e.printStackTrace();
			 System.out.println("Problem in creating the file");
		 }
	 }
	 /**
	  * 
	  * @param word checks a string to see if it is a palindrome.
	  * @return returns true if the string is the same forward as it is backwards.
	  */
	 public static boolean isPalindrome(String word) {
		 for(int i = 0; i <word.length() /2; i++) {
			 if(word.charAt(i) != word.charAt(word.length()-1-i)){
				 return false;
			 } 
		 }
		 return true;
	 }
	 /**
	  * 
	  * @param word takes a string and removes all non-letters and capitalizes the string. 
	  * @return returns a string in all caps with no spaces or non-letter characters.
	  */
	 public static String cleanup(String word) {
		 String word1 = "";
		 String word2 = "";
		 for(int i = 0; i < word.length(); i++) {
			 word1 += word.charAt(i);
			 if(word1.matches("[a-zA-Z]+")) {
				 word2 += word1;
			 }
			 word1 = "";
		 }
		 return word2.toUpperCase();
	 }
	 /**
	  * 
	  * @param Takes a string and evaluates the sum of the letters.
	  * @return returns the value of all the letters in the word added together. 
	  */
	 public static int wordValue(String word) {
		 int count = 0;
		 for(int i = 0; i < word.length(); i++) {
			 count = count + (word.charAt(i) - 'A' +1); 
		 }
		 return count;
	 }
}