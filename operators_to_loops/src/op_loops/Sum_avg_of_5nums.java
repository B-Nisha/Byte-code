//55. Write a program in Java to input 5 numbers from the keyboard and find their sum and average.

package op_loops;

import java.util.Scanner;

public class Sum_avg_of_5nums {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the  any five numbers :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		int tot=a+b+c+d+e;
		int average=(tot/3);
		System.out.println("the sum of five numbers:"+tot);
		System.out.println("the average of five numbers:"+average);
	

	}

}
