package main;

public class Main {
	public static void main(String[] argc) {
		String input1 = argc[0];
		String input2 = argc[1];
		int[] n1 = new int[input1.length()];
		int[] n2 = new int[input2.length()];
		int A = 0;
		int B = 0;
		int[] count = new int[10];
		for (int i = 0; i < 10; ++i)
			count[i] = 0;

		for (int i = 0; i < input1.length(); ++i) {
			n1[i] = Integer.parseInt(input1.charAt(i) + "");
			n2[i] = Integer.parseInt(input2.charAt(i) + "");
			if (n1[i] == n2[i])
				++A;
			else
				count[n1[i]]++;
		}

		for (int i = 0; i < input1.length(); ++i) {
			if (count[n2[i]] > 0) {
				count[n2[i]]--;
				++B;
			}
		}
		System.out.println(A + "A" + B + "B");
	}
}
