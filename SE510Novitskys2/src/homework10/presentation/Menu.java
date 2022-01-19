package homework10.presentation;

import java.util.Scanner;

public class Menu {
	private Scanner kb;
	public Menu(Scanner kb) {
		this.kb = kb;
	}
	public int getUserSelection() {
		displayMenu();
		return Integer.parseInt(kb.nextLine());
	}
	public String getSubject() {
		System.out.println("Enter a subject: ");
		return kb.nextLine();
	}
	public String getBody() {
		System.out.println("Enter a body: ");
		return kb.nextLine();
	}
	private void displayMenu() {
		System.out.println("1 - List all users");
		System.out.println("2 - Add user");
		System.out.println("3 - List posts by user id");
		System.out.println("4 - Add post");
		System.out.println("5 - Quit");
	}
}
