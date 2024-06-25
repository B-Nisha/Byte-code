package Assignment;
import java.util.Scanner;
public class Harshad_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int sum=0;
		int temp=num;
		do {
			sum+=num%10;
			num=num/10;
		}
		while(num>0);
		if(temp%sum==0) {
			System.out.println("It is a harshad number");
		}
		else {
			System.out.println("It is not a harshad number");
		}

		
	}
	

}
