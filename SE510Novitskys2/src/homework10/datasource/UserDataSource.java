package homework10.datasource;
import java.util.ArrayList;

import homework10.domainlogic.User;

public interface UserDataSource {
	public ArrayList<User> getAllUsers();
	public User getUserById(int userId);
	public void addUser(User user);
}
