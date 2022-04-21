package eTradeSystem.dataAccess.abstracts;

import java.util.List;

import eTradeSystem.entities.concretes.User;
 public interface UserDao {

	 List<User> getAll();
	User get(int id);
	void add(User user);
	void delete(User user);
	void update(User user);

}
