package homework10.domainlogic;

public class Post {
	private int id;
	private String subject;
	private String body;
	private int userId;
	
	public Post(int id, String subject, String body, int userId) {
		this.id = id;
		this.subject = subject;
		this.body = body;
		this.userId = userId;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
}
