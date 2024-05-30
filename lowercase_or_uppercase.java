//10.Write a program to check whether a character is uppercase or lowercase alphabet?

package questions;

public class lowercase_or_uppercase {

	public static void main(String[] args) {
		char letter='a';
		if (letter>='a') {
			System.out.println("lowercase");
			
		}
		else if (letter>='A') 
		{
				System.out.println("uppercase");
			
		}
		else 
		{
			System.out.println("not an alphabet");
			
		}
	
	}

}
