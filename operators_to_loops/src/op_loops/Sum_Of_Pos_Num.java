//73. Print Sum of positive numbers using do while loop.


package op_loops;
import java.util.Scanner;
public class Sum_Of_Pos_Num {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum_pos=0;
		String choice="";
		
		do {
			System.out.println("enter the number:");
			int num=sc.nextInt();
			if(num>=0) {
				sum_pos+=num;
			}
			else {
				if(num<0) {
					System.out.println("enter positive number:");
				}
			}
			System.out.println("do you want another number? (y/n)");
			choice=sc.next();
			
		}
		while(choice.equals("y"));
		System.out.println("the sum of positive numbers is:"+sum_pos );
		sc.close();
		
		
	}
}
		


