//6.Write a program to check whether a year is leap year or not?

package questions;

public class leap_year {

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
