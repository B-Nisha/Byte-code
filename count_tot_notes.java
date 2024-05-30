//13.Write a program to count total number of notes in given amount?

package questions;

public class count_tot_notes {

	public static void main(String[] args) {
		int amount=3000;
		int n2000=0,n1000=0,n500=0,n100=0,n50=0,n20=0,n10=0,n5=0,n2=0,n1=0;
		if (amount>=2000) {
			n2000=amount/2000;
			amount=amount-n2000*2000;
		}
		if (amount>=1000) {
			n1000=amount/1000;
			amount=amount-n1000*1000;
		}
		if (amount>=500) {
			n500=amount/500;
			amount=amount-n500*500;
		}
		if (amount>=100) {
			n100=amount/100;
			amount=amount-n100*100;
		}
		if (amount>=50) {
			n50=amount/50;
			amount=amount-n50*50;
		}
		if (amount>=20) {
			n20=amount/20;
			amount=amount-n20*20;
		}
		if (amount>=10) {
			n10=amount/10;
			amount=amount-n10*10;
		}
		if (amount>=5) {
			n5=amount/5;
			amount=amount-n5*5;
		}
		if(amount>=2) {
			n2=amount/2;
			amount=amount-n2*2;
		}
		if (amount>=1) {
			n1=amount/1;
			amount=amount-n1*1;
		}
		System.out.println("num of 2000 notes:"+n2000);
		System.out.println("num of 1000 notes:"+n1000);
		System.out.println("num of 500 notes:"+n500);
		System.out.println("num of 100 notes:"+n100);
		System.out.println("num of 50 notes:"+n50);
		System.out.println("num of 20 notes:"+n20);
		System.out.println("num of 10 notes:"+n10);
		System.out.println("num of 5 notes:"+n5);
		System.out.println("num of 2 notes:"+n2);
		System.out.println("num of 1 notes:"+n1);
		
	
	}

}
