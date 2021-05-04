package coffeShopCustomerValidationSimulation;

public class Customer implements IEntity{
	private int id;
	private String firstName;
	private String lastName;
	private String contactNumber;
	private String nationalIdentity;
	private String city;
	private String email;
	
	
	public Customer() {
		
	}
	public Customer(
			int id,String firstName,String lastName,
			String contactNumber,String nationalIdentity,
			String city,String email) {
		
		this.id =id;
		this.firstName =firstName;
		this.lastName = lastName;
		this.contactNumber = contactNumber;
		this.nationalIdentity = nationalIdentity;
		this.city = city;
		this.email = email;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getNationalIdentity() {
		return nationalIdentity;
	}
	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
