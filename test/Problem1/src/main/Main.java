package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int p = Integer.parseInt(scanner.nextLine());
		int q = Integer.parseInt(scanner.nextLine());
		String[] inputstring = scanner.nextLine().split(" ");
		int[] n = new int[p];
		for(int i=0; i<p; ++i) {
			n[i] = Integer.parseInt(inputstring[i]);
		}
		int ans = 0;
		for(int i=0; i<p;++i) {
			ans += Math.pow(n[i], q);
		}
		System.out.println(ans);
	}
}
