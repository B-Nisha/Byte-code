//program to print Reverse Number 

package loops;

public class Reverse_num {

	public static void main(String[] args) {
		int num=165,temp=0,r=0,rev=0;
		temp=num;
		while(num>0) {
			r=num%10;
			rev=rev*10+r;
			num=num/10;

	}
		System.out.println("the reverse number is:"+rev);

}
}