//29. Print Even Numbers from 20 to 40 Except 28, and 32.

package op_loops;

public class Even_nums_20to40 {

	public static void main(String[] args) {
		System.out.println(" The even numbers from 20 to 40 except 28 and 32 are:");
		for(int i=20;i<=40;i++) {
			if (i%2==0) {
				if(i==28 ||i==32) {
					continue;
				}
				System.out.print(" "+i);
			}
		}


	}

}
