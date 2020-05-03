import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIO {
	public static Carnivora[] readCarnivoraFromFile(String fileName) throws FileNotFoundException {
		Scanner in = new Scanner(new File(fileName));
		int i = 0;
		Carnivora[] output = null;
		while(in.hasNextLine()) {
			String next = in.nextLine();
			String[] line = next.split(",");
			String name = line[0];
			int age = Integer.parseInt(line[1]);
			String type = line[2];
			boolean isWild = Boolean.parseBoolean(line[3]);
			output[i] = new Carnivora(name, age, type, isWild);
			i++;
		}
		return output;
	}
	public static boolean writeCarnivoraToFile(Carnivora[] carnivoras, String fileName) throws FileNotFoundException {
		File output = new File(fileName);
		PrintWriter out = new PrintWriter(output); 
		if(output.exists()) {
			for(int i = 0; i< carnivoras.length; i++) {
				out.println(carnivoras[i].toString());
			}
			out.close();
			return true;
		} 
		else
			out.close();
			return false;
	}
}
