package homework10.datasource;

public class PostRow {
	int id;
	String subject;
	String body;
	int userId;
	public PostRow(int id, String subject, String body, int userId) {
		this.id = id;
		this.subject = subject;
		this.body = body;
		this.userId = userId;
	}
}
