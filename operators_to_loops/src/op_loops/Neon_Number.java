//66. A neon number is a number where the sum of digits of the square of the number is equal to the number. For
//example, if the input number is 9, its square is 9*9 = 81 and the sum of the digits is 9. i.e., 9 is a neon number

package op_loops;

public class Neon_Number {

	public static void main(String[] args) {
		int num=9,square=0,digits=0,sum=0;
		square=num*num;
		while(square !=0) {
			digits=square%10;
			sum+=digits;
			square=square/10;
		}
		if(num==sum) {
			System.out.println("Neon number");
		}
		else {
			System.out.println("Not a neon number");
		}


	}

}
