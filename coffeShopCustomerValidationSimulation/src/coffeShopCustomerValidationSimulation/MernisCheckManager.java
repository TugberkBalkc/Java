package coffeShopCustomerValidationSimulation;

public class MernisCheckManager implements ICustomerCheckService {

	public boolean validate(Customer customer) {
				System.out.println("!!!This is a Simulation of Mernis Validation!!!");
				if(customer.getNationalIdentity() != "") {
				System.out.println (
					"Customer Validated! (" +
					customer.getFirstName() + 
					" " + 
					customer.getLastName() +
					")");
				System.out.println("<<**Mernis Check Services**>>");
				return true;
				}
				else 	{
				System.out.println (
					"Customer Could not Validated! (" +
					customer.getFirstName() + 
					" " + 
					customer.getLastName() +
					")");
				System.out.println("<<**Mernis Check Services**>>");
				return false;
			}

		}
}