package abstracts;

import java.rmi.RemoteException;

import entities.Gamer;

public interface UserValidationService{

	boolean validate(Gamer gamer) throws RemoteException;
}
