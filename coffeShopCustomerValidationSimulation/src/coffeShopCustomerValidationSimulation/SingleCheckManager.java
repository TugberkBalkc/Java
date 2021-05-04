package coffeShopCustomerValidationSimulation;

public class SingleCheckManager implements ICustomerCheckService {


	public boolean validate(Customer customer) {
		if(customer.getEmail()!= "" || customer.getNationalIdentity() != "") {
			System.out.println (
					"Customer Validated! (" +
					customer.getFirstName() + 
					" " + 
					customer.getLastName() +
					")");
			System.out.println("<<**Single Check Services**>>");
			return true;
		}
		else {
			System.out.println (
					"Customer Could not Validated! (" +
					customer.getFirstName() + 
					" " + 
					customer.getLastName() +
					")");
			System.out.println("<<**Single Check Services**>>");
			return false;
		}
	}

}
