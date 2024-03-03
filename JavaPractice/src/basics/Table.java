package basics;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive natural number :: ");
		int num = sc.nextInt();
		sc.close();
		for (int i = 1; i <= 10; i++) {
			System.out.println(num + " * " + i + " = " + num * i); // 2 * 4 = 8
		}
	}

}
