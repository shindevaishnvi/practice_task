package opraters;

public class Gender {
	public static void main(String[] args) {
		int age = 7;
		if (age< 0 || age > 100) {
			System.out.println("error");
		} else if (age <= 12) {
			System.out.println("chilld");
		} else if (age <= 19) {
			System.out.println("teenager");
		} else if (age <= 59) {
			System.out.println("adult");
		} else if (age >= 60) {
			System.out.println("senior citizen");
		} else {
			System.out.println("error");
		}
	}

}
