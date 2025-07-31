package curso_programacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product049;

public class aula050Consumer {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		List<Product049> list = new ArrayList<>();

		list.add(new Product049("Tv", 900.00));
		list.add(new Product049("Mouse", 50.00));
		list.add(new Product049("Tablet", 350.00));
		list.add(new Product049("HD Case", 80.90));

//		Method static		
//		list.forEach(Product049::staticPriceUpdate);
//		Method nao static
//		list.forEach(Product049::nonStaticPriceUpdate);
//		
		double factor = 1.1;
//		lambda
//		Consumer <Product049> cons = p -> p.setPrice(p.getPrice() * factor);
		
//		lambda in-line		
		list.forEach(p -> p.setPrice(p.getPrice() * factor));

		list.forEach(System.out::println);
	}

}
