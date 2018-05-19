package hw6;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		String inputLine = "123456789";
		StringBuilder builder = new StringBuilder(inputLine);
		inputLine = builder.reverse().toString();
		System.out.println(inputLine);
		String substring = inputLine.substring(0, inputLine.length()- 1);
		System.out.println(inputLine.charAt(inputLine.length() - 1));
		System.out.println(substring);
		System.out.println(inputLine.charAt(0) == '-');
	}
}
