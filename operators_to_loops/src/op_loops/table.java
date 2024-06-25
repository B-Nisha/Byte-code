//79. Write a Java program to display the multiplication table of a given number

package op_loops;
import java.util.Scanner;
public class table {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("which table do you want: ");
		int table=sc.nextInt();
		System.out.println("enter the num of multiples: ");
		int multi=sc.nextInt();
		int i=1;
		while(i<=multi) {
			System.out.println(table+"*"+i+"="+table*i);
			i++;
		}

	}

}
