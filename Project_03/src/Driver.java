import java.io.*;
import java.util.*;

public class Driver {
	private static ArrayList<GameObject> list = new ArrayList<>();
	private static File gameFile = new File("gamedata.csv");
	private static File sorted = new File("sorted.csv");
	private static Scanner in = new Scanner(System.in);
	private static GameObject[] go;

	public static void createGames() throws FileNotFoundException {
		in = new Scanner(gameFile);

		while (in.hasNextLine()) {
			String allData = in.nextLine();
			String[] neededData = allData.split(",");
			int year = Integer.parseInt(neededData[3]);
			double sales = Double.parseDouble(neededData[10]);

			GameObject go = new GameObject(neededData[1], neededData[2], year, sales);
			list.add(go);
		}
		in.close();

	}

	public static void sortArray() {
		go = new GameObject[list.size()];
		for (int i = 0; i < list.size(); i++) {
			go[i] = list.get(i);
		}
		quickSort(go, 0, list.size() - 1);

	}

	public static void writeSorted() throws FileNotFoundException {
		PrintWriter write = new PrintWriter("sorted.csv");
		for (int i = 0; i < go.length; i++) {
			write.println(go[i].getTitle() + "," + go[i].getPlatform()+","+go[i].getYear()+","+go[i].getSales());
		}
		write.close();
	}
	public static void writeProfits() throws FileNotFoundException {
		SalesData[] sd = new SalesData[list.size()];
		PrintWriter write = new PrintWriter("profits.csv");
		for(int i = 0; i < sd.length; i++) {
			write.println(sd[i].getPlatform()+","+sd[i].getSales());
		}
		write.close();
	}


	public static int partition(GameObject[] games, int start, int end) {
		GameObject pivot = games[end];
		int swap = start;

		for (int i = start; i < end; i++) {
			if (games[i].compareTo(pivot) < 0) {
				GameObject temp = games[i];
				games[i] = games[swap];
				games[swap] = temp;
				swap++;
			}
		}
		games[end] = games[swap];
		games[swap] = pivot;
		return swap;

	}

	public static void quickSort(GameObject[] games, int start, int end) {
		if (start > end) {
			return;
		} else {
			int pivot = partition(games, start, end);
			quickSort(games, start, pivot - 1);
			quickSort(games, pivot + 1, end);
		}
	}
	public static void main(String[] args) throws FileNotFoundException {
		createGames();
		sortArray();
		writeSorted();
		//writeProfits();
		
	}

}
