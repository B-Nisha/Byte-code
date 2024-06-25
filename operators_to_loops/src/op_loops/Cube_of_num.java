//15. Write a Java program to display the cube of the given number up to an integer.


package op_loops;
import java.util.Scanner;
public class Cube_of_num {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to find it's cube:");
		int num= sc.nextInt();
		System.out.println(num*num*num);

	}

}
