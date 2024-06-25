//53. Print the multiplication table of a given number. 

package op_loops;
import java.util.Scanner;
public class table_of_given_num {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the table you want");
		int table=sc.nextInt();
		for(int i=1;i<=10;i++)
		{
			System.out.println(table+"*"+i+"="+(table*i));
		}

	}

}
