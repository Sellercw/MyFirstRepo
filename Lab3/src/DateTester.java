public class DateTester{
	public static void main (String [] args){
		Date date1, date2;
		date1 = new Date();
		date2 = new Date();
		
		date1.day = 25;
		date1.month = "January";
		date1.year = 2002;

		date2.day = 25;
		date2.month = "January";
		date2.year = 2011;
		
		System.out.println("Date 1: " + date1.toString());
		System.out.println("Date 2: " + date2.toString());
		
		// Test equality
		if(date1.equals(date2) == true){
			System.out.println("Two dates are equal");
		}
		else{
		 	System.out.println("Two dates are not equal");
		}
		
		System.out.println();
		
		// change date2 year
		date2.year = 2002;
		
		System.out.println("Date 1: " + date1.toString());
		System.out.println("Date 2: " + date2.toString());

		// Test equality
		if(date1.equals(date2) == true){
			System.out.println("Two dates are equal");
		}
		else {
			System.out.println("Two dates are not equal");
		}

	}
}

