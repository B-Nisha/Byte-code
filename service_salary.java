//18.Employees Year of Service Salary Bonus in Java?


package questions;

public class service_salary {
	
	public static void main(String[] args) {
		int salary=75000;
		int years_of_service=10;
		double bonus=0;
		if(years_of_service>=5) {
			bonus=salary*0.1;
		}
		else if(years_of_service>=3) {
			bonus=salary*0.05;
		}
		else {
			bonus=0;
		}
	    double total_salary = salary + bonus;
	    System.out.println("employees salary: "+salary);
	    System.out.println("employees bonus: "+bonus);
	    System.out.println("employees total salary with bonus: "+total_salary);
	    

		}

	

	}


