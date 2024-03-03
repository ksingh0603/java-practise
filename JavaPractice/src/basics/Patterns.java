package basics;

import java.util.Scanner;

public class Patterns {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive natural number :: ");
		int num = sc.nextInt();
		sc.close();
		for (int i = 1; i <= num; i++) {
			System.out.println(i);
		}
	}

}
