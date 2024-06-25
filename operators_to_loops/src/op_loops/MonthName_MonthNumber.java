//12. Write a program in to read any Month Number in integer and display Month name in
//the word. (use case statement ).


package op_loops;
import java.util.Scanner;
public class MonthName_MonthNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a month number:");
		int num=sc.nextInt();
		String month="";
		switch(num){
		case 1:
			month="january";
			break;
		case 2:
			month="february";
			break;
		case 3:
			month="march";
			break;
		case 4:
			month="april";
			break;
		case 5:
			month="may";
			break;
		case 6:
			month="june";
			break;
		case 7:
			month="july";
			break;
		case 8:
			month="august";
			break;
		case 9:
			month="september";
			break;
		case 10:
			month="october";
			break;
		case 11:
			month="november";
			break;
		case 12:
			month="december";
			break;
		default:
			System.out.println("month number should be in-between 1 to 12");
		}
		System.out.println(month);


	}

}
