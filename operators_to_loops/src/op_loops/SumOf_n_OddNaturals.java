//24. Write a Java program that displays the sum of n odd natural numbers.

package op_loops;
import java.util.Scanner;
public class SumOf_n_OddNaturals {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("how many odd numbers sum you want?");
		int odds= sc.nextInt();
		int sum=0;
		int count=0;
		for(int i = 1;count<odds;i=i+2,count++) {
			sum+=i;
		}
		System.out.println(sum);


	}

}
