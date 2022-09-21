package day6_elseifladder;

public class B_AgeComparsion {
	public static void main(String[] args) {
		int age=15;
		if(age>=0&&age<=12) {
			System.out.println("KID");
		}
		else if(age>=13&&age<=20) {
			System.out.println("ADULT");
		}
		else {
			System.out.println("INVALID DATA");
		}
	}

}
