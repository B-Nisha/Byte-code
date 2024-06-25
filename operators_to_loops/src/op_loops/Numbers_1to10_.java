//25. Write a java program to print number from 1 to 10 Except 5

package op_loops;
import java.util.Scanner;
public class Numbers_1to10_ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i=1;i<=10;i++) {
			if(i==5) {
				continue;
			}
		System.out.print(" "+i);
		}

	}

}
