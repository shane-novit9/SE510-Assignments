package homework10.datasource;

import java.util.ArrayList;

import homework10.domainlogic.Post;

public interface PostDataSource {
	public ArrayList<Post> getPostsByUserId(int userId);
	public void addPost(Post post);
}