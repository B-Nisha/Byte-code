//14.Write a program to input angles of a triangle and check whether triangle is valid or not?


package questions;

public class equi_triangle {

	public static void main(String[] args) {
		int s1=90,s2=60,s3=90;
		if (s1+s2+s3==180) {
			System.out.println("it is a valid triangle");
		}
		else {
			System.out.println("not a valid triangle");
		}

	}

}
