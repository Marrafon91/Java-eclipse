package util;

import java.util.function.Function;

import entities.Product049;

public class UpperCaseName implements Function<Product049, String> {

	@Override
	public String apply(Product049 p) {
		return p.getName().toUpperCase();
	}

}
