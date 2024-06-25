//17. Check if a year is a leap year.


package op_loops;

public class leap_year_or_not {

	public static void main(String[] args) {
		int y=2024;
		if (y%4==0 && y%100!=0) {
			System.out.println("It is a leap year");
		}
		else {
			System.out.println("it is not a leap year");
		}
	}

}
