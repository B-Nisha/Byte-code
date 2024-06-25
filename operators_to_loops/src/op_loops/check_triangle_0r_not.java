//9.Write a program to check whether a triangle can be formed by the given value for the angles.(3 angles sum should be 180 , );


package op_loops;
import java.util.Scanner;
public class check_triangle_0r_not {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter three angles of a triangle:");
		int angle1= sc.nextInt();
		int angle2=sc.nextInt();
		int angle3= sc.nextInt();
		if (angle1+angle2+angle3==180) {
			System.out.println("triangle can be formed with given angles");	
		}
		else {
			System.out.println("triangle cannot be formed");
		}


	}

}
