///45.Write a Java program that reads a positive integer and counts the number of digits.

package op_loops;
import java.util.Scanner;
public class Num_of_digit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the positive number");
		int num=sc.nextInt();
		int count=0;
        while(num!=0)
        {
        	num=num/10;
        	count++;
        }
        System.out.println(count);


	}

}
