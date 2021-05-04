package gameSimulation.Entites;

public class Camping implements IEntity{
		private int id;
		private double discountPercentage;
		
		public Camping() {
			
		}
		public Camping(int id,double discountPercentage) {
			this.id = id;
			this.discountPercentage =discountPercentage;
		}
		
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public double getDiscountPercentage() {
			return discountPercentage;
		}
		public void setDiscountPercentage(double discountPercentage) {
			this.discountPercentage = discountPercentage;
		}
		
		
}
