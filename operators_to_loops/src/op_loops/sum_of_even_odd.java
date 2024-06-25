//74. Write a java program to print sum of all even and odd numbers using do while loop.


package op_loops;
import java.util.Scanner;
public class sum_of_even_odd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int even_sum=0;
		int odd_sum=0;
		String choice;
		
		do {
			System.out.println("Enter the number:");
			int num=sc.nextInt();
			if (num%2==0) {
				even_sum+=num;
			}
			else {
				odd_sum+=num;
			}
			System.out.println("Enter another another number? (y/n):");
			choice=sc.next();
		}while(choice.equals("y"));
		System.out.println("sum of even numbers:"+even_sum);
		System.out.println("sum of odd numbers:"+odd_sum);
		sc.close();
	}

}		