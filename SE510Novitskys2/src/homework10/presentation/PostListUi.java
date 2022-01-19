package homework10.presentation;

import java.util.List;

import homework10.domainlogic.Post;

public class PostListUi {
	private List<Post> posts;
	
	public PostListUi(List<Post> posts) {
		this.posts = posts;
	}
	
	public void display() {
		System.out.println("\nUser: " + posts.get(0).getUserId() + "\n");
		for (Post post : posts) {
			System.out.println("PostId: " + post.getId());
			System.out.println("Subject: " + post.getSubject());
			System.out.println("Body: " + post.getBody() + "\n");
		}
	}
}
