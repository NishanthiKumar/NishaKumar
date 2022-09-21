package day6_elseifladder;

public class Task1_GreetingTime {
	public static void main(String[] args) {
		int time=21;
		if(time>=6&&time<=11) {
			System.out.println("GOOD MORNING");
		}
		else if(time>=12&&time<=16) {
			System.out.println("GOOD AFTERNOON");
		}
		else if(time>=17&&time<=20) {
			System.out.println("GOOD EVENING");
		}
		else if(time>=21&&time<=24) {
			System.out.println("GOOD NIGHT");
		}
	}

}
