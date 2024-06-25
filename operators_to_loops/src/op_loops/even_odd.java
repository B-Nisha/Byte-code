//5. Write a program to check whether a number is even or odd

package op_loops;
import java.util.Scanner;

public class even_odd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in) ;
		System.out.println("Enter the number:");
		int n= sc.nextInt();
		
		if (n%2==0) {
			System.out.println("it is a even");
		}
		else {
			System.out.println("it is a odd");
		}

	}

}
