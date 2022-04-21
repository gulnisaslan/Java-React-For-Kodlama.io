import java.rmi.RemoteException;

import adapters.MernisServiceAdapter;
import concretes.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) throws RemoteException {
		
		Customer customer= new Customer(1,"Gülnisa","Aslan",1996,12401207636L);
	
		

		
		
		StarbucksCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(customer);
			
	}

}
