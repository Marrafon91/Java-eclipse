package util;

import java.util.function.Consumer;

import entities.Product049;

public class PriceUpdate implements Consumer<Product049> {

	@Override
	public void accept(Product049 p) {
		p.setPrice(p.getPrice() * 1.1);
	}

}
