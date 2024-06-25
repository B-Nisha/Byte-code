
//program to find spy number or not
package loops;

public class Spy_num {

	public static void main(String[] args) {
		int num=143,product=1,sum=0,digit=0;
		
		while(num>0) {
			digit=num%10;
			sum=+digit;
			product=product*digit;
			num=num/10;
		}
		if(sum==product) {
			System.out.println("Spy number");
		}
		else 
	    {
			System.out.println("Not a spy number");
		}
}
}