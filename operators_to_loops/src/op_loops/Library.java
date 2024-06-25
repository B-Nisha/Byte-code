//43. A library charges a fine for every book returned late. For the first 5 days the fine is 50 paise, for 6-10 days fine
//is one rupee and above 10 days fine is 5 rupees. If you return the book after 30 days your membership will be
//canceled. Write a program to accept the number of days the member is late to return the book and display the
//fine or the appropriate message.


package op_loops;
import java.util.Scanner;
public class Library {

	public static void main(String[] args) {
		
			Scanner lib= new Scanner(System.in);
			System.out.println("enter the no.of days the member is late to return book:");
			int late_days= lib. nextInt();
			String message=" ";
			if(late_days>=1 && late_days<=5) {
				message= "fine: 50 paise";
			}
			else if(late_days>5 && late_days<=10) {
				message= "fine: 1 rupee";
			}
			else if(late_days>10 && late_days<30 ) {
				message= "fine: 5 rupees";
			}
			else if(late_days>=30) {
				message= "your membership is cancelled.";
			}
			else {
				message="no fine";
			}
			System.out.println(message);

	}

}
