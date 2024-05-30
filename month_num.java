//12.Write a program to input month number and print month Name?


package questions;

public class month_num {

	public static void main(String[] args) {
		int month_num=10;
		String month_name="";
		if (month_num==1) {
			month_name="Jan";
		}
		else if (month_num==2) {
			month_name="feb";
		}
		else if (month_num==3) {
			month_name="march";
		}
		else if (month_num==4) {
			month_name="april";
		}
		else if (month_num==5) {
			month_name="may";
		}
		else if (month_num==6) {
			month_name="june";
		}
		else if (month_num==7) {
			month_name="july";
		}
		else if (month_num==8) {
			month_name="august";
		}
		else if (month_num==9) {
			month_name="september";
		}
		else if (month_num==10) {
			month_name="october";
		}
		else if (month_num==11) {
			month_name="november";
		}
		else if (month_num==12) {
			month_name="december";
		}
		System.out.println(month_name);
}
}