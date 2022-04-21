package eTradeSystem.businness.concretes;

import eTradeSystem.businness.abstracts.AuthService;
import eTradeSystem.core.Utils;
import eTradeSystem.dataAccess.abstracts.UserDao;
import eTradeSystem.entities.concretes.User;

public class AuthManager implements AuthService{
	
	private UserDao userDao;

	public AuthManager(UserDao userDao) {
	
		this.userDao = userDao;
	}

	@Override
	public boolean register(User user) {
		
		if (user.getFirstName()==null&&user.getLastName()==null&&
				user.getPassword()==null&&user.getEmail()==null) {
			System.out.println("Kullanýcýnýn adý, soyadý,email ve þifre alaný zorunludur");
			return false;
		}
		if (user.getPassword().length()<6) {
			System.out.println("Parola en az 6 karakter olmalýdýr.");
			return false;
		}
		if (Utils.match(user.getEmail())==false) {
			System.out.println("Eposta , eposta formatýnda olmalýdýr.");
		}
		if (user.getFirstName().length()<2&&user.getLastName().length()<2) {
			System.out.println("Ad ve soyad en az iki karakterden oluþmalýdýr.");
			return false;
		}
		return true;
	}

	@Override
	public boolean login(String email, String password) {
		
		this.userDao.getAll();
		boolean isEmailExist = this.userDao.getAll().stream().filter(user->user.getEmail().equals(email)).findFirst().isPresent();
		boolean isPasswordExists = this.userDao.getAll().stream()
				.filter(user->user.getPassword().equals(password)).findFirst().isPresent();
		if (isEmailExist==true&&isPasswordExists==true) {
			return true;
		}
		else {
			return false;
		}
				
		
	}

}
