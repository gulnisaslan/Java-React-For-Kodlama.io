package eTradeSystem.businness.abstracts;

import java.util.List;

import eTradeSystem.entities.concretes.User;
public interface UserService {
	
	List<User> getAll();
	User get(int id);
	void add(User user);
	void delete(User user);
	void update(User user);
	void login(String email,String password);
	
	
	

}
