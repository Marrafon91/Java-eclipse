package application;

import java.util.Comparator;

import entities.Product047;

public class aula047MyComparator implements Comparator<Product047> {

	@Override
	public int compare(Product047 p1, Product047 p2) {
		return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
	}

}
