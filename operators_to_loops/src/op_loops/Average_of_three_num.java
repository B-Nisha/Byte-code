//78. Write a java program to print the average of numbers entered by the user.

package op_loops;
import java.util.Scanner;

public class Average_of_three_num {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  any three numbers :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int tot=a+b+c;
		int average=(tot/3);
		System.out.println("the sum of three numbers:"+tot);
		System.out.println("the average of three numbers:"+average);
	}

}
