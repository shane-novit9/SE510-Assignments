package homework10;
import java.util.ArrayList;
import java.util.Scanner;

import homework10.datasource.Repository;
import homework10.domainlogic.Service;
import homework10.domainlogic.User;
import homework10.domainlogic.Post;
import homework10.presentation.FrontController;

public class PostManagement {
	public static void main(String argv[]) {
		
		Service service = new Service(getOffensiveWords());
		Scanner kb = new Scanner(System.in);
		
		intiDb();
		
		FrontController controller = new FrontController(kb, service);
		controller.begin();
		
		kb.close();
	}
	
	private static void intiDb() {
		Repository.getInstance().saveUser(new User(1, "Smith", "6108"));
		Repository.getInstance().saveUser(new User(2, "Brown", "7774"));
		
		Repository.getInstance().savePost(new Post(1, "Restaurant review", "fooey", 2)); 
		Repository.getInstance().savePost(new Post(2, "Update", "just got back from the store", 2));
		Repository.getInstance().savePost(new Post(3, "Restaurant review", "best steak in the area! offensive", 1)); 
	}
	
	private static ArrayList<String> getOffensiveWords() {
		ArrayList<String> offensiveWords = new ArrayList<>();
		
		offensiveWords.add("offensive");
		offensiveWords.add("defensive");
		
		return offensiveWords;
	}
}
