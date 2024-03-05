package codings.problems;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		scanner.close();

		if (num > 0) {
			int fact = 1;
			while (num > 0) {
				fact = fact * num;
				num--;
			}
			System.out.println("Factorial of " + num + " is " + fact);

		} else {
			System.out.println("Sorry mate, factorial of a negative number : " + num + " does not exist !!");
		}

	}

}
