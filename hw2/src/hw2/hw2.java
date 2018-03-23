package hw2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class hw2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a,b,c;
		a = scanner.nextDouble();
		b = scanner.nextDouble();
		c = scanner.nextDouble();
		scanner.nextLine();
		String line = scanner.nextLine();	
		DecimalFormat answerStyle = new DecimalFormat(line);
		double x1 = ((-b) + Math.sqrt(b * b - 4 * a * c))/2/a;
		double x2 = ((-b) - Math.sqrt(b * b - 4 * a * c))/2/a;
		
		if(x1 > x2) {
			if(x1 > 0 && x2 > 0) {
				double temp;
				temp = x2;
				x2 = x1;
				x1 = temp;
			}
			else if (x1 < 0 && x2 < 0) {	
				//do nothing
			}
			else {
				//do nothing
			}
		}
		else {
			if(x1 > 0 && x2 > 0) {
				//do nothing
			}
			else if (x1 < 0 && x2 < 0) {
				double temp;
				temp = x2;
				x2 = x1;
				x1 = temp;
			}
			else {
				double temp;
				temp = x2;
				x2 = x1;
				x1 = temp;
			}
		}
		System.out.println(answerStyle.format(x1) + "\r\n" + answerStyle.format(x2));

	}
}
