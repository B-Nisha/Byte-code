package assignment_2;

public class pyramid {

	public static void main(String[] args) {
		int n=5;
		//outer loop for no.of rows
		for(int row=1;row<=n;row++) {
			//loop for spaces 
			for(int sp=1;sp<=n-row;sp++) {
				System.out.print(" ");
			}
			for (int col=1;col<=row;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}
