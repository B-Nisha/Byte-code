//54.Print all the elements are divisible by a given number. 

package op_loops;
import java.util.Scanner;
public class All_divisibles_of_given_num {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		System.out.println("elements are divisible by given number");
		for(int i=1;i<=100;i++)
		{
			if(i%n==0)
			{
				System.out.print(i+ " ");
			}

	}

}
}
