package curso_programacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product049;

public class aula049Predicate {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		List<Product049> list = new ArrayList<>();

		list.add(new Product049("Tv", 900.00));
		list.add(new Product049("Mouse", 50.00));
		list.add(new Product049("Tablet", 350.00));
		list.add(new Product049("HD Case", 80.90));

		list.removeIf(Product049::staticProductPredicate);

		for (Product049 p : list) {
			System.out.println(p);
		}
	}

}
