//19.Calculate Student Percentage and Print Division in Java?


package questions;

public class percentage_division {
	
	public static void main(String[] args) {
		int sub1=85,sub2=60,sub3=75;
		float total=sub1+sub2+sub3;
		float percentage=total/3;
		String division;
		if(percentage>=75) {
			division="first division";
		}
		else if(percentage>=55) {
			division="second division";
		}
		else if(percentage>=35){
			division="third division";
		}
		else {
			division="failed";
		}
		System.out.println("percentage: "+percentage);
		System.out.println("Division: "+division);


	}

}
