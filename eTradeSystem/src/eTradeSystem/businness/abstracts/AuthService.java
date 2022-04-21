package eTradeSystem.businness.abstracts;

import eTradeSystem.entities.concretes.User;

public interface AuthService {
	boolean register(User user);
	boolean login(String email,String password);
}
