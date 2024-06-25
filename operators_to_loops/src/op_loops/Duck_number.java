//62. A Duck number is a number which has zeroes present in it, but there should be no zero present in the
//beginning of the number. For example, 3210.

package op_loops;

public class Duck_number {
	public static void main(String[]args){
		int sum = 3210;
        boolean isDuckNumber = false;  // Flag to indicate if the number is a duck number.

        if (sum == 0 || sum < 10) {
            System.out.println("not a duck number");
        } else {
            while (sum > 0) {
                int digit = sum % 10;  // Get last digit.
                sum = sum / 10;  // Remove last digit.

                if (digit == 0 && sum != 0) {
                    isDuckNumber = true;
                    break;  // Exit the loop as we found a zero in a non-leading position.
                }
            }

            if (isDuckNumber) {
                System.out.println("it is a duck number");
            } else {
                System.out.println("not a duck number");
            }
        }
    }
}


	