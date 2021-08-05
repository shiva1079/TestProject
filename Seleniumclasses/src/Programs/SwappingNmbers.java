package Programs;

import java.util.Scanner;

public class SwappingNmbers {
	int a, b, temp;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a numbers are");
		int a = sc.nextInt();
		int b = sc.nextInt();

		temp = a;
		a = b;
		b = temp;
		System.out.println("Swapping numbers are");
		System.out.println("a");
		System.out.println("b");

	}

}
