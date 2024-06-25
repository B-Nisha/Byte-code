// program to find Happy Number or not.

package loops;

public class Hapy_num {

	public static void main(String[] args) {
		int num=15;
		int result=num;
		while(result!=1 && result!=4) {
			int sum=0;
			int temp=result;
			while(temp>0) {
				int r=temp%10;
				sum+=r*r;
				temp/=10;
			}
			result=sum;
		}
		if (result==1) {
			System.out.println("it ia a happy number");
		}
		else {
			System.out.println("not a happy number");
		}
		
		
			
		
		

	}

}

