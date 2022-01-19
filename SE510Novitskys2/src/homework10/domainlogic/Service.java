package homework10.domainlogic;

import java.util.ArrayList;

import homework10.datasource.Repository;

public class Service {	
	ArrayList<String> offensiveWords;
	
	public Service(ArrayList<String> offensiveWords) {
		this.offensiveWords = offensiveWords;
	}
	
	public ArrayList<User> getAllUsers() {
		return Repository.getInstance().getAllUsers();
	}
	
	public User getUserById(int id) {
		return Repository.getInstance().getUserById(id);
	}
	
	public User createUser(int id, String name, String phone) {
		User user = new User(id, name, phone);
		Repository.getInstance().saveUser(user);
		return user;
	}
	
	public ArrayList<Post> getPostsByUserById(int userId) {
		return Repository.getInstance().getPostsByUserId(userId);
	}
	
	public Post createPost(int id, String subject, String body, int userId ) {
		Post post = new Post(id, subject, body, userId);
		Repository.getInstance().savePost(post);
		return post; 
	}
	
	public void handleOffensiveWords(int cId, int tId, ArrayList<Post> posts) {
		if (cId == tId) { // User looking at their own posts
			for (Post p : posts) {
				for (String offense : offensiveWords) {
					if (p.getBody().contains(offense)) {
						p.setBody(p.getBody().replaceAll(offense, "!" + offense + "!"));
					}
				}
			}
		} else {
			for (Post p : posts) {
				for (String offense : offensiveWords) {
					if (p.getBody().contains(offense)) {
						p.setBody(p.getBody().replaceAll(offense, "*****"));
					}
				}
			}
		}
	}
}
