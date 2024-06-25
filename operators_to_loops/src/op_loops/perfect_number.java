//68. A perfect number is a positive integer that is equal to the sum of its positive divisors, excluding the number
//itself. For instance, 6 has divisors 1, 2 and 3, and 1 + 2 + 3 = 6, so 6 is a perfect number.

package op_loops;

public class perfect_number {

	public static void main(String[] args) {
		int n=10,sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0) 
			{
				sum+=i;
			}
		}
		if(n==sum) {
			System.out.println("perfect number");
			}
		else {
			System.out.println("Not perfect number");
			
			}
		}
	
	}


