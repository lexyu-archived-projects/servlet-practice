package model;

public class UserService {
	
	private I_UserDAO userDao = new UserDAO();

	public void registUser(User user) {
		userDao.saveUser(user);
	}

	public User login(User user) {
		return userDao.queryUserByUsernameAndPassword(user.getUsername(), user.getPassword());
	}

	public boolean existsUsername(String username) {
		if (userDao.queryUserByUsername(username) == null) {
			// 等于null,说明没查到，没查到表示可用
			return false;
		}
		return true;
	}
}
