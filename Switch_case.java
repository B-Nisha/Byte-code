package question;

public class Switch_case {

	public static void main(String[] args) {
		int year=3;
		String branch="mech";
		switch(year) {
		case 1:
			System.out.println("math,beee,c");
			break;
		case 2:
			switch(branch) {
			case "cse" :
				System.out.println("java,cns,os,ds");
				break;
			case "Ece":
				System.out.println("dld,physics,analog,digital");
				break;
			case "civil":
				System.out.println("construction,geotechnical, environment");
				break;
			case "mech":
				System.out.println("fliud mech, thermodynamics,chemistry");
				break;
			default:
				System.out.println("artificial intelligence");
				}
			break;
		case 3:
			switch(branch) {
			case "cse":
				System.out.println("dbms,data structures,python");
				break;
			case "Ece":
				System.out.println("semiphysics,integrated electronics");
				break;
			case "civil":
				System.out.println("hydrailics,surveying,water resources");
				break;
			case "mech":
				System.out.println("solid mechanics,kinametics,design");
				break;
			default:
				System.out.println("artificial intelligence");
			
			}
			break;
		case 4:
			switch(branch) {
			case "cse":
				System.out.println("data structures,python");
				break;
			case "Ece":
				System.out.println("semiphysics,integrated electronics");
				break;
			case "civil":
				System.out.println("hydrailics,surveying,water resources");
				break;
			case "mech":
				System.out.println("solid mechanics,kinametics,design");
				break;
			default:
				System.out.println("Artificial intelligence");
			
			}
			break;
		default:
			System.out.println("enter a valid year");
		}
	}
		
}		
		

	


