package hw6;

import java.util.Scanner;


public class Addition implements IOperation{
	public static void main(String[] args) {
		Addition addition = new Addition();
		Subtraction subtraction = new Subtraction();
		Comparison comparison = new Comparison();
		String inputLine;
		String num1, num2, operation;
		Scanner scanner = new Scanner(System.in);
		inputLine = scanner.nextLine();
		String num[] = inputLine.split(" ");
		for(int i = 0; i < num.length-1; i+=2) {
			if(num[i+1].equals("+"))
				num[i+2] = addition.perform(num[i], num[i+2]); 
			if(num[i+1].equals("-"))
				num[i+2] = subtraction.perform(num[i], num[i+2]);
			if(num[i+1].equals("<"))
				num[i+2] = comparison.perform(num[i], num[i+2]);
			if(num[i+1].equals(">"))
				num[i+2] = comparison.perform(num[i+2], num[i]);
			if(num[i+1].equals("="))
				num[i+2] = comparison.perform(num[i], num[i+2]);
			
		}
		if(num[1].equals("<") || num[1].equals(">"))
			if(num[num.length-1].equals("-1"))
				System.out.println(true);
			else
				System.out.println(false);
		else if(num[1].equals("="))
			if(num[num.length-1].equals("0"))
				System.out.println(true);
			else 
				System.out.println(false);
		else 
			System.out.println(num[num.length-1]);
		
	}
	public String perform(String num1, String num2) {
		boolean negative = false;
		if(num1.charAt(0) == '-' && num2.charAt(0) == '-') {
			num1 = num1.substring(1, num1.length());
			num2 = num2.substring(1, num2.length());
			negative = true;
		}
		else if(num1.charAt(0) == '-')
			return new Subtraction().perform(num2, num1.substring(1, num1.length()));
		else if(num2.charAt(0) == '-')
			return new Subtraction().perform(num1, num2.substring(1, num2.length()));
		
		num1 = new StringBuilder(num1).reverse().toString();
		num2 = new StringBuilder(num2).reverse().toString();
		int maxlength = (num1.length() > num2.length())? num1.length() : num2.length();
		int minlength = (num1.length() < num2.length())? num1.length() : num2.length();
		int carry = 0;
		String num3 = "";
		for(int i= 0; i < minlength; ++i) {
			int a, b, c;
			a = Integer.parseInt(num1.charAt(i) + "");
			b = Integer.parseInt(num2.charAt(i) + "");
			c = a + b + carry;
			carry = 0;
			while(c >= 10) {
				c -=10;
				carry++;
			}
			num3 += c + "";
		}
		if(num1.length() > minlength) {
			for(int i = minlength; i < maxlength; ++i) {
				int a,c;
				a = Integer.parseInt(num1.charAt(i) + "");
				c = a + carry;
				carry = 0;
				while(c >= 10) {
					c -=10;
					carry++;
				}
				num3 += c + "";
			}
		}
		else if (num2.length() > minlength) {
			for(int i = minlength; i < maxlength; ++i) {
				int a,c;
				a = Integer.parseInt(num2.charAt(i) + "");
				c = a + carry;
				carry = 0;
				while(c >= 10) {
					c -=10;
					carry++;
				}
				num3 += c + "";
			}
		}
		if (carry > 0) {
			num3 += carry + "";
			carry = 0;
		}
		if(negative)
			num3 += "-";
		
		
		return new StringBuilder(num3).reverse().toString();
	}
}
