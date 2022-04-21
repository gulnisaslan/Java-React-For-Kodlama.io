package abstracts;

import java.rmi.RemoteException;
import java.util.List;

import entities.Gamer;

public interface GamerService {
	
	void add(Gamer gamer) throws RemoteException;
	void update(Gamer gamer);
	void delete(Gamer gamer);
	List<Gamer> getAll();
	Gamer get();
	

}
