package model;

public interface I_UserDAO {
	
	User queryUserByUsername(String username);
	
    User queryUserByUsernameAndPassword(String username,String password);
    
    int saveUser(User user);

}
