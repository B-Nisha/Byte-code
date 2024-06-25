//26. Print Prime Numbers from 1 to 20 Except 2.

package op_loops;
import java.util.Scanner;
public class PrimeNum_1to20 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int count;
		for (int i=1;i<=20;i++) {
			count=0;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					count++;
				}
			}
		if(i==2) {
			continue;
		}
		else if(count==0) {
			System.out.println(i);
		}	
		}	

	}

}
