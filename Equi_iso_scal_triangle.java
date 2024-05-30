//15.Write a program to check whether the triangle is equilateral, isosceles or scalene triangle?


package questions;

public class Equi_iso_scal_triangle {

	public static void main(String[] args) {
		int s1=55,s2=55,s3=35;
		if (s1==s2 && s2==s3)
		{
			System.out.println("it is a equilteral triangle");
		}
		else {
			if(s1==s2||s2==s3||s3==s1)
			System.out.println("it is a isosceles triangle");
		else {
				System.out.println("it is an scalene triangle");
			}
			}
			
		}
		
		
		
	}

		


