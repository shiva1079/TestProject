package Programs;

import java.util.Scanner;

public class reversenuber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		int a, j = 0;
		a = n;
		while (a > 0) {
			j = j * 10 + a % 10;
			a = a / 10;
		}

		System.out.println("Reverse number is=" + j);

	}

}
