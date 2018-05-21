package hw3;

import java.util.Scanner;

public class hw3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		if (string.charAt(0) == 'X') {
			string = string.substring(2, string.length());
			int a = Integer.parseInt(string);
			if (a > 1) {
				while (a % 2 == 0 || a % 3 == 0 || a % 5 == 0 || a > 1) {
					if (a % 2 == 0) {
						a = a / 2;
					} else if (a % 3 == 0) {
						a = a / 3;
					} else if (a % 5 == 0) {
						a = a / 5;
					} else {
						System.out.println("false");
						break;
					}
				}
				if (a == 1) {
					System.out.println("true");
				}
			} else {
				System.out.println("false");
			}
		} else if (string.charAt(0) == 'Y') {
			string = string.substring(2, string.length());
			int n = Integer.parseInt(string);
			if (n > 0) {
				int a = 1;
				int b = 1;
				int k = 0;
				while (n != k) {
					a = b;
					while (a % 2 == 0 || a % 3 == 0 || a % 5 == 0 || a > 1) {
						if (a % 2 == 0) {
							a = a / 2;
						} else if (a % 3 == 0) {
							a = a / 3;
						} else if (a % 5 == 0) {
							a = a / 5;
						} else {
							break;
						}
					}
					if (a == 1) {
						k++;
					}
					b++;
				}
				System.out.println(b - 1);
			} else {
				System.out.println("Wrong input");
			}
		} else {
			System.out.println("Wrong Input");
		}
	}
}
