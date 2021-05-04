package coffeShopCustomerValidationSimulation;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer (
				1, "Tugberk", "Balýkçý",
				"5554443322", "", "Ýstanbul",
				"tugbalikci@gmail.com"
		);
		
BaseCustomerManager neroCustomerManager = new NeroCustomerManager(new SingleCheckManager());
			neroCustomerManager.save(customer);
BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisCheckManager());
			starbucksCustomerManager.save(customer);

		
	}

}
