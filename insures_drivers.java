//20.Check Company Insures Drivers in Java?
  // A company insures its drivers in the following cases:
   //If the driver is married
   //If the driver is unmarried, male & above 30 years of age
   //If the driver is unmarried, female & above 25 years of age


package questions;

public class insures_drivers {
			  
	public static void main(String[] args) {
		boolean isMarried = false;
		boolean isMale = true;
		int Age = 25;
		if (isMarried || (Age > 30 && isMale) || (!isMarried && !isMale && Age > 25)) {
			System.out.println("The driver is insured.");
		}
		else {
			System.out.println("The driver is not insured.");
		}

	}

}
