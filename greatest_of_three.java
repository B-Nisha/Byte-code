//2)Greatest of three numbers using nested ternary operator

package Assignment2;

public class greatest_of_three {

	public static void main(String[] args) {
		int a=1,b=2,c=3;
		int result= a>b?(a>c?a:c):(b>c?b:c);
		System.out.println("greatest num:"+result);



	}

}
