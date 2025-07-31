package entities;

public class Product049 {

	private String name;
	private Double price;

	public Product049() {
	}

	public Product049(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public static boolean staticProductPredicate(Product049 p) {
		return p.getPrice() >= 100.0;
	}
	
	@Override
	public String toString() {
		return name + ", $ " + String.format("%.2f", price);
	}
}
