//28. When the value of i becomes 3 and j become 2, their execution but for other values of i and j, the loop will run
//smoothly

package op_loops;

public class values_ij {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=20;j++) {
				if(i==2 || j==3) {
					continue;
		
				}
				else {
					System.out.println("i "+i);
					System.out.println("j "+j);
				}
					
					
			}
		}

	}

}
