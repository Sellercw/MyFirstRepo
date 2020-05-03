
public class SalesData {
	private String platform;
	private int sales;
	public SalesData(String platform,int sales) {
		this.platform = platform;
		this.sales = sales;
		
	}
	public String getPlatform() {
		return platform;
	}
	public int getSales() {
		return sales;
	}
	public void setSales(int sales) {
		this.sales = sales;
	}
	public int compareTo(SalesData other) {
		if(this.sales<other.sales) {
			return 1;
		} else {
			return -1;
		}
	}
}
