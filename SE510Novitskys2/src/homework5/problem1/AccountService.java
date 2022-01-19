package homework5.problem1;

public interface AccountService {
	int createUser(String first, String last, String address);
	void deleteUser(int userId);
	void updateUser(int userId, User user);
}
