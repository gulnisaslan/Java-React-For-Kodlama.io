package concretes;

import java.rmi.RemoteException;
import java.util.List;

import abstracts.GamerService;
import abstracts.UserValidationService;
import entities.Gamer;

public class GamerManager implements GamerService {

	private UserValidationService userValidationService;

	public GamerManager(UserValidationService userValidationService) {
		this.userValidationService = userValidationService;
	}

	@Override
	public void add(Gamer gamer) throws RemoteException {
		if (this.userValidationService.validate(gamer)) {
			System.out.println(gamer.getGamerName() + " veritabanýna eklendi");
		} else {
			System.out.println(gamer.getGamerName() + " veritabanýna eklenemedi, " + "bilgilerini kontrol edin");
		}

	}

	@Override
	public void update(Gamer gamer) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Gamer gamer) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Gamer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Gamer get() {
		// TODO Auto-generated method stub
		return null;
	}

}
