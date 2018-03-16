package hw1;

public class hw1 {
	public static void main(String[] args) {
		String anString = "";
		for (int i = 0; i < args.length; ++i) {
			anString = "";
			String string = args[i];
			if (string.charAt(0) == 'a' || string.charAt(0) == 'e' || string.charAt(0) == 'i' || string.charAt(0) == 'o' || string.charAt(0) == 'u') {
				string += "ay";
				string = string.toUpperCase().charAt(0) + string.substring(1);
				anString += string;
				anString += " ";
			} else {
				string += string.charAt(0);
				string += "ay";
				string = string.substring(1);
				string = string.toUpperCase().charAt(0) + string.substring(1);
				anString += string;
				anString += " ";
			}
			System.out.print(anString);
		}
	}
}
