package consoleUI;

import java.rmi.RemoteException;

import abstracts.GamerService;
import concretes.GamerManager;
import core.MernisManagerAdapter;
import entities.Gamer;

public class Main {

	public static void main(String[] args) throws RemoteException {
		Gamer gamer = new Gamer(1, 12401207636L, "Gülnisa", "Aslan",1996);
		
		GamerService gamerService = new GamerManager(new MernisManagerAdapter());
		gamerService.add(gamer);
		
		
		
		
		

	}

}
