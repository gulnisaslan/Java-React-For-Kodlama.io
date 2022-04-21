package eTradeSystem.dataAccess.concretes.inMemory;


import java.util.ArrayList;
import java.util.List;

import eTradeSystem.dataAccess.abstracts.UserDao;
import eTradeSystem.entities.concretes.User;

public class InMemoryUserDao implements UserDao {
	
 List<User> users;
 
 public InMemoryUserDao() {
	this.users = new ArrayList<User>();
	
    User user1 = new User(1,"Gülnisa","Aslan","gulnisa@gulnisaslan.com","123456");
    User user2 = new User(2,"Engin","Demiroð","engin@engindemiroð.com","234567");
    User user3 = new User(3,"Merve","Deniz","merve@mervedeniz.com","345678");
    User user4 =new User(4,"Hale","Manisa","hale@halemanisa.com","678912");
    User user5 =new User(5,"Nisa","Aslan","nisa@nisaslan.com","789123");
    
    users.add(user1);
    users.add(user2);
    users.add(user3);
    users.add(user4);
    users.add(user5);
}
	
	
	
	

	@Override
	public List<User> getAll() {
		return users;
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(User user) {
		users.add(user);
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}


}
