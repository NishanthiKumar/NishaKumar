package day6_elseifladder;

public class Task1_AcTemperture {
	public static void main(String[] args) {
		int temperture=22;
		if(temperture>=16&&temperture<=20) {
			System.out.println("Very cold weather");
		}
		else if(temperture>20&&temperture<=25) {
			System.out.println("Cold weather");
		}
		else if(temperture>25&&temperture<=30) {
			System.out.println("Normal weather");
		}
	}

}
