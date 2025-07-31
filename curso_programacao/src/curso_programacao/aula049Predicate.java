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
//		Static
//		list.removeIf(Product049::staticProductPredicate);
		
//		No Static		
//		list.removeIf(Product049::nonStaticProductPredicate);
		
//		Lambda 
//		double min = 100.0;
//		Predicate<Product049> pred = (p -> p.getPrice() >= min);
//		list.removeIf(pred);
		
//		Lambda in-line		
		double min = 100.0;
		list.removeIf(p -> p.getPrice() >= min);

		for (Product049 p : list) {
			System.out.println(p);
		}
	}

}
