package assignment_2;

public class harshad_number {

	public static void main(String[] args) {
		int num=156;
		int sum=0;
		int temp=num;
		do {
			sum+=num%10;
			num=num/10;
		}
		while(num>0);
		if(temp%sum==0) {
			System.out.println(" it is a harshad number");
		}
		else {
			System.out.println("it is not a harshad number");
		}
	}

}
