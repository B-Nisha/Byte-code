//60. A number is said to be Buzz Number if it ends with 7 or is divisible by 7. Example: 1007 is a Buzz Number

package op_loops;
import java.util.Scanner;
public class Buzz_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num=sc.nextInt();
		if(num%10==7 || num%7==0) {
			System.out.println("it is a buzz number");
		
	
	}
		else {
			System.out.println("it is not a buzz number");
		}

}
}