package hw4;

import java.text.DecimalFormat;
import java.util.Scanner;

import com.sun.org.apache.regexp.internal.recompile;

public class hw4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double number = scanner.nextDouble();
		double guess = number/2;
		double newGuess = guess;
		double r;
		do {
			guess = newGuess;
			r = number/guess;
			newGuess = (guess + r)/2;
		} while (judge(guess, newGuess));
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		System.out.println(decimalFormat.format(newGuess));
	}
	
	public static boolean judge(double guess, double newGuess) {
		double r = guess - newGuess;
		if(r < 0)	r*=-1;	
		if(r/guess >= 0.01)	return true;
		return false;
	}
}
