package assignment_2;

public class hightestRepeatedNum {

	public static void main(String[] args) {
		int a[]= {1,4,2,1,1,5,6,1};
		int duplicates=hightestRepeatedNum(a);
		System.out.println("The hightest repeated number: "+duplicates);
	}
	
	
 public static int hightestRepeatedNum(int a[]) {
		int n=a.length;
		int[]count=new int[n];//array of integers to count no of occurences.
		int maxcount=0;
		int duplicate=0;
	
		for (int i=0;i<n;i++) {
			for (int j=i+1;j<n;j++) {
				if(a[i]==a[j]) {
					count[i]++;
		
				}
			}
			
		}
		for(int i=0;i<n;i++) {
			if (count[i]>maxcount) {
				maxcount=count[i];
				duplicate=a[i];
			}
		}
		return duplicate;
	}

}
