package curso_programacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import entities.Product049;

public class aula051Function {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product049> list = new ArrayList<>();

		list.add(new Product049("Tv", 900.00));
		list.add(new Product049("Mouse", 50.00));
		list.add(new Product049("Tablet", 350.00));
		list.add(new Product049("HD Case", 80.90));

		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

		names.forEach(System.out::println);
	}

}
