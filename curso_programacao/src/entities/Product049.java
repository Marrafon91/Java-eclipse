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

//  aula049
//	public static boolean staticProductPredicate(Product049 p) {
//		return p.getPrice() >= 100.0;
//	}
//  aula049
//	public boolean nonStaticProductPredicate() {
//		return price >= 100.0;
//	}

	public static void staticPriceUpdate(Product049 p) {
		p.setPrice(p.getPrice() * 1.1);
	}
	
	public void nonStaticPriceUpdate() {
		price = price * 1.1;
	}

	@Override
	public String toString() {
		return name + ", $ " + String.format("%.2f", price);
	}
}
