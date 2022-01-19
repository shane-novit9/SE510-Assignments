package homework5.problem1;

public class BlogSite {
	public static void main(String[] args) {
		AccountService aServ = new AccountImplement();
		BlogService bServ = new BlogImplement();
		CommentService cServ = new CommentImplement();
		AccountController aCon = new AccountController(aServ);
		BlogController bCon = new BlogController(bServ);
		CommentController cCon = new CommentController(cServ);
		
		aCon.method1();
		bCon.method1();
		cCon.method1();
	}
	
}

class AccountController {
    private AccountService service;
    public AccountController(AccountService service) {
        this.service = service;
    }
    public void method1() {
        service.createUser("Shane", "Novitsky", "forest hill dr.");
        service.updateUser(0, new User());
        service.deleteUser(0);
    }
}

class BlogController {
    private BlogService service;
    public BlogController(BlogService service) {
        this.service = service;
    }
    public void method1() {
        service.createBlog("Food review", "Loved the garlic parm wing bites!");
        service.updateBlog(0, new Blog());
        service.deleteBlog(0);
    }
}

class CommentController {
    private CommentService service;
    public CommentController(CommentService service) {
        this.service = service;
    }
    public void method1() {
        service.createComment(0, "Too spicy for me :P");
        service.updateComment(0, 0, "Actually they weren't too bad.");
        service.deleteComment(0, 0);
    }
}

class User {
	private String first, last, addr;
	
	public void setName(String first, String last) {
		this.first = first;
		this.last = last;
	}
	public void setAddress(String addr) {
		this.addr = addr;
	}
	public String getName() {
		String output = "";
		output = this.first + ", " + this.last;
		return output;
	}
	public String getAddress() {
		return this.addr;
	}
}

class Blog {
	private String title, body;
	public void setTitle(String title) {
		this.title = title;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getBlog() {
		String output = "";
		output = this.title + ":\n" + this.body;
		return output;
	}
	
}
