//11.Write a program to input week number and print week day?


package questions;

public class week_number {

	public static void main(String[] args) {
	int weeknum=3;
	String weekday="";
	if (weeknum==1) {
		weekday="sunday";
	}
	else if (weeknum==2) {
		weekday="monday";
	}
	else if (weeknum==3) {
		weekday="tuesday";
	}
	else if (weeknum==4) {
		weekday="wednesday";
	}
	else if(weeknum==5) {
		weekday="thursday";
	}
	else if(weeknum==6) {
		weekday="friday";
	}
	else if(weeknum==7) {
		weekday="saturday";
	}
	System.out.println(weekday);

	}
}
