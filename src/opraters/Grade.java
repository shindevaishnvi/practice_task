package opraters;
public class Grade {
	public static void main(String[] args) {
		int marks = 79;
		if (marks < 0 || marks > 100) {
			System.out.println("error");
		} else if (marks >= 90) {
			System.out.println("grade A");
		} else if (marks >= 75) {
			System.out.println("grade B");
		} else if (marks >= 50) {
			System.out.println("grade C");
		} else if (marks >= 35) {
			System.out.println("grade D");
		} else {
			System.out.println("fail");
		}

	}

}
