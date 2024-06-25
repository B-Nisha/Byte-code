//36. Write a program to print all even numbers from 1 to 20 using a for loops. Use the continue statement to skip
//the odd numbers.


package op_loops;

public class EvenNums_1to20_UsingLoops {

	public static void main(String[] args) {
		for(int i=1;i<=20;i++)
		{
			if(i%2!=0) {
			  continue;
			}
			System.out.print(i+" ");
		}

	}

}
