package assignment_2;

public class fibbonacci_series {

	public static void main(String[] args) {
		int n1=0,n2=1,n3=0,count=10;
		System.out.print(n1+" "+n2);//prints 0 and 1 as output
		for(int i=2;i<count;i++) {
			n3=n1+n2;// 0 + 1=1 ==>n3
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}

	}
	
}
