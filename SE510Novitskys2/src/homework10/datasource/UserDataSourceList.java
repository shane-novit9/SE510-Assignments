package homework10.datasource;

import java.util.ArrayList;

import homework10.domainlogic.User;

public class UserDataSourceList implements UserDataSource {
	ArrayList<UserRow> userRows;
	public UserDataSourceList() {
		userRows = new ArrayList<>();
	}
	
	@Override
	public ArrayList<User> getAllUsers() {
		ArrayList<User> result = new ArrayList<>();
		for (UserRow row: userRows) {
			result.add(mapUserRowToUser(row));
		}
		return result; 
	}
	
	@Override
	public User getUserById(int userId) {
		User result = null;
		for (UserRow row: userRows) {
			if (row.id == userId) {
				result = new User(row.id, row.name, row.phone);
				break;
			}
		}
		return result;
	}
	
	@Override
	public void addUser(User user) {
		UserRow userRow = new UserRow(user.getId(), user.getName(), user.getPhone());
		userRows.add(userRow);
	}
	
	private User mapUserRowToUser(UserRow userRow) {
		return new User(userRow.id, userRow.name, userRow.phone);
	}
}
