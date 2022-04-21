package eTradeSystem.businness.concretes;

import java.util.List;

import eTradeSystem.businness.abstracts.AuthService;
import eTradeSystem.businness.abstracts.UserService;
import eTradeSystem.core.LoggerService;
import eTradeSystem.dataAccess.abstracts.UserDao;
import eTradeSystem.entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;
	private AuthService authService;
	private LoggerService loggerSevice;
	

	public UserManager(UserDao userDao, AuthService authService, LoggerService loggerSevice) {
		super();
		this.userDao = userDao;
		this.authService = authService;
		this.loggerSevice = loggerSevice;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(User user) {
		if (this.authService.register(user)==true) {
			boolean isExists =this.userDao.getAll().stream().filter(u->u.getEmail().equals(user.getEmail())).findFirst().isPresent();
			if (isExists) {
				System.out.println(user.getEmail()+" email adresine sahip kullanýcý mevcut");
				
			} else {
				this.loggerSevice.logForSendAuthLink(user);
				this.loggerSevice.logForRegister(user);
				this.userDao.add(user);
			}
		}
		else {
			System.out.println("Kullanýcý bilgileri doðru þekilde girilmedi.");
		}
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void login(String email, String password) {
		if (this.authService.login(email, password)) {
			System.out.println("Giriþ Baþarýlý");
		} else {
			System.out.println("E-posta ve þifre hatalý");
		}
		
	}

}
