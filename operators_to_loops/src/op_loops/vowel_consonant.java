//6. Write a program to input any alphabet and check whether it is vowel or consonant.

package op_loops;
import java.util.Scanner;
public class vowel_consonant {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter an alphabet: ");
		char ch=sc.next().charAt(0);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			System.out.println("it is an vowel");
		}
		else {
			System.out.println("it is a consonant");
		}

	}

}
