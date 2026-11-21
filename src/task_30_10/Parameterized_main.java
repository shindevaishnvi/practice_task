package task_30_10;

import java.util.Scanner;

public class Parameterized_main {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        Parameterized obj = new Parameterized();

        obj.add(a, b);

        sc.close();
    }
}
