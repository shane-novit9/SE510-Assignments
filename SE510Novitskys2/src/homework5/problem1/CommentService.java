package homework5.problem1;

public interface CommentService {
	int createComment(int blogId, String comment);
	void deleteComment(int blogId, int commentId);
	void updateComment(int blogId, int commentId, String newComment);
}
