//58. Armstrong Number is a positive number if it is equal to the sum of cubes of its digits is called Armstrong
//number and if its sum is not equal to the number then it’s not an Armstrong number. Examples: 153 is
//Armstrong, (1*1*1) +(5*5*5) +(3*3*3) = 153

package op_loops;

public class Armstrong_number {

	public static void main(String[] args) {
		int n=153,temp=0,result=0,sum=0;
		temp=n;
		while(n>0){
			result=n%10;
			sum+=result*result*result;
			n/=10;
		}
		if(temp==sum) {
			System.out.println("Armstrong Number");
		}
		else {
			System.out.println("Not an Armstrong Number");
		}
	}

}
