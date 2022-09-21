package day6_elseifladder;

public class Task1_MovieRating {
	public static void main(String[] args) {
		int rating=4;
		if(rating==5) {
			System.out.println("Blockbuster");
		}
		else if(rating==4) {
			System.out.println(" Very Good");
		}
		else if(rating==3) {
			System.out.println("Good");
		}
		else if(rating==2) {
			System.out.println("Average");
		}
		else if(rating==1) {
			System.out.println("Bad");
		}
	}

}
