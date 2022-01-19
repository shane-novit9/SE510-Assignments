package homework4.problem1;

import java.util.ArrayList;

public class FancyBlogBrowser implements BlogSource{
	private ArrayList<Blog> blogs = new ArrayList<>();
	private BlogSource blogSource;

	private void display() {
		blogs = retrieveBlogs();
		for (Blog temp : blogs) {
			System.out.println(temp.toString() + "\n");
		}
		System.out.println();
	}

	public void setBlogSource(BlogSource bs) {
		this.blogSource = bs;
	}

	private ArrayList<Blog> retrieveBlogs() {
		return blogSource.getBlog();
	} 
	public void begin() {
		System.out.println("----- "  + blogSource.getType() + " database -----\n");
		this.display();
		
	}
}

	class Blog {
		String id;
		String title;
		String author;
		String body;
		Blog(String id, String title, String author, String body) {
			this.id = id;
			this.title = title;
			this.author = author;
			this.body = body;
		}
		public String toString() {
			return "[" + id + ":\n " + title + ", " + author + "-\n " + body + "]";
		}
	}
	
	

