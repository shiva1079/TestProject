package Programs;

import java.util.Scanner;

public class palndrom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int a, j = 0;
		a = n;

		while (a > 0) {
			j = (j * 10) + a % 10;
			a = a / 10;

		}
		if (n == j) {
			System.out.println("palndrom num");
		} else {
			System.out.println("not palndrom num");
		}
	}

}
