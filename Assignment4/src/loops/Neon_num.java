//program to find Neon Number or not.

package loops;

public class Neon_num {

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
