package hw6;

public class Comparison implements IOperation{
	public String perform(String num1, String num2) {
		if(num1.charAt(0) == '-' && num2.charAt(0) == '-') {
			num1 = num1.substring(1, num1.length());
			num2 = num2.substring(1, num2.length());
			String temp = num1;
			num1 = num2;
			num2 = temp;
		}
		else if(num1.charAt(0) == '-')
			return "-1";
		else if(num2.charAt(0) == '-')
			return "1";
		num1 = new StringBuilder(num1).reverse().toString();
		num2 = new StringBuilder(num2).reverse().toString();
		int equal = 1;
		if(num1.length() < num2.length()) {
			return "-1";
		}
		else if(num1.length() > num2.length()) {
			return "1";
		}
		else if (num1.length() == num2.length()) {
			int a, b;
			for(int i = num1.length()-1; i >= 0 ; i--) {
				a = Integer.parseInt(num1.charAt(i) + "");
				b = Integer.parseInt(num2.charAt(i) + "");
				if(b != a) {
					equal = 0;
				}
				if(a > b) {
					return "1";
				}
				if(b > a) {
					return "-1";
				}
			}
		}
		if(equal == 1)
			return "0";
		return "1";
		
		
	}
}
