//21.Calculate Total Electricity Bill in Java?


package questions;

public class Eletricity_bill {
	
	public static void main(String[] args) {
		int units=100;
		float bill;
		if(units>=50 && units<=100) {
			bill=units*1.0f;
		}
		else if (units>=100 && units<=200) {
			bill=units*2.0f;
		}
		else if (units>=200 && units<=300) {
			bill=units*3.0f;
		}
		else {
			bill=500;
		}
		System.out.println("total bill: "+bill);

	}

}
