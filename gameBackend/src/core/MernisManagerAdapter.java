package core;

import java.rmi.RemoteException;

import abstracts.UserValidationService;
import entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisManagerAdapter implements UserValidationService{
	
	@Override
	public boolean validate(Gamer gamer) throws RemoteException{
		
		KPSPublicSoap kpsPublicSoap = new KPSPublicSoapProxy();
		
		
		return kpsPublicSoap.TCKimlikNoDogrula(gamer.getNationalId(), gamer.getGamerName().toUpperCase(), 
				gamer.getGamerSurname(), gamer.getBirthYear());
		
	}
}
