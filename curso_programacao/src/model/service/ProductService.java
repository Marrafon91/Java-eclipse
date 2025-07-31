package model.service;

import java.util.List;
import java.util.function.Predicate;

import entities.Product049;

public class ProductService {

	public double filteredSum(List<Product049> list, Predicate<Product049> criteria ) {
		double sum = 0.0;
		for (Product049 p : list) {
			if(criteria.test(p)) {
				sum += p.getPrice();
			}
		}
		return sum;
	}
}
