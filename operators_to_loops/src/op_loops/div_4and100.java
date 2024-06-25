//4. Write a program to check whether a number is divisible by 4 and 100 or not.

package op_loops;
import java.util.Scanner;
public class div_4and100 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		if (num%4==0 && num%100==0) {
			System.out.println("it is divisble");
		}
		else {
			System.out.println("it is not divisible");
		}

	}

}
