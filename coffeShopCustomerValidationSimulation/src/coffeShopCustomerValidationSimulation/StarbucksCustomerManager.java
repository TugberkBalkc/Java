package coffeShopCustomerValidationSimulation;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private ICustomerCheckService customerCheckService;
	
	
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	public void save(Customer customer) {
		System.out.println("(Nero Customer)");
		System.out.println("*-----Customer Saved!-----*");
		Utilities.showCustomerProfile(customer);
		customerCheckService.validate(customer);
	}

}
