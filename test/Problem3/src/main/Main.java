package main;

import java.awt.List;
import java.util.HashSet;

public class Main {
	public static void main(String[] argc) {
		String inputstring = argc[0];
		String n[] = new String[inputstring.length()];
		for (int i = 0; i < inputstring.length(); ++i) {
			n[i] = inputstring.charAt(i) + "";
		}
		int lenght = inputstring.length();
		HashSet<String> box = new HashSet<String>();
		int key = 0;
		String temp;
		while (true) {
			String anString = "";
			for (int i = 0; i < inputstring.length(); ++i) {
				anString += n[i];
			}
			if (box.contains(anString) == false)
				box.add(anString);
			if(box.contains(new StringBuilder(anString).reverse().toString()) == false)
				box.add(new StringBuilder(anString).reverse().toString());
			else {
				break;
			}

			temp = n[key];
			n[key] = n[key + 1];
			n[key + 1] = temp;
			key++;
			if (key == lenght - 1)
				key = 0;
		}
		for (String string : box) {
			System.out.println(string);
		}
		/*
		 * abc bac bca cba cab acb abc
		 * 
		 * 9527 5927 5297 5279 2579 2759 2795 7295 7925 7952 9752 9572 9527
		 * 9527 9572 9752 7952 7925 7295 	
		 * 
		 */

	}
}
