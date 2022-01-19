package homework5.problem1;

public interface BlogService {
	int createBlog(String title, String body);
	void deleteBlog(int blogId);
	void updateBlog(int blogId, Blog updatedBlog);
}

