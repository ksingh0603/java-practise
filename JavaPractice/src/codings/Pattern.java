package codings;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive natural number :: ");
		int num = sc.nextInt();
		for(int i=1; i<=num; i++) {
		for(int j=1;j<=i; j++) {
			System.out.print(i);
		}
		System.out.println("#");
		
		}

	}

}
