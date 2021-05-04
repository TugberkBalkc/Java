package coffeShopCustomerValidationSimulation;

public class Utilities {
		public static final void showCustomerProfile(Customer customer) {
			System.out.println("-----" + customer.getNationalIdentity() + "-----");
			System.out.println("First Name : " + customer.getFirstName());
			System.out.println("Last Name : " + customer.getLastName());
			System.out.println("Id :" + customer.getId());
			System.out.println("Email : " + customer.getEmail());
			System.out.println("City : " + customer.getCity());
			System.out.println("Contact Number : " + customer.getContactNumber());
		}
}
