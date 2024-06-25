//75. Write a program to enter the numbers till the user wants and at the end the program should display the
//smallest number entered.

package op_loops;
import java.util.Scanner;
public class display_small_num {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println( "Enter the numbers:");
		int smallest=sc.nextInt();
		String choice;
		
		do {
			System.out.println("enter the number:");
			int num=sc.nextInt();
			if (num<smallest) {
				smallest=num;
			}
			System.out.println("do you want another number? (y/n):");
			choice=sc.next();
		}
		while(choice.equals("y"));
		System.out.println("The smallest number is:"+smallest);
		sc.close();
		}
	}

