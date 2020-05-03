import java.io.*;
import java.util.Scanner;

public class GameObject {
	private String title;
	private String platform;
	int year;
	double sales;

	public GameObject(String title, String platform, int year, double sales) {
		this.title = title;
		this.platform = platform;
		this.year = year;
		this.sales = sales;
	}

	public String getTitle() {
		return title;
	}

	public String getPlatform() {
		return platform;
	}

	public int getYear() {
		return year;
	}

	public double getSales() {
		return sales;
	}

	public int compareTo(GameObject other) {
		if (this.title.compareTo(other.title) > 0) {
			return 1;
		} else if (this.title.compareTo(other.title) < 0) {
			return -1;
		} else {
			if (this.platform.compareTo(other.platform) > 0) {
				return 1;
			} else if (this.platform.compareTo(other.platform) < 0) {
				return -1;
			} else {
				if (this.year < other.year) {
					return 1;
				} else if (this.year > other.year) {
					return -1;
				} else {
					if (this.sales < other.sales) {
						return 1;
					} else if (this.sales > other.sales) {
						return -1;
					} else {
						return 0;
					}
				}
			}
		}
	}
}
