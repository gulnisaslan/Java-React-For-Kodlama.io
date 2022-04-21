package eTradeSystem.consoleUI;

import eTradeSystem.businness.abstracts.UserService;
import eTradeSystem.businness.concretes.AuthManager;
import eTradeSystem.businness.concretes.UserManager;
import eTradeSystem.core.EmailLogger;
import eTradeSystem.dataAccess.concretes.inMemory.InMemoryUserDao;
import eTradeSystem.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		 UserService userService = new UserManager(new InMemoryUserDao(),new AuthManager(new InMemoryUserDao()),new EmailLogger());
	     
		 User user = new User(1,"Gülnisa","Aslan","gulnisa@gulnisaslan.com","123456");
		 
		 userService.add(user);
	}

}
