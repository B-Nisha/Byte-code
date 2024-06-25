//13. Given three values representing the lengths of the three sides of a triangle, determine whether the triangle is
//regular (all three sides are equal), symmetric (two sides are equal), or irregular (no two sides are equal).


package op_loops;

public class tri_reg_irreg_symetric {

	public static void main(String[] args) {
		int s1=55,s2=55,s3=35;
		if (s1==s2 && s2==s3)
		{
			System.out.println("it is a regular triangle");
		}
		else {
			if(s1==s2||s2==s3||s3==s1)
			System.out.println("it is a symmetric triangle");
		else {
				System.out.println("it is an irregular triangle");
			}
	}

}
}
