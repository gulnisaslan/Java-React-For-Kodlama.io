package adapters;

import java.rmi.RemoteException;

import abstracts.CustomerCheckService;
import entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) throws RemoteException {
		KPSPublicSoap kpsPublicSoap =new KPSPublicSoapProxy();
		return kpsPublicSoap.TCKimlikNoDogrula(customer.getNationalityId(), customer.getFirstName().toUpperCase(),customer.getLastName(), customer.getDateOfBirth());
	}

}
