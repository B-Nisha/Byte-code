//67. A palindromic number is a number that remains the same when its digits are reversed. Like 16461.

package op_loops;

public class Paliindromic_num {

	public static void main(String[] args) {
		int num=16461,temp=0,r=0,rev=0;
		temp=num;
		while(num>0) {
			r=num%10;
			rev=rev*10+r;
			num=num/10;
		}
		if(temp==rev)
			System.out.println("palindrome");
		else {
			System.out.println("not a palindrome");
			//System.out.println(rev);
		}
		//System.out.println(rev);

	}

}
