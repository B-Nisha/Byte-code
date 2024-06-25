//69. If a number=1234, then the reverse of the number is 4321.

package op_loops;

public class reverse_num {

	public static void main(String[] args) {
		int num=1234,temp=0,r=0,rev=0;
		temp=num;
		while(num>0) {
			r=num%10;
			rev=rev*10+r;
			num=num/10;

	}
		System.out.println("the reverse number is: "+rev);

	}

}
