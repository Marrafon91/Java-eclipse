package util;

import java.util.function.Predicate;

import entities.Product049;

public class ProductPredicate implements Predicate<Product049> {

	@Override
	public boolean test(Product049 p) {
		return p.getPrice() >= 100.0;
	}

}
