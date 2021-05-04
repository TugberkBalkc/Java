package coffeShopCustomerValidationSimulation;

public class NeroCustomerManager extends BaseCustomerManager {
	
	private ICustomerCheckService customerCheckService;
	
	public NeroCustomerManager() {
		
	}
	public NeroCustomerManager(ICustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	public void save(Customer customer) {
		System.out.println("(Nero Customer)");
		System.out.println("*-----Customer Saved!-----*");
		Utilities.showCustomerProfile(customer);
		customerCheckService.validate(customer);
	}

}
