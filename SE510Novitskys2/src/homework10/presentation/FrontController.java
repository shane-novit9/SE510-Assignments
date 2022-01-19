package homework10.presentation;

import java.util.ArrayList;
import java.util.Scanner;

import homework10.domainlogic.Service;
import homework10.domainlogic.User;
import homework10.domainlogic.Post;

public class FrontController {
	private Service service;
	private Menu menu;
	private int latestId = 2;
	private int postCount = 3;
		
	public FrontController(Scanner kb, Service service) {
		this.service = service;
		menu = new Menu(kb);
	}
	public void begin() {
		boolean finished = false;
		Scanner kb = new Scanner(System.in);

		int userSelection = 0;
		while (!finished) {
			userSelection = menu.getUserSelection();
			if (userSelection == 1) {
				ArrayList<User> users = service.getAllUsers();
				UserListUi userUi = new UserListUi(kb, users); 
				userUi.display();
			}
			else if (userSelection == 2) {
				System.out.println("Enter a userName: ");
				String name = kb.next();
				System.out.println("Enter a phone number: ");
				String phone = kb.next();
				latestId++;
				User createdUser = service.createUser(latestId, name, phone);
				System.out.println("Created user " + createdUser.getId() 
									+ " named " + createdUser.getName());
			} 
			else if (userSelection == 3) {
				System.out.println("Enter currentId: ");
				int currentId = kb.nextInt();
				System.out.println("Enter the id of the user whose posts you want to view: ");
				int targetId = kb.nextInt();
				ArrayList<Post> posts = service.getPostsByUserById(targetId);
				service.handleOffensiveWords(currentId, targetId, posts);
				PostListUi postUi = new PostListUi(posts);
				postUi.display();
			}
			else if (userSelection == 4) {
				System.out.println("Enter you userId: ");
				int id = kb.nextInt();
				postCount++;
				String subject = menu.getSubject();
				String body = menu.getBody();
				Post newPost = service.createPost(postCount, subject, body, id);
				System.out.println("Created post " + newPost.getId() 
									+ " for user " + newPost.getUserId());
			}
			else if (userSelection == 5) {
				finished = true;
			}
			else { System.out.println("Enter a valid selection."); }
		}
	}
}
