//10. Write a program to calculate profit and loss on a transaction. (inputs from scanner
//class , SellingPrice and CostPrice).

package op_loops;
import java.util.Scanner;
public class Profit_loss_OnTransaction {

	public static void main(String[] args) {
		Scanner cpsp=new Scanner(System.in);
		System.out.println("to calculate profit or loss..");
		System.out.println("enter cost price:");
		int cp= cpsp.nextInt();
		System.out.println("enter selling price:");
		int sp= cpsp.nextInt();
		if (sp>cp) {
			System.out.println("profit= "+ (sp-cp));
		}
		else if(cp>sp) {
			System.out.println("loss= "+(cp-sp));
		}

	}

}
