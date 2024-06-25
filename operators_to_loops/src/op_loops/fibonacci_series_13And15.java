//30. Write a java program to print 10 Fibonacci numbers skip 13 and 35.

package op_loops;

public class fibonacci_series_13And15 {

	
	public static void main(String[] args) {
		int num1=0, num2=1;
		for (int i=0;i<=10;i++) {
			if(num1==13 || num1==35) {
				int num3= num1+num2;
				num1=num2;
				num2=num3;
				continue;
			}
			System.out.print(num1+ " ");
			int num3=num1+num2;
			num1=num2;
			num2=num3;

		}


	}

}
