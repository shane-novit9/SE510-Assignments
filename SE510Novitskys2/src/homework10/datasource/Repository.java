package homework10.datasource;

import java.util.ArrayList;

import homework10.domainlogic.Post;
import homework10.domainlogic.User;

public class Repository {
	static private Repository repository;
	
	private UserDataSource userDataSource;
	private PostDataSource postDataSource;

	
	private Repository() {
		userDataSource = new UserDataSourceList();
		postDataSource = new PostDataSourceList();
	}
	
	public static Repository getInstance() {
		if (repository == null)
			repository = new Repository();
		
		return repository;
	}
	
	public ArrayList<User> getAllUsers() {
		return userDataSource.getAllUsers();
	}
	
	public User getUserById(int id) {
		return userDataSource.getUserById(id);
	}
	
	public void saveUser(User user) {
		userDataSource.addUser(user);
	}
	
	public ArrayList<Post> getPostsByUserId(int userId) {
		return postDataSource.getPostsByUserId(userId);
	}
	
	public void savePost(Post post) {
		postDataSource.addPost(post);
	}
}
