
public class testDate {

	public static void main(String[] args) {
		Date x = new Date();
		Date y = new Date();
		x.day = 11;
		x.month = "Feb";
		x.year = 2020;
		
		System.out.println(x.toString());
		y.day = 10;
		y.month = "Feb";
		y.year = 2020;
		System.out.println(y.toString());
		System.out.println(x.equal(y));

	}

}
