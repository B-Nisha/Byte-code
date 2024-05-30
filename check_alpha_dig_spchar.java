//9.Write a program to input any character and check whether it is alphabet, digit or special character?


package questions;

public class check_alpha_dig_spchar {

	public static void main(String[] args) {
		char letter='#';
		if (letter>='a' || letter>='A') 
		{
		System.out.println("it is an alphabet");	
		}
		else if (letter>='0' && letter<='9')
		{
			System.out.println("it is a digit");
		}
		else {
			System.out.println("it is a special character");
		}
			

	}

}
