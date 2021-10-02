public class Leap_year {

	public static void main(String[] args) {
		
		int min = 1499; int max = 2101;
		int year = randomYear(min, max);
		System.out.println("Year: " + year);
		boolean isLeapYear = isLeapYear(year);
		if (isLeapYear) {
			System.out.println("The year " + year + " is a leap year");
		} else {
			System.out.println("The year " + year + " is not a leap year");
		}
	}

	public static int randomYear(int max, int min) {
		int year = (int)Math.floor(Math.random()*(max-min+1)+min);
		return year;
	}

	public static boolean isLeapYear(int year) {
		if(year%4==0) {
			return true;
		}
		else {
			return false;
		}
	}
}