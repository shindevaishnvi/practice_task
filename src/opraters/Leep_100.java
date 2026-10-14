package opraters;

public class Leep_100 {
	public static void main(String[] args) {
        int year = 2000;

        if (year % 400 == 0 ||
            (year % 4 == 0 && year % 100 != 0)) {

            System.out.println("Year is a leap year");

            if (year % 100 == 0) {
                System.out.println("It is a century year");
            } else {
                System.out.println("It is not a century year");
            }

        } else {
            System.out.println("Year is not a leap year");
        }
    }
}
