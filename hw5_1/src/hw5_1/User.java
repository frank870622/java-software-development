package hw5_1;

import java.util.Scanner;

import com.sun.webkit.dom.DocumentImpl;

public class User {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String mode = scanner.nextLine();
		String type = scanner.nextLine();
		if(type.equals("Document")) {
			Document document = new Document();
			document.setText(scanner.nextLine());
			if(mode.equals("A")) {
				System.out.println(document.toString());
			}
			else if (mode.equals("B")) {
				String keyWord = scanner.nextLine();
				if(document.toString().contains(keyWord)) {
					System.out.println(true);
				}
				else {
					System.out.println(false);
				}
			}
			else if (mode.equals("C")) {
				String update = scanner.nextLine();
				if(update.equals("text")) {
					document.setText(scanner.nextLine());
				}
				else {
					System.out.println("Wrong Input (maybe because space)");
				}
				System.out.println(document.toString());
			}
			else {
				System.out.println("Wrong Input (maybe because space)");
			}
		}
		else if (type.equals("Email")) {
			Email email = new Email();
			email.setSender(scanner.nextLine());
			email.setRecipient(scanner.nextLine());
			email.setTitle(scanner.nextLine());
			email.setText(scanner.nextLine());
			if(mode.equals("A")) {
				System.out.println(email.toString());
			}
			else if (mode.equals("B")) {
				String keyWord = scanner.nextLine();
				if(email.toString().contains(keyWord)) {
					System.out.println(true);
				}
				else {
					System.out.println(false);
				}
			}
			else if (mode.equals("C")) {
				String update = scanner.nextLine();
				if(update.equals("text")) {
					email.setText(scanner.nextLine());
				}
				else if (update.equals("sender")) {
					email.setSender(scanner.nextLine());
				}
				else if (update.equals("recipient")) {
					email.setRecipient(scanner.nextLine());
				}
				else if (update.equals("title")) {
					email.setTitle(scanner.nextLine());
				}
				else {
					System.out.println("Wrong Input (maybe because space)");
				}
				System.out.println(email.toString());
			}
			else {
				System.out.println("Wrong Input (maybe because space)");
			}
		}
		else if (type.equals("File")) {
			File file = new File();
			file.setPathname(scanner.nextLine());
			file.setText(scanner.nextLine());
			if(mode.equals("A")) {
				System.out.println(file.toString());
			}
			else if (mode.equals("B")) {
				String keyWord = scanner.nextLine();
				if(file.toString().contains(keyWord)) {
					System.out.println(true);
				}
				else {
					System.out.println(false);
				}
			}
			else if (mode.equals("C")) {
				String update = scanner.nextLine();
				if(update.equals("text")) {
					file.setText(scanner.nextLine());
				}
				else if (update.equals("pathname")) {
					file.setPathname(scanner.nextLine());
				}
				else {
					System.out.println("Wrong Input (maybe because space)");
				}
				System.out.println(file.toString());
			}
			else {
				System.out.println("Wrong Input (maybe because space)");
			}
		}
		else {
			System.out.println("Wrong Input (maybe because space)");
		}
		
		
	}
}
