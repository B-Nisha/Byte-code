//31. Write a java program to print multiples of 7 numbers except 56 ,49. 

package op_loops;

public class MultiplesOf_7_ex56And49 {

	public static void main(String[] args) {
		int num=7;
		for(int i=1;i*num<=100;i++)
		{
			int multiple=i*7;
			if(multiple==49 || multiple==56)
				continue;
			System.out.print(multiple+" ");
				
		}


	}

}
