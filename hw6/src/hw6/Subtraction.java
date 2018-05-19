package hw6;

public class Subtraction implements IOperation{
	public String perform(String num1, String num2) {
		boolean negative = false;
		if(num1.charAt(0) == '-' && num2.charAt(0) == '-') {
			num1 = num1.substring(1, num1.length());
			num2 = num2.substring(1, num2.length());
			String temp = num1;
			num1 = num2;
			num2 = temp;
		}
		else if(num1.charAt(0) == '-') {
			num1 = num1.substring(1, num1.length());
			String num3 = new StringBuilder(new Addition().perform(num1, num2)).reverse().toString() + "-";
			return new StringBuilder(num3).reverse().toString();
		}
		else if(num2.charAt(0) == '-') {
			return new Addition().perform(num1, num2.substring(1, num2.length()));
		}
		
		num1 = new StringBuilder(num1).reverse().toString();
		num2 = new StringBuilder(num2).reverse().toString();
		int maxlength = (num1.length() > num2.length())? num1.length() : num2.length();
		int minlength = (num1.length() < num2.length())? num1.length() : num2.length();
		if(num1.length() < num2.length()) {
			String temp = num1;
			num1 = num2;
			num2 = temp;
			negative = true;
		}
		else if (num1.length() == num2.length()) {
			int a, b;
			for(int i = num1.length()-1; i >= 0 ; i--) {
				a = Integer.parseInt(num1.charAt(i) + "");
				b = Integer.parseInt(num2.charAt(i) + "");
				if(a > b) {
					break;
				}
				else if(b > a) {
					String temp = num1;
					num1 = num2;
					num2 = temp;
					negative = true;
					System.out.println("hello");
					break;
				}
			}
		}
		int carry = 0;
		String num3 = "";
		
		for(int i= 0; i < minlength; ++i) {
			int a, b, c;
			a = Integer.parseInt(num1.charAt(i) + "");
			b = Integer.parseInt(num2.charAt(i) + "");
			c = a - b + carry;
			carry = 0;
			while(c < 0) {
				c += 10;
				carry--;
			}
			num3 += c + "";
		}
		if(num1.length() > minlength) {
			for(int i = minlength; i < maxlength; ++i) {
				int a,c;
				a = Integer.parseInt(num1.charAt(i) + "");
				c = a + carry;
				carry = 0;
				while(c < 0) {
					c += 10;
					carry--;
				}
				num3 += c + "";
			}
		}
		else if (num2.length() > minlength) {
			for(int i = minlength; i < maxlength; ++i) {
				int a,c;
				a = Integer.parseInt(num2.charAt(i) + "");
				c = -a + carry;
				carry = 0;
				while(c < 0) {
					c += 10;
					carry--;
				}
				num3 += c + "";
			}
		}
		while (num3.charAt(num3.length() - 1) == '0' && num3.length() != 1) {
			num3 = num3.substring(0, num3.length()-1);
		}
		if(negative) {
			num3 += "-";
			carry = 0;
		}
		return new StringBuilder(num3).reverse().toString();
	}
}
