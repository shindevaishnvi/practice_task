package task_30_10;

import java.util.Scanner;

public class Parameterize_main {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter first number: ");
	        int a = sc.nextInt();

	        System.out.print("Enter second number: ");
	        int b = sc.nextInt();

	        Parameterize obj = new Parameterize();

	        int result = obj.multiply(a, b);

	        System.out.println("Multiplication: " + result);

	        sc.close();
	    }
}
