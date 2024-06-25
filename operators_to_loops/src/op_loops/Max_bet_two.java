//1. program to find maximum between two numbers

package op_loops;
import java.util.Scanner;
public class Max_bet_two {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num1:");
		int num1=sc.nextInt();
		System.out.println("enter num2");
		int num2=sc.nextInt();
		
		if (num1>num2) {
			System.out.println("maximum num is:"+num1);
		
		}
		else {
			System.out.println("maximum num is:"+num2);
		}
		
		

	}

}
