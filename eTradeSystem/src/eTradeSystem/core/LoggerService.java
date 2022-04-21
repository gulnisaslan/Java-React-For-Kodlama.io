package eTradeSystem.core;

import eTradeSystem.entities.concretes.Product;
import eTradeSystem.entities.concretes.User;

public interface LoggerService {
	
	void logForSendAuthLink(User user);
	
	void logForRegister(User user);
	
	void logForLogink(User user);
	
	void logForSale(User user, Product product);
	

}
