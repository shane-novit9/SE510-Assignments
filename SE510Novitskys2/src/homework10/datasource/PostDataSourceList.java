package homework10.datasource;

import java.util.ArrayList;

import homework10.domainlogic.Post;

public class PostDataSourceList implements PostDataSource {
	ArrayList<PostRow> postRows;
	public PostDataSourceList () {
		postRows = new ArrayList<>();
	}
	
	@Override
	public ArrayList<Post> getPostsByUserId(int userId) {
		ArrayList<Post> result = new ArrayList<>();;
		for (PostRow psotRow: postRows) {
			if (psotRow.userId == userId) {
				result.add(mapPostRowToPost(psotRow));
			}
		}
		return result;
	}
	
	@Override
	public void addPost(Post post) {
		PostRow postRow = new PostRow(post.getId(), post.getSubject(), post.getBody(), post.getUserId());
		postRows.add(postRow);
	}
	
	private Post mapPostRowToPost(PostRow postRow) {
		return new Post(postRow.id, postRow.subject, postRow.body, postRow.userId);
	}
}