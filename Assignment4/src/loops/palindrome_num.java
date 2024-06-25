
//program to find Palindrome Number or not
package loops;

public class palindrome_num {

	public static void main(String[] args) {
		int num=581,temp=0,r=0,rev=0;
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
		}
	}

}
