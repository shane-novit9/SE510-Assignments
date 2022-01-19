package homework10.presentation;

import java.util.List;
import java.util.Scanner;

import homework10.domainlogic.User;

public class UserListUi {
	private Scanner kb;
	private List<User> users;
	public UserListUi(Scanner kb, List<User> users) {
		this.kb = kb;
		this.users = users;
	}
	public void display() {
		// display users
		System.out.println();
		for (User u : users) {
			System.out.println(u.getName() + ", " 
							+ u.getPhone() + ", " + u.getId());
		}
		System.out.println();
	}
}
