//72. Write a program to enter the numbers till the user wants and at the end the program should display the largest
//number entered.

package op_loops;
import java.util.Scanner;

public class Display_largest_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println( "Enter the numbers:");
		int largest=sc.nextInt();
		String choice;
		
		do {
			System.out.println("enter the number:");
			int num=sc.nextInt();
			if (num>largest) {
				largest=num;
			}
			System.out.println("do you want another number? (y/n):");
			choice=sc.next();
		}
		while(choice.equals("y"));
		System.out.println("The largest number is:"+largest);
		sc.close();

	}

}
