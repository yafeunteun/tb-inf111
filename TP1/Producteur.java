public class Producteur {

	private String name;
	private Stock stock;

	public Producteur(String pName, Stock pStock) {
		this.name = pName;
		this.stock = pStock;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String pName) {
		this.name = pName;
	}

	public Stock getStock() {
		return this.stock;
	}

	public void produce(String pName) {
		stock.add(new Produit(pName, this));
	}

	@Override
	public String toString() {
		return "Producteur [name=" + this.getName() + ", stock=" + this.getStock() + "]";
	}
	
	 public static void main(String [] args ) {
	         Producteur prod1, prod2;
	         
	         prod1 = new Producteur("Toto", new Stock(2));
	         prod2 = new Producteur("Tata", new Stock(1));
	         prod1.produce("Thé vert");
	         prod1.produce("Tofu");
	         prod2.produce("Muelsi bio");
	         
	         System.out.println("prod1.toString()");
	         System.out.println(prod1.toString());
	         System.out.println("prod2.toString()");
	         System.out.println(prod2.toString());
	         System.out.println("prod1.setName(\"Titi (anciennement Toto\")");
	         prod1.setName("Titi (anciennement Toto");
	         System.out.println("prod1.toString()");
	         System.out.println(prod1.toString());

	      }
	
	
}
	 
