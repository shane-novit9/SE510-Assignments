package homework4.problem1;

import java.util.*;

public interface BlogSource {
	public default String getType() {
		return "default";
	}
	public default ArrayList<Blog> getBlog() {
		// Get connection to blogSource and parse through it.
		ArrayList<Blog> temp = new ArrayList<Blog>();
		return temp;
	}
}
