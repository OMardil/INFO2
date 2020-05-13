package parte1;

public class HotelDate {
	private int day;
	private int month;
	private int year;

	public HotelDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public static int calculateDaysBetween(HotelDate x, HotelDate y) {
		// Assume this method returns the count of days between two dates
		return 0;
	}
}