//3. Write a program to check whether a number is negative, positive or zero.

package op_loops;
import java.util.Scanner;
public class pos_neg_zero {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println( "enter the num:");
	int n=sc.nextInt();
	if (n>0) {
		System.out.println("it is a positive");
	}
	else {
		if(n<0) {
			System.out.println("it is a negitive");
		
		}
		else {
			System.out.println("it is a zero");
		}
		
	}
	
	

	}
}

	


