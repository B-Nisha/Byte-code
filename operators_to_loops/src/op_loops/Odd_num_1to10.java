////34.Write a program to print the odd numbers between 1 and 10, excluding multiples of 3.

package op_loops;

public class Odd_num_1to10 {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++)
		{
			if(i%2!=0 && i%3!=0) 
			{
				System.out.println(i); 	
			}
			
			
		}

		

	}

}
