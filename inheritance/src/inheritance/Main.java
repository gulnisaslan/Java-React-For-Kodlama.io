package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer individualCustomer=new IndividualCustomer();
		individualCustomer.customerNumber="12356";
		
		CorporateCustomer corporateCustomer=new CorporateCustomer();
		corporateCustomer.customerNumber="78910";
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.add(corporateCustomer);
		customerManager.add(individualCustomer);
		
		
		

	}

}
