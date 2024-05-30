//25.Write a java program that accepts three numbers from the user and check if numbers are in "increasing" or "decreasing" order


package questions;

public class increasing_or_decreasing {

	public static void main(String[] args) {
		int num1=15,num2=30,num3=45;
		if(num1<num2 &&num2<num3) {
			System.out.println("numbers are in the increasing order");
		}
		else if (num1>num2 && num2>num3) {
	        System.out.println("The numbers are in decreasing order");
	    }
		else {
			System.out.println("numbers are not in increasing or decresing order");
		}

	}

}