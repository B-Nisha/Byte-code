//22.Find Youngest Age in Three in Java?

package questions;

public class youngest_age {

	public static void main(String[] args) {
		int a=52,b=34,c=42;
		int youngest_age=a;//52
		if(b<youngest_age) {
	      youngest_age=b;//34
		}
		if(c<youngest_age) {
			youngest_age=c;//42
			
		}
		System.out.println("youngest age: "+youngest_age);
			

	}

}