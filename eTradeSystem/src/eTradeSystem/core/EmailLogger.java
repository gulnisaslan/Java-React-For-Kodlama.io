package eTradeSystem.core;

import java.time.LocalDate;
import java.time.LocalTime;

import eTradeSystem.entities.concretes.Product;
import eTradeSystem.entities.concretes.User;

public class EmailLogger implements LoggerService {

	@Override
	public void logForSendAuthLink(User user) {
		System.out.println("Sayýn  " + user.getFirstName() + " " +user.getLastName() +
				" doðrulama baðlantýnýz gönderildi, bu baðlantýya týklayýp iþlemini tamamlayýnýz.");
	}

	@Override
	public void logForRegister(User user) {
		System.out.println("Sayýn " + user.getFirstName()+" "+user.getLastName()+" "+
	LocalDate.now()+LocalTime.now() + " tarihinde sisteme kaydoldunuz.");
		
	}

	@Override
	public void logForLogink(User user) {
		System.out.println("Sayýn " + user.getFirstName()+" "+user.getLastName()+" "+
				LocalDate.now()+LocalTime.now() + " tarihinde sisteme giriþ yaptýnýz.");
		
	}

	@Override
	public void logForSale(User user ,Product product) {
		System.out.println("Sayýn " + user.getFirstName()+" "+user.getLastName()+" "+
				LocalDate.now()+LocalTime.now() + " tarihinde " +product.getProductName() +" ürün satýn aldýnýz.");
		
	}

}
