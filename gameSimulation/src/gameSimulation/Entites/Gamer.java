package gameSimulation.Entites;

public class Gamer  implements IEntity{
	
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String nationalIdentity;
	private String yearOfBirth;
	
	
	public Gamer() {
		
	}
	public Gamer  (
			int id,String firstName,
			String lastName,String email,
			String nationalIdentity,String yearOfBirth) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.nationalIdentity = nationalIdentity;
		this.yearOfBirth =yearOfBirth;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNationalIdentity() {
		return nationalIdentity;
	}
	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}
	public String getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(String yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
	
	
}
