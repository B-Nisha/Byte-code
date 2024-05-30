//17.Calculate Student Percentage and Grade in Java?


package questions;

public class percentage_grade {
	
	public static void main(String[] args) {
		int sub1=85,sub2=75,sub3=90;
		char grade=' ';
		int total=sub1+sub2+sub3;
		float percentage =total/3;
		
		if (percentage>=90) {
			grade='A';	
		}
		else if (percentage>=80) {
			grade='B';
			
		}
		else if(percentage>=70) {
			grade='C';
		}
		else if(percentage>=60) {
			grade='D';
		    
		}
		else {
			System.out.println("fail");
		
		}
		System.out.println("totalmarks:"+total);
		System.out.println("grade:"+grade);
		System.out.println("percentage:"+percentage);
		
		}
	
		

	}


