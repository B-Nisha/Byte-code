//2. Write a program to find the maximum between three numbers. 

package op_loops;
import java.util.Scanner;
public class Max_bet_three {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num1:");
		int num1=sc.nextInt();
		System.out.println("enter num2:");
		int num2=sc.nextInt();
		System.out.println("enter num3:");
		int num3=sc.nextInt();
		
		if (num1>num2) {
			if(num1>num3) {
				System.out.println("maximum num is num1:"+num1);
			}
			else {
				System.out.println("maximum num is num3:"+num3);
			}
		}
		else {
			if (num2>num3) {
				System.out.println("maximum num is num2:" +num2);
				
			}
			else {
				System.out.println("maximum num is num3:"+num3);
			}
		
			
	

		}
	}
}


