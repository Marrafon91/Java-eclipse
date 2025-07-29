package curso_programacao;

import java.util.ArrayList;
import java.util.List;

import entities.Product047;

public class aula047Comparator {

	public static void main(String[] args) {
		List<Product047> list = new ArrayList<>();

		list.add(new Product047("TV", 900.0));
		list.add(new Product047("Notebook", 1200.00));
		list.add(new Product047("Table", 450.0));

		list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

		for (Product047 p : list) {
			System.out.println(p);
		}
	}
}
