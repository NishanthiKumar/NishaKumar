package day6_elseifladder;

public class B_StudentResult {
	public static void main(String[] args) {
		int tamil=68;
		int english=89;
		int maths=90;
		if(tamil>english&&tamil>maths) {
			System.out.println("Tamil mark is highest");
		}
		else if(english>tamil&&english>maths) {
			System.out.println("English mark is highest");
		}
		else { 
			System.out.println("Maths mark is highest");
		}
	}

}
