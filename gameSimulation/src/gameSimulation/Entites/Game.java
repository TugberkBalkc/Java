package gameSimulation.Entites;

public class Game implements IEntity {
	
	private int id;
	private String name;
	private String details;
	private double price;
	private double priceAfterDiscount;
	
	public Game() {
		
	}
	public Game(int id, String name, String details, double price) {
		this.id = id;
		this.name = name;
		this.details = details;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPriceAfterDiscount() {
		return priceAfterDiscount;
	}
	public void setPriceAfterDiscount(double priceAfterDiscount) {
		this.priceAfterDiscount =  priceAfterDiscount;
	}

}
